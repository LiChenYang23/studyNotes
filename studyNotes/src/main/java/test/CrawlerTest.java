package test;

import bean.JsonBean;
import com.alibaba.fastjson.JSON;
import com.csvreader.CsvWriter;
import com.google.common.collect.Lists;
import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class CrawlerTest {

    private OkHttpClient okHttpClient;

    @Test
    public void test1(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectionPool(new ConnectionPool(600, 5, TimeUnit.SECONDS))
                .connectTimeout(1, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS);
        okHttpClient = builder.build();
        List<String> coinType = Arrays.asList("f_usd_btc", "f_usd_ltc", "f_usd_eth", "f_usd_etc", "f_usd_xrp", "f_usd_eos", "f_usd_trx", "f_usd_bch", "f_usd_bsv");
        int totalPages = getTotalPages("f_usd_bsv");
        if (totalPages > 0){
            toCountExcel(totalPages,"f_usd_bsv");
        }else {
            System.out.println("f_usd_btc下totalPages为0");
        }
    }

    private void toCountExcel(int totalPages, String coin) {
        List<JsonBean.DataBean.FutureRiskWeekBean> quanOrders = CralerDateList(totalPages,coin);
        Collections.reverse(quanOrders);
        Field[] declaredFields = JsonBean.DataBean.FutureRiskWeekBean.class.getDeclaredFields();
        ArrayList<String[]> quanOrderArrays = new ArrayList<>();
        quanOrders.stream().forEach(f -> {
            String[] objectArrays = objectToStringArray(declaredFields, f);
            quanOrderArrays.add(objectArrays);
        });
        String fileName = coin + getCurrentTimeStr() + ".csv";
        String csvFilePath = "/Users/lichenyang/Download/" + fileName;
        // 创建CSV写对象 例如:CsvWriter(文件路径，分隔符，编码格式);
        CsvWriter csvWriter = new CsvWriter(csvFilePath, ',', Charset.forName("UTF-8"));
        // 写表头
        String[] csvHeaders = {"amount(交割合约风险准备金余额)","contractId(合约ID)","contractType(合约类型)","createDate(创建时间)"
                ,"dayOffset","id","symbol","type(1:分摊使用，2：强平剩余注入)","value(此次添加金额)"};
        try {
            csvWriter.writeRecord(csvHeaders);
            // 写内容
            for (String[] buyOrderArray : quanOrderArrays) {
                csvWriter.writeRecord(buyOrderArray);
            }
            csvWriter.close();
            File file = new File(csvFilePath);
            String utf8NoBomFileName = coin + getCurrentTimeStr() + "1" + ".csv";
            File utf8NoBomFile = new File("/Users/lichenyang/Download/" + utf8NoBomFileName);
            CharacterCovertUtil.turnUTF8withoutBOM(file, utf8NoBomFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<JsonBean.DataBean.FutureRiskWeekBean> CralerDateList(int totalPages, String coin) {
        List<JsonBean.DataBean.FutureRiskWeekBean> arrayList = Lists.newArrayList();
        for (int i = 1; i <= totalPages; i++) {
            FormBody formBody = new FormBody.Builder()
                    .add("currentPage", String.valueOf(i))
                    .add("symbol", coin)
                    .build();
            long timestamp = System.currentTimeMillis();
            final Request request = new Request.Builder()
                    .url("https://www.okex.com/v2/futures/pc/public/futureRiskPreparationRecord.do?t=" + timestamp)//请求的url
                    .post(formBody)
                    .build();
            //创建/Call
            Call call = okHttpClient.newCall(request);
            try {
                Response execute = call.execute();
                String responseBody = execute.body().string();
                JsonBean jsonBean = JSON.parseObject(responseBody, JsonBean.class);
                if (jsonBean == null || jsonBean.getData() == null || jsonBean.getData().getFutureRiskWeek().size() == 0){
                    continue;
                }
                List<JsonBean.DataBean.FutureRiskWeekBean> futureRiskWeek = jsonBean.getData().getFutureRiskWeek();
                arrayList.addAll(futureRiskWeek);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private String[] objectToStringArray(Field[] declaredFields, Object obj) {
        ArrayList<Object> list = new ArrayList<>();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object object = field.get(obj);
                if (object != null) {
                    list.add(object.toString());
                } else {
                    list.add("");
                }
            }
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        String[] a = new String[list.size()];
        return list.toArray(a);
    }

    private String getCurrentTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmsss");
        String curDate = sdf.format(new Date());
        return curDate;
    }

    private int getTotalPages(String coinType) {
        FormBody formBody = new FormBody.Builder()
                .add("currentPage", "1")
                .add("symbol", "f_usd_btc")
                .build();
        long timestamp = System.currentTimeMillis();
        final Request request = new Request.Builder()
                .url("https://www.okex.com/v2/futures/pc/public/futureRiskPreparationRecord.do?t=" + timestamp)//请求的url
                .post(formBody)
                .build();
        //创建/Call
        Call call = okHttpClient.newCall(request);
        int i = 0;
        try {
            Response execute = call.execute();
            String responseBody = execute.body().string();
            JsonBean jsonBean = JSON.parseObject(responseBody, JsonBean.class);
            i =  jsonBean.getData().getPageBean().getTotalPages();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }
}

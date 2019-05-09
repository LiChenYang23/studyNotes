package excel;

import bean.ExcelPropertyIndexModel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class ExcelTest {

    @Test
    public void test1() throws FileNotFoundException {
        OutputStream out = new FileOutputStream("/opt/temp/tempExcel/test.xlsx");
        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0, ExcelPropertyIndexModel.class);
            writer.write(getData(), sheet1);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<ExcelPropertyIndexModel> getData() {
        List<ExcelPropertyIndexModel> datas = Lists.newArrayList();
        ExcelPropertyIndexModel excelPropertyIndexModel = new ExcelPropertyIndexModel("李晨阳", "24", "lcyzzz@foxmail.com",
                "123", "234", "345", "456");
        for (int i = 0; i < 10; i++) {
            datas.add(excelPropertyIndexModel);
        }
        return datas;
    }
}

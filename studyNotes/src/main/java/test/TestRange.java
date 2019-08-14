package test;

import bean.Range;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

public class TestRange {

    @Test
    public void test1() {
        List<Integer> rangeList = Arrays.asList(5, 1, 90, 20, 10);
        rangeList.sort(Comparator.comparing(Integer::intValue));
        ArrayList<Range> rangs = Lists.newArrayList();
        for (int i = 0; i <= rangeList.size(); i++) {
            Range range = new Range();
            if (i == 0) {
                range.setMin(BigDecimal.ZERO);
            } else {
                range.setMin(new BigDecimal(rangeList.get(i - 1)));
            }
            if (i == rangeList.size()) {
                range.setMax(new BigDecimal(100));
            } else {
                range.setMax(new BigDecimal(rangeList.get(i)));
            }
            rangs.add(range);
        }
        BigDecimal bigDecimal = new BigDecimal("99");
        rangs.stream().forEach(e -> {
            if (e.contain(bigDecimal)) {
                System.out.println("次数区间为：(" + e.getMin() + "," + e.getMax() + "】");
            }
        });
    }

    @Test
    public void test2() {
        Long time1 = Long.valueOf(DateFormatUtils.format(new Date(), "yyyyMMddHHmmss"));
        System.out.println(" 当前时间为:" + time1);
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long time2 = Long.valueOf(DateFormatUtils.format(new Date(), "yyyyMMddHHmmss"));
        System.out.println(" 当前时间为:" + time2);

    }

    @Test
    public void test3(){
        String str = "lichenyang@huobi.com,wuming@huobi.com,609554126@qq.com,yaotao@huobi.com";
        String[] split = str.trim().split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }
}

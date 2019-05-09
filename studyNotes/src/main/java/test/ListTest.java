package test;

import bean.QuanAccount;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

public class ListTest {

    @Test
    public void test1() {
        String str = "e";
        List<String> list3 = Arrays.asList("A", "B", "C", "D", "E", "E");
        HashSet<String> strings = new HashSet<>(list3);
        ArrayList<String> strings1 = new ArrayList<>(strings);
        List<List<String>> partition = Lists.partition(list3, 2);
        System.out.println(list3);
        System.err.println(strings1);
    }

    @Test
    public void test2() {
        List<QuanAccount> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            QuanAccount quanAccount = new QuanAccount(1l, i, "1", 1l, 1l);
            objects.add(quanAccount);
        }
        Collections.reverse(objects);
        objects.stream().forEach(e -> {
            System.out.println(e);
        });
        System.out.println("---------------------");
        objects.sort(Comparator.comparing(e -> e.getExchangeId()));
        objects.stream().forEach(e -> {
            System.out.println(e);
        });
    }

    @Test
    public void test3() {
        String rankingRange = "0%-"+ BigDecimal.TEN.divide(BigDecimal.ONE,0,BigDecimal.ROUND_HALF_UP) + "%";
        System.out.println(rankingRange);
    }
}

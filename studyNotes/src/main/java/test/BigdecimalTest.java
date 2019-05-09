package test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigdecimalTest {

    @Test
    public void test1(){
        BigDecimal multiply = BigDecimal.TEN.multiply(new BigDecimal(-1));
        System.out.println(multiply);
    }
}

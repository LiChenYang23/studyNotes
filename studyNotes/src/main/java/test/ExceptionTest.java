package test;

import com.google.common.base.Throwables;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ExceptionTest {

    @Test
    public void test1(){
        try {
            BigDecimal nil = null;
            nil = nil.add(BigDecimal.ONE);
        } catch (Exception e) {
            System.out.println("123" + e.getMessage());
            System.err.println("456" + Throwables.getStackTraceAsString(e));
        }
    }
}

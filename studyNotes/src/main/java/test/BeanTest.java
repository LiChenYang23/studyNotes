package test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BeanTest {

    @Test
    public void test1() {
        List<String> strings = Arrays.asList("id","id2");
        boolean id = strings.contains("id");
        boolean id2 = strings.contains("id2");
//        StrategyRiskHistoryOk strategyRiskHistoryOk = new StrategyRiskHistoryOk();
//        Field[] declaredFields = StrategyRiskHistoryOk.class.getDeclaredFields();
//        strategyRiskHistoryOk.setAccountInitialHuobiRightProfitNetBorrow(new BigDecimal(1231.23132132132132131));
//        strategyRiskHistoryOk.setCurrHuobiLongPosition(new BigDecimal(11.8787878132132132131));
//        Object o = trimObjectToZero(declaredFields, strategyRiskHistoryOk);
    }

    private Object trimObject(Field[] declaredFields, Object obj) {
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (BigDecimal.class == field.getType()) {
                    BigDecimal number = (BigDecimal) field.get(obj);
                    if (number != null) {
                        field.set(obj, number.divide(BigDecimal.ONE, 4, BigDecimal.ROUND_HALF_UP));
                    } else {
                        field.set(obj, BigDecimal.ZERO);
                    }
                }
                if (Integer.class == field.getType()){
                    Integer number = (Integer) field.get(obj);
                    if (number == null) {
                        field.set(obj, 0);
                    }
                }
            }
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        return obj;
    }

    private Object trimObjectToZero(Field[] declaredFields, Object obj) {
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (BigDecimal.class == field.getType()) {
                    BigDecimal number = (BigDecimal) field.get(obj);
                    if (number == null) {
                        field.set(obj, BigDecimal.ZERO);
                    }
                }
            }
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        return obj;
    }
}

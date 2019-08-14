package bean;

import java.math.BigDecimal;

public class Range {

    private BigDecimal min;
    private BigDecimal max;

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public boolean contain(BigDecimal number){
        boolean flag = false;
        if (min.compareTo(BigDecimal.ZERO) == 0 ){
            if (min.compareTo(number) <= 0 && max.compareTo(number) >= 0){
                flag = true;
            }
        }else {
            if (min.compareTo(number) < 0 && max.compareTo(number) >= 0){
                flag = true;
            }
        }
        return flag;
    }
}

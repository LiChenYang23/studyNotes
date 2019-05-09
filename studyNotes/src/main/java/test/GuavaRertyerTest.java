package test;

import com.github.rholder.retry.*;
import com.google.common.base.Predicates;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GuavaRertyerTest {

    @Test
    public void test1() {
        Retryer<Boolean> retryer = RetryerBuilder
                .<Boolean>newBuilder()
                //抛出runtime异常、checked异常时都会重试，但是抛出error不会重试。
                .retryIfRuntimeException()
                //IO异常也要重试（timeout）
                .retryIfExceptionOfType(IOException.class)
                //返回false也需要重试
                .retryIfResult(Predicates.equalTo(false))
                //重调策略
                .withWaitStrategy(WaitStrategies.fixedWait(5, TimeUnit.SECONDS))
                //尝试次数
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .withRetryListener(new MyRetryListener<>())
                .build();
        try {
            retryer.call(new Callable<Boolean>() {
                @Override
                public Boolean call(){
                    Random random = new Random();
                    int i = random.nextInt();
                    if (i > 0) {
                        System.out.println(i);
                        return false;
                    }else {
                        System.err.println(i);
                        throw new RuntimeException("发送错误:xxxx");
                    }
                }
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (RetryException e) {
            System.out.println("重试超过3次，触发警报");
        }
    }
}

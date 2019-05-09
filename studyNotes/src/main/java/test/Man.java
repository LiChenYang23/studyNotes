package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Man {



    public void play(){
        // 构造一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Human("potato"));
        }

    }


    public static void main(String[] args) throws InterruptedException {
        new Man().play();


        Thread.sleep(1000);

    }
}

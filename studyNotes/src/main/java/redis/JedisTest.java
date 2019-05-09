package redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Random;

public class JedisTest {

    @Test
    public void test1(){
        Jedis jedis = new Jedis("localhost", 6379);
        Random random = new Random();
        int i = random.nextInt();
        jedis.setex("RedisId",10 ,String.valueOf(i));
        try {
            Thread.sleep(15*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RedisId:" + jedis.get("RedisId"));
        jedis.close();
    }
}

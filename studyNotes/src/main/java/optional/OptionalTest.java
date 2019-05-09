package optional;

import bean.QuanAccount;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Optional;

public class OptionalTest {

    @Test
    public void test1(){
        // 不同的字符串
        String str1 = "123";
        String str2 = "abc";
        boolean equals = Objects.equals(str1, str2);
        System.out.println(equals);
        // 相同的字符串
        String str3 = "abc";
        boolean equals1 = Objects.equals(str2, str3);
        System.out.println(equals1);
        // 与null比较
        String str4 = null;
        boolean equals2 = Objects.equals(str4, str3);
        System.out.println(equals2);
        // 都为null
        String str5 = null;
        boolean equals3 = Objects.equals(str4, str5);
        System.out.println(equals3);


    }

    private String getAccountName(QuanAccount account){
        return Optional.ofNullable(account).map(e -> e.getAccountName()).orElse("AccountName is null");
    }
}

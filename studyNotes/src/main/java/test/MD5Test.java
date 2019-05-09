package test;

import org.junit.jupiter.api.Test;

import java.security.MessageDigest;

public class MD5Test {

    @Test
    public void test1() {
        String str = "123456";
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            byte[] digest = md.digest();
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
//            String s = new BigInteger(1, digest).toString(16);
            String s = byteArrayToHex(digest);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2() {
        try {
            String test = AESUtils.aesEncrypt("dasdadsa9598-dsad14a68da", "huobi");
            System.out.println("加盐加密后得出：" + test);
            String test1 = AESUtils.aesDecrypt(test, "huobi");
            System.out.println("解密后："+test1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String byteArrayToHex(byte[] byteArray) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] resultCharArray = new char[byteArray.length * 2];
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        return new String(resultCharArray);
    }


}

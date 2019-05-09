package test;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    public void test1() {
        String url = "<html>\n" +
                "<META http-equiv=Content-Type content='text/html; charset=UTF-8'>\n" +
                "<table  border='1' cellspacing='0' cellpadding='0' style='height: 500px;width: 800px;'>\n" +
                "   <tr align='center'>\n" +
                "      <td>BTC</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>设置阈值</td>\n" +
                "      <td>统计数值</td>\n" +
                "      <td>是否达标</td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td>BTC当周0302</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日有效Maker成交量（USD）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日平均挂单撤单时间（秒）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日买一卖一有效挂单比例（%）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一两个订单中的最小挂单金额阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一最大挂单价差比例阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td>BTC次周0309</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日有效Maker成交量（USD）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日平均挂单撤单时间（秒）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日买一卖一有效挂单比例（%）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一两个订单中的最小挂单金额阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一最大挂单价差比例阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td>BTC季度0521</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日有效Maker成交量（USD）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日平均挂单撤单时间（秒）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>每日买一卖一有效挂单比例（%）</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一两个订单中的最小挂单金额阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "   <tr align='center'>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td>买一卖一最大挂单价差比例阈值</td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "      <td></td>\n" +
                "   </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>";
        int index = url.lastIndexOf("</table>");
        int index2 = url.indexOf("<table");
        System.err.println(url.substring(index2,index + 8));
    }

}


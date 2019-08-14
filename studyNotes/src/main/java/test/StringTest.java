package test;

import bean.JsonBean;
import com.alibaba.fastjson.JSON;
import com.csvreader.CsvWriter;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {

    private String jsonTxt = "{\"list\" :[{\n" +
            "  \"area_code\": \"00244\",\n" +
            "  \"name_en\": \"Angola\",\n" +
            "  \"name_cn\": \"安哥拉\",\n" +
            "  \"country_id\": 1\n" +
            "}, {\n" +
            "  \"area_code\": \"0093\",\n" +
            "  \"name_en\": \"Afghanistan\",\n" +
            "  \"name_cn\": \"阿富汗\",\n" +
            "  \"country_id\": 2\n" +
            "}, {\n" +
            "  \"area_code\": \"00355\",\n" +
            "  \"name_en\": \"Albania\",\n" +
            "  \"name_cn\": \"阿尔巴尼亚\",\n" +
            "  \"country_id\": 3\n" +
            "}, {\n" +
            "  \"area_code\": \"00213\",\n" +
            "  \"name_en\": \"Algeria\",\n" +
            "  \"name_cn\": \"阿尔及利亚\",\n" +
            "  \"country_id\": 4\n" +
            "}, {\n" +
            "  \"area_code\": \"00376\",\n" +
            "  \"name_en\": \"Andorra\",\n" +
            "  \"name_cn\": \"安道尔共和国\",\n" +
            "  \"country_id\": 5\n" +
            "}, {\n" +
            "  \"area_code\": \"001264\",\n" +
            "  \"name_en\": \"Anguilla\",\n" +
            "  \"name_cn\": \"安圭拉岛\",\n" +
            "  \"country_id\": 6\n" +
            "}, {\n" +
            "  \"area_code\": \"001268\",\n" +
            "  \"name_en\": \"Antigua and Barbuda\",\n" +
            "  \"name_cn\": \"安提瓜和巴布达\",\n" +
            "  \"country_id\": 7\n" +
            "}, {\n" +
            "  \"area_code\": \"0054\",\n" +
            "  \"name_en\": \"Argentina\",\n" +
            "  \"name_cn\": \"阿根廷\",\n" +
            "  \"country_id\": 8\n" +
            "}, {\n" +
            "  \"area_code\": \"00374\",\n" +
            "  \"name_en\": \"Armenia\",\n" +
            "  \"name_cn\": \"亚美尼亚\",\n" +
            "  \"country_id\": 9\n" +
            "}, {\n" +
            "  \"area_code\": \"00247\",\n" +
            "  \"name_en\": \"Ascension\",\n" +
            "  \"name_cn\": \"阿森松\",\n" +
            "  \"country_id\": \"10\"\n" +
            "}, {\n" +
            "  \"area_code\": \"0061\",\n" +
            "  \"name_en\": \"Australia\",\n" +
            "  \"name_cn\": \"澳大利亚\",\n" +
            "  \"country_id\": 11\n" +
            "}, {\n" +
            "  \"area_code\": \"0043\",\n" +
            "  \"name_en\": \"Austria\",\n" +
            "  \"name_cn\": \"奥地利\",\n" +
            "  \"country_id\": 12\n" +
            "}, {\n" +
            "  \"area_code\": \"00994\",\n" +
            "  \"name_en\": \"Azerbaijan\",\n" +
            "  \"name_cn\": \"阿塞拜疆\",\n" +
            "  \"country_id\": 13\n" +
            "}, {\n" +
            "  \"area_code\": \"001242\",\n" +
            "  \"name_en\": \"Bahamas\",\n" +
            "  \"name_cn\": \"巴哈马\",\n" +
            "  \"country_id\": 14\n" +
            "}, {\n" +
            "  \"area_code\": \"00973\",\n" +
            "  \"name_en\": \"Bahrain\",\n" +
            "  \"name_cn\": \"巴林\",\n" +
            "  \"country_id\": 15\n" +
            "}, {\n" +
            "  \"area_code\": \"00880\",\n" +
            "  \"name_en\": \"Bangladesh\",\n" +
            "  \"name_cn\": \"孟加拉国\",\n" +
            "  \"country_id\": 16\n" +
            "}, {\n" +
            "  \"area_code\": \"001246\",\n" +
            "  \"name_en\": \"Barbados\",\n" +
            "  \"name_cn\": \"巴巴多斯\",\n" +
            "  \"country_id\": 17\n" +
            "}, {\n" +
            "  \"area_code\": \"00375\",\n" +
            "  \"name_en\": \"Belarus\",\n" +
            "  \"name_cn\": \"白俄罗斯\",\n" +
            "  \"country_id\": 18\n" +
            "}, {\n" +
            "  \"area_code\": \"0032\",\n" +
            "  \"name_en\": \"Belgium\",\n" +
            "  \"name_cn\": \"比利时\",\n" +
            "  \"country_id\": 19\n" +
            "}, {\n" +
            "  \"area_code\": \"00501\",\n" +
            "  \"name_en\": \"Belize\",\n" +
            "  \"name_cn\": \"伯利兹\",\n" +
            "  \"country_id\": 20\n" +
            "}, {\n" +
            "  \"area_code\": \"00229\",\n" +
            "  \"name_en\": \"Benin\",\n" +
            "  \"name_cn\": \"贝宁\",\n" +
            "  \"country_id\": 21\n" +
            "}, {\n" +
            "  \"area_code\": \"001441\",\n" +
            "  \"name_en\": \"Bermuda\",\n" +
            "  \"name_cn\": \"百慕大群岛\",\n" +
            "  \"country_id\": 22\n" +
            "}, {\n" +
            "  \"area_code\": \"00591\",\n" +
            "  \"name_en\": \"Bolivia\",\n" +
            "  \"name_cn\": \"玻利维亚\",\n" +
            "  \"country_id\": 23\n" +
            "}, {\n" +
            "  \"area_code\": \"00267\",\n" +
            "  \"name_en\": \"Botswana\",\n" +
            "  \"name_cn\": \"博茨瓦纳\",\n" +
            "  \"country_id\": 24\n" +
            "}, {\n" +
            "  \"area_code\": \"0055\",\n" +
            "  \"name_en\": \"Brazil\",\n" +
            "  \"name_cn\": \"巴西\",\n" +
            "  \"country_id\": 25\n" +
            "}, {\n" +
            "  \"area_code\": \"00673\",\n" +
            "  \"name_en\": \"Brunei\",\n" +
            "  \"name_cn\": \"文莱\",\n" +
            "  \"country_id\": 26\n" +
            "}, {\n" +
            "  \"area_code\": \"00359\",\n" +
            "  \"name_en\": \"Bulgaria\",\n" +
            "  \"name_cn\": \"保加利亚\",\n" +
            "  \"country_id\": 27\n" +
            "}, {\n" +
            "  \"area_code\": \"00226\",\n" +
            "  \"name_en\": \"Burkina Faso\",\n" +
            "  \"name_cn\": \"布基纳法索\",\n" +
            "  \"country_id\": 28\n" +
            "}, {\n" +
            "  \"area_code\": \"0095\",\n" +
            "  \"name_en\": \"Burma\",\n" +
            "  \"name_cn\": \"缅甸\",\n" +
            "  \"country_id\": 29\n" +
            "}, {\n" +
            "  \"area_code\": \"00257\",\n" +
            "  \"name_en\": \"Burundi\",\n" +
            "  \"name_cn\": \"布隆迪\",\n" +
            "  \"country_id\": 30\n" +
            "}, {\n" +
            "  \"area_code\": \"00237\",\n" +
            "  \"name_en\": \"Cameroon\",\n" +
            "  \"name_cn\": \"喀麦隆\",\n" +
            "  \"country_id\": 31\n" +
            "}, {\n" +
            "  \"area_code\": \"001\",\n" +
            "  \"name_en\": \"Canada\",\n" +
            "  \"name_cn\": \"加拿大\",\n" +
            "  \"country_id\": 32\n" +
            "}, {\n" +
            "  \"area_code\": \"001345\",\n" +
            "  \"name_en\": \"Cayman Islands.\",\n" +
            "  \"name_cn\": \"开曼群岛\",\n" +
            "  \"country_id\": 33\n" +
            "}, {\n" +
            "  \"area_code\": \"00236\",\n" +
            "  \"name_en\": \"Central African Republic\",\n" +
            "  \"name_cn\": \"中非共和国\",\n" +
            "  \"country_id\": 34\n" +
            "}, {\n" +
            "  \"area_code\": \"00235\",\n" +
            "  \"name_en\": \"Chad\",\n" +
            "  \"name_cn\": \"乍得\",\n" +
            "  \"country_id\": 35\n" +
            "}, {\n" +
            "  \"area_code\": \"0056\",\n" +
            "  \"name_en\": \"Chile\",\n" +
            "  \"name_cn\": \"智利\",\n" +
            "  \"country_id\": 36\n" +
            "}, {\n" +
            "  \"area_code\": \"0086\",\n" +
            "  \"name_en\": \"China\",\n" +
            "  \"name_cn\": \"中国\",\n" +
            "  \"country_id\": 37\n" +
            "}, {\n" +
            "  \"area_code\": \"0057\",\n" +
            "  \"name_en\": \"Colombia\",\n" +
            "  \"name_cn\": \"哥伦比亚\",\n" +
            "  \"country_id\": 38\n" +
            "}, {\n" +
            "  \"area_code\": \"00243\",\n" +
            "  \"name_en\": \"Congo\",\n" +
            "  \"name_cn\": \"刚果\",\n" +
            "  \"country_id\": 39\n" +
            "}, {\n" +
            "  \"area_code\": \"00682\",\n" +
            "  \"name_en\": \"Cook Islands.\",\n" +
            "  \"name_cn\": \"库克群岛\",\n" +
            "  \"country_id\": 40\n" +
            "}, {\n" +
            "  \"area_code\": \"00506\",\n" +
            "  \"name_en\": \"Costa Rica\",\n" +
            "  \"name_cn\": \"哥斯达黎加\",\n" +
            "  \"country_id\": 41\n" +
            "}, {\n" +
            "  \"area_code\": \"0053\",\n" +
            "  \"name_en\": \"Cuba\",\n" +
            "  \"name_cn\": \"古巴\",\n" +
            "  \"country_id\": 42\n" +
            "}, {\n" +
            "  \"area_code\": \"00357\",\n" +
            "  \"name_en\": \"Cyprus\",\n" +
            "  \"name_cn\": \"塞浦路斯\",\n" +
            "  \"country_id\": 43\n" +
            "}, {\n" +
            "  \"area_code\": \"00420\",\n" +
            "  \"name_en\": \"Czech Republic\",\n" +
            "  \"name_cn\": \"捷克\",\n" +
            "  \"country_id\": 44\n" +
            "}, {\n" +
            "  \"area_code\": \"0045\",\n" +
            "  \"name_en\": \"Denmark\",\n" +
            "  \"name_cn\": \"丹麦\",\n" +
            "  \"country_id\": 45\n" +
            "}, {\n" +
            "  \"area_code\": \"00253\",\n" +
            "  \"name_en\": \"Djibouti\",\n" +
            "  \"name_cn\": \"吉布提\",\n" +
            "  \"country_id\": 46\n" +
            "}, {\n" +
            "  \"area_code\": \"001809\",\n" +
            "  \"name_en\": \"Dominican Republic\",\n" +
            "  \"name_cn\": \"多米尼加共和国\",\n" +
            "  \"country_id\": 47\n" +
            "}, {\n" +
            "  \"area_code\": \"00593\",\n" +
            "  \"name_en\": \"Ecuador\",\n" +
            "  \"name_cn\": \"厄瓜多尔\",\n" +
            "  \"country_id\": 48\n" +
            "}, {\n" +
            "  \"area_code\": \"0020\",\n" +
            "  \"name_en\": \"Egypt\",\n" +
            "  \"name_cn\": \"埃及\",\n" +
            "  \"country_id\": 49\n" +
            "}, {\n" +
            "  \"area_code\": \"00503\",\n" +
            "  \"name_en\": \"El Salvador\",\n" +
            "  \"name_cn\": \"萨尔瓦多\",\n" +
            "  \"country_id\": 50\n" +
            "}, {\n" +
            "  \"area_code\": \"00372\",\n" +
            "  \"name_en\": \"Estonia\",\n" +
            "  \"name_cn\": \"爱沙尼亚\",\n" +
            "  \"country_id\": 51\n" +
            "}, {\n" +
            "  \"area_code\": \"00251\",\n" +
            "  \"name_en\": \"Ethiopia\",\n" +
            "  \"name_cn\": \"埃塞俄比亚\",\n" +
            "  \"country_id\": 52\n" +
            "}, {\n" +
            "  \"area_code\": \"00679\",\n" +
            "  \"name_en\": \"Fiji\",\n" +
            "  \"name_cn\": \"斐济\",\n" +
            "  \"country_id\": 53\n" +
            "}, {\n" +
            "  \"area_code\": \"00358\",\n" +
            "  \"name_en\": \"Finland\",\n" +
            "  \"name_cn\": \"芬兰\",\n" +
            "  \"country_id\": 54\n" +
            "}, {\n" +
            "  \"area_code\": \"0033\",\n" +
            "  \"name_en\": \"France\",\n" +
            "  \"name_cn\": \"法国\",\n" +
            "  \"country_id\": 55\n" +
            "}, {\n" +
            "  \"area_code\": \"00594\",\n" +
            "  \"name_en\": \"French Guiana\",\n" +
            "  \"name_cn\": \"法属圭亚那\",\n" +
            "  \"country_id\": 56\n" +
            "}, {\n" +
            "  \"area_code\": \"00241\",\n" +
            "  \"name_en\": \"Gabon\",\n" +
            "  \"name_cn\": \"加蓬\",\n" +
            "  \"country_id\": 57\n" +
            "}, {\n" +
            "  \"area_code\": \"00220\",\n" +
            "  \"name_en\": \"Gambia\",\n" +
            "  \"name_cn\": \"冈比亚\",\n" +
            "  \"country_id\": 58\n" +
            "}, {\n" +
            "  \"area_code\": \"00995\",\n" +
            "  \"name_en\": \"Georgia\",\n" +
            "  \"name_cn\": \"格鲁吉亚\",\n" +
            "  \"country_id\": 59\n" +
            "}, {\n" +
            "  \"area_code\": \"0049\",\n" +
            "  \"name_en\": \"Germany\",\n" +
            "  \"name_cn\": \"德国\",\n" +
            "  \"country_id\": 60\n" +
            "}, {\n" +
            "  \"area_code\": \"00233\",\n" +
            "  \"name_en\": \"Ghana\",\n" +
            "  \"name_cn\": \"加纳\",\n" +
            "  \"country_id\": 61\n" +
            "}, {\n" +
            "  \"area_code\": \"00350\",\n" +
            "  \"name_en\": \"Gibraltar\",\n" +
            "  \"name_cn\": \"直布罗陀\",\n" +
            "  \"country_id\": 62\n" +
            "}, {\n" +
            "  \"area_code\": \"0030\",\n" +
            "  \"name_en\": \"Greece\",\n" +
            "  \"name_cn\": \"希腊\",\n" +
            "  \"country_id\": 63\n" +
            "}, {\n" +
            "  \"area_code\": \"001473\",\n" +
            "  \"name_en\": \"Grenada\",\n" +
            "  \"name_cn\": \"格林纳达\",\n" +
            "  \"country_id\": 64\n" +
            "}, {\n" +
            "  \"area_code\": \"001671\",\n" +
            "  \"name_en\": \"Guam\",\n" +
            "  \"name_cn\": \"关岛\",\n" +
            "  \"country_id\": 65\n" +
            "}, {\n" +
            "  \"area_code\": \"00502\",\n" +
            "  \"name_en\": \"Guatemala\",\n" +
            "  \"name_cn\": \"危地马拉\",\n" +
            "  \"country_id\": 66\n" +
            "}, {\n" +
            "  \"area_code\": \"00224\",\n" +
            "  \"name_en\": \"Guinea\",\n" +
            "  \"name_cn\": \"几内亚\",\n" +
            "  \"country_id\": 67\n" +
            "}, {\n" +
            "  \"area_code\": \"00592\",\n" +
            "  \"name_en\": \"Guyana\",\n" +
            "  \"name_cn\": \"圭亚那\",\n" +
            "  \"country_id\": 68\n" +
            "}, {\n" +
            "  \"area_code\": \"00509\",\n" +
            "  \"name_en\": \"Haiti\",\n" +
            "  \"name_cn\": \"海地\",\n" +
            "  \"country_id\": 69\n" +
            "}, {\n" +
            "  \"area_code\": \"00504\",\n" +
            "  \"name_en\": \"Honduras\",\n" +
            "  \"name_cn\": \"洪都拉斯\",\n" +
            "  \"country_id\": 70\n" +
            "}, {\n" +
            "  \"area_code\": \"00852\",\n" +
            "  \"name_en\": \"Hong Kong (China)\",\n" +
            "  \"name_cn\": \"中国香港\",\n" +
            "  \"country_id\": 71\n" +
            "}, {\n" +
            "  \"area_code\": \"0036\",\n" +
            "  \"name_en\": \"Hungary\",\n" +
            "  \"name_cn\": \"匈牙利\",\n" +
            "  \"country_id\": 72\n" +
            "}, {\n" +
            "  \"area_code\": \"00354\",\n" +
            "  \"name_en\": \"Iceland\",\n" +
            "  \"name_cn\": \"冰岛\",\n" +
            "  \"country_id\": 73\n" +
            "}, {\n" +
            "  \"area_code\": \"0091\",\n" +
            "  \"name_en\": \"India\",\n" +
            "  \"name_cn\": \"印度\",\n" +
            "  \"country_id\": 74\n" +
            "}, {\n" +
            "  \"area_code\": \"0062\",\n" +
            "  \"name_en\": \"Indonesia\",\n" +
            "  \"name_cn\": \"印度尼西亚\",\n" +
            "  \"country_id\": 75\n" +
            "}, {\n" +
            "  \"area_code\": \"0098\",\n" +
            "  \"name_en\": \"Iran\",\n" +
            "  \"name_cn\": \"伊朗\",\n" +
            "  \"country_id\": 76\n" +
            "}, {\n" +
            "  \"area_code\": \"00964\",\n" +
            "  \"name_en\": \"Iraq\",\n" +
            "  \"name_cn\": \"伊拉克\",\n" +
            "  \"country_id\": 77\n" +
            "}, {\n" +
            "  \"area_code\": \"00353\",\n" +
            "  \"name_en\": \"Ireland\",\n" +
            "  \"name_cn\": \"爱尔兰\",\n" +
            "  \"country_id\": 78\n" +
            "}, {\n" +
            "  \"area_code\": \"00972\",\n" +
            "  \"name_en\": \"Israel\",\n" +
            "  \"name_cn\": \"以色列\",\n" +
            "  \"country_id\": 79\n" +
            "}, {\n" +
            "  \"area_code\": \"0039\",\n" +
            "  \"name_en\": \"Italy\",\n" +
            "  \"name_cn\": \"意大利\",\n" +
            "  \"country_id\": 80\n" +
            "}, {\n" +
            "  \"area_code\": \"00225\",\n" +
            "  \"name_en\": \"IvoryCoast\",\n" +
            "  \"name_cn\": \"科特迪瓦\",\n" +
            "  \"country_id\": 81\n" +
            "}, {\n" +
            "  \"area_code\": \"001876\",\n" +
            "  \"name_en\": \"Jamaica\",\n" +
            "  \"name_cn\": \"牙买加\",\n" +
            "  \"country_id\": 82\n" +
            "}, {\n" +
            "  \"area_code\": \"0081\",\n" +
            "  \"name_en\": \"Japan\",\n" +
            "  \"name_cn\": \"日本\",\n" +
            "  \"country_id\": 83\n" +
            "}, {\n" +
            "  \"area_code\": \"00962\",\n" +
            "  \"name_en\": \"Jordan\",\n" +
            "  \"name_cn\": \"约旦\",\n" +
            "  \"country_id\": 84\n" +
            "}, {\n" +
            "  \"area_code\": \"00855\",\n" +
            "  \"name_en\": \"Cambodia\",\n" +
            "  \"name_cn\": \"柬埔寨\",\n" +
            "  \"country_id\": 85\n" +
            "}, {\n" +
            "  \"area_code\": \"007\",\n" +
            "  \"name_en\": \"Kazakstan\",\n" +
            "  \"name_cn\": \"哈萨克斯坦\",\n" +
            "  \"country_id\": 86\n" +
            "}, {\n" +
            "  \"area_code\": \"00254\",\n" +
            "  \"name_en\": \"Kenya\",\n" +
            "  \"name_cn\": \"肯尼亚\",\n" +
            "  \"country_id\": 87\n" +
            "}, {\n" +
            "  \"area_code\": \"0082\",\n" +
            "  \"name_en\": \"Korea\",\n" +
            "  \"name_cn\": \"韩国\",\n" +
            "  \"country_id\": 88\n" +
            "}, {\n" +
            "  \"area_code\": \"00965\",\n" +
            "  \"name_en\": \"Kuwait\",\n" +
            "  \"name_cn\": \"科威特\",\n" +
            "  \"country_id\": 89\n" +
            "}, {\n" +
            "  \"area_code\": \"00996\",\n" +
            "  \"name_en\": \"Kyrgyzstan\",\n" +
            "  \"name_cn\": \"吉尔吉斯坦\",\n" +
            "  \"country_id\": 90\n" +
            "}, {\n" +
            "  \"area_code\": \"00856\",\n" +
            "  \"name_en\": \"Laos\",\n" +
            "  \"name_cn\": \"老挝\",\n" +
            "  \"country_id\": 91\n" +
            "}, {\n" +
            "  \"area_code\": \"00371\",\n" +
            "  \"name_en\": \"Latvia\",\n" +
            "  \"name_cn\": \"拉脱维亚\",\n" +
            "  \"country_id\": 92\n" +
            "}, {\n" +
            "  \"area_code\": \"00961\",\n" +
            "  \"name_en\": \"Lebanon\",\n" +
            "  \"name_cn\": \"黎巴嫩\",\n" +
            "  \"country_id\": 93\n" +
            "}, {\n" +
            "  \"area_code\": \"00266\",\n" +
            "  \"name_en\": \"Lesotho\",\n" +
            "  \"name_cn\": \"莱索托\",\n" +
            "  \"country_id\": 94\n" +
            "}, {\n" +
            "  \"area_code\": \"00231\",\n" +
            "  \"name_en\": \"Liberia\",\n" +
            "  \"name_cn\": \"利比里亚\",\n" +
            "  \"country_id\": 95\n" +
            "}, {\n" +
            "  \"area_code\": \"00218\",\n" +
            "  \"name_en\": \"Libya\",\n" +
            "  \"name_cn\": \"利比亚\",\n" +
            "  \"country_id\": 96\n" +
            "}, {\n" +
            "  \"area_code\": \"00423\",\n" +
            "  \"name_en\": \"Liechtenstein\",\n" +
            "  \"name_cn\": \"列支敦士登\",\n" +
            "  \"country_id\": 97\n" +
            "}, {\n" +
            "  \"area_code\": \"00370\",\n" +
            "  \"name_en\": \"Lithuania\",\n" +
            "  \"name_cn\": \"立陶宛\",\n" +
            "  \"country_id\": 98\n" +
            "}, {\n" +
            "  \"area_code\": \"00352\",\n" +
            "  \"name_en\": \"Luxembourg\",\n" +
            "  \"name_cn\": \"卢森堡\",\n" +
            "  \"country_id\": 99\n" +
            "}, {\n" +
            "  \"area_code\": \"00853\",\n" +
            "  \"name_en\": \"Macao (China)\",\n" +
            "  \"name_cn\": \"中国澳门\",\n" +
            "  \"country_id\": 100\n" +
            "}, {\n" +
            "  \"area_code\": \"00261\",\n" +
            "  \"name_en\": \"Madagascar\",\n" +
            "  \"name_cn\": \"马达加斯加\",\n" +
            "  \"country_id\": 101\n" +
            "}, {\n" +
            "  \"area_code\": \"00265\",\n" +
            "  \"name_en\": \"Malawi\",\n" +
            "  \"name_cn\": \"马拉维\",\n" +
            "  \"country_id\": 102\n" +
            "}, {\n" +
            "  \"area_code\": \"0060\",\n" +
            "  \"name_en\": \"Malaysia\",\n" +
            "  \"name_cn\": \"马来西亚\",\n" +
            "  \"country_id\": 103\n" +
            "}, {\n" +
            "  \"area_code\": \"00960\",\n" +
            "  \"name_en\": \"Maldives\",\n" +
            "  \"name_cn\": \"马尔代夫\",\n" +
            "  \"country_id\": 104\n" +
            "}, {\n" +
            "  \"area_code\": \"00223\",\n" +
            "  \"name_en\": \"Mali\",\n" +
            "  \"name_cn\": \"马里\",\n" +
            "  \"country_id\": 105\n" +
            "}, {\n" +
            "  \"area_code\": \"00356\",\n" +
            "  \"name_en\": \"Malta\",\n" +
            "  \"name_cn\": \"马耳他\",\n" +
            "  \"country_id\": 106\n" +
            "}, {\n" +
            "  \"area_code\": \"00223\",\n" +
            "  \"name_en\": \"Marshall Islands\",\n" +
            "  \"name_cn\": \"马里亚那群岛\",\n" +
            "  \"country_id\": 107\n" +
            "}, {\n" +
            "  \"area_code\": \"00596\",\n" +
            "  \"name_en\": \"Martinique\",\n" +
            "  \"name_cn\": \"马提尼克\",\n" +
            "  \"country_id\": 108\n" +
            "}, {\n" +
            "  \"area_code\": \"00230\",\n" +
            "  \"name_en\": \"Mauritius\",\n" +
            "  \"name_cn\": \"毛里求斯\",\n" +
            "  \"country_id\": 109\n" +
            "}, {\n" +
            "  \"area_code\": \"0052\",\n" +
            "  \"name_en\": \"Mexico\",\n" +
            "  \"name_cn\": \"墨西哥\",\n" +
            "  \"country_id\": 110\n" +
            "}, {\n" +
            "  \"area_code\": \"00373\",\n" +
            "  \"name_en\": \"Moldova\",\n" +
            "  \"name_cn\": \"摩尔多瓦\",\n" +
            "  \"country_id\": 111\n" +
            "}, {\n" +
            "  \"area_code\": \"00377\",\n" +
            "  \"name_en\": \"Monaco\",\n" +
            "  \"name_cn\": \"摩纳哥\",\n" +
            "  \"country_id\": 112\n" +
            "}, {\n" +
            "  \"area_code\": \"00976\",\n" +
            "  \"name_en\": \"Mongolia\",\n" +
            "  \"name_cn\": \"蒙古\",\n" +
            "  \"country_id\": 113\n" +
            "}, {\n" +
            "  \"area_code\": \"001664\",\n" +
            "  \"name_en\": \"Montserrat\",\n" +
            "  \"name_cn\": \"蒙特塞拉特岛\",\n" +
            "  \"country_id\": 114\n" +
            "}, {\n" +
            "  \"area_code\": \"00212\",\n" +
            "  \"name_en\": \"Morocco\",\n" +
            "  \"name_cn\": \"摩洛哥\",\n" +
            "  \"country_id\": 115\n" +
            "}, {\n" +
            "  \"area_code\": \"00258\",\n" +
            "  \"name_en\": \"Mozambique\",\n" +
            "  \"name_cn\": \"莫桑比克\",\n" +
            "  \"country_id\": 116\n" +
            "}, {\n" +
            "  \"area_code\": \"00264\",\n" +
            "  \"name_en\": \"Namibia\",\n" +
            "  \"name_cn\": \"纳米比亚\",\n" +
            "  \"country_id\": 117\n" +
            "}, {\n" +
            "  \"area_code\": \"00674\",\n" +
            "  \"name_en\": \"Nauru\",\n" +
            "  \"name_cn\": \"瑙鲁\",\n" +
            "  \"country_id\": 118\n" +
            "}, {\n" +
            "  \"area_code\": \"00977\",\n" +
            "  \"name_en\": \"Nepal\",\n" +
            "  \"name_cn\": \"尼泊尔\",\n" +
            "  \"country_id\": 119\n" +
            "}, {\n" +
            "  \"area_code\": \"00599\",\n" +
            "  \"name_en\": \"Netheriands Antilles\",\n" +
            "  \"name_cn\": \"荷属安的列斯\",\n" +
            "  \"country_id\": 120\n" +
            "}, {\n" +
            "  \"area_code\": \"0031\",\n" +
            "  \"name_en\": \"Netherlands\",\n" +
            "  \"name_cn\": \"荷兰\",\n" +
            "  \"country_id\": 121\n" +
            "}, {\n" +
            "  \"area_code\": \"0064\",\n" +
            "  \"name_en\": \"New Zealand\",\n" +
            "  \"name_cn\": \"新西兰\",\n" +
            "  \"country_id\": 122\n" +
            "}, {\n" +
            "  \"area_code\": \"00505\",\n" +
            "  \"name_en\": \"Nicaragua\",\n" +
            "  \"name_cn\": \"尼加拉瓜\",\n" +
            "  \"country_id\": 123\n" +
            "}, {\n" +
            "  \"area_code\": \"00227\",\n" +
            "  \"name_en\": \"Niger\",\n" +
            "  \"name_cn\": \"尼日尔\",\n" +
            "  \"country_id\": 124\n" +
            "}, {\n" +
            "  \"area_code\": \"00234\",\n" +
            "  \"name_en\": \"Nigeria\",\n" +
            "  \"name_cn\": \"尼日利亚\",\n" +
            "  \"country_id\": 125\n" +
            "}, {\n" +
            "  \"area_code\": \"00850\",\n" +
            "  \"name_en\": \"North Korea\",\n" +
            "  \"name_cn\": \"朝鲜\",\n" +
            "  \"country_id\": 126\n" +
            "}, {\n" +
            "  \"area_code\": \"0047\",\n" +
            "  \"name_en\": \"Norway\",\n" +
            "  \"name_cn\": \"挪威\",\n" +
            "  \"country_id\": 127\n" +
            "}, {\n" +
            "  \"area_code\": \"00968\",\n" +
            "  \"name_en\": \"Oman\",\n" +
            "  \"name_cn\": \"阿曼\",\n" +
            "  \"country_id\": 128\n" +
            "}, {\n" +
            "  \"area_code\": \"0092\",\n" +
            "  \"name_en\": \"Pakistan\",\n" +
            "  \"name_cn\": \"巴基斯坦\",\n" +
            "  \"country_id\": 129\n" +
            "}, {\n" +
            "  \"area_code\": \"00507\",\n" +
            "  \"name_en\": \"Panama\",\n" +
            "  \"name_cn\": \"巴拿马\",\n" +
            "  \"country_id\": 130\n" +
            "}, {\n" +
            "  \"area_code\": \"00675\",\n" +
            "  \"name_en\": \"Papua New Cuinea\",\n" +
            "  \"name_cn\": \"巴布亚新几内亚\",\n" +
            "  \"country_id\": 131\n" +
            "}, {\n" +
            "  \"area_code\": \"00595\",\n" +
            "  \"name_en\": \"Paraguay\",\n" +
            "  \"name_cn\": \"巴拉圭\",\n" +
            "  \"country_id\": 132\n" +
            "}, {\n" +
            "  \"area_code\": \"0051\",\n" +
            "  \"name_en\": \"Peru\",\n" +
            "  \"name_cn\": \"秘鲁\",\n" +
            "  \"country_id\": 133\n" +
            "}, {\n" +
            "  \"area_code\": \"0063\",\n" +
            "  \"name_en\": \"Philippines\",\n" +
            "  \"name_cn\": \"菲律宾\",\n" +
            "  \"country_id\": 134\n" +
            "}, {\n" +
            "  \"area_code\": \"0048\",\n" +
            "  \"name_en\": \"Poland\",\n" +
            "  \"name_cn\": \"波兰\",\n" +
            "  \"country_id\": 135\n" +
            "}, {\n" +
            "  \"area_code\": \"00689\",\n" +
            "  \"name_en\": \"French Polynesia\",\n" +
            "  \"name_cn\": \"法属玻利尼西亚\",\n" +
            "  \"country_id\": 136\n" +
            "}, {\n" +
            "  \"area_code\": \"00351\",\n" +
            "  \"name_en\": \"Portugal\",\n" +
            "  \"name_cn\": \"葡萄牙\",\n" +
            "  \"country_id\": 137\n" +
            "}, {\n" +
            "  \"area_code\": \"001\",\n" +
            "  \"name_en\": \"Puerto Rico\",\n" +
            "  \"name_cn\": \"波多黎各\",\n" +
            "  \"country_id\": 138\n" +
            "}, {\n" +
            "  \"area_code\": \"00974\",\n" +
            "  \"name_en\": \"Qatar\",\n" +
            "  \"name_cn\": \"卡塔尔\",\n" +
            "  \"country_id\": 139\n" +
            "}, {\n" +
            "  \"area_code\": \"00262\",\n" +
            "  \"name_en\": \"Reunion\",\n" +
            "  \"name_cn\": \"留尼旺\",\n" +
            "  \"country_id\": 140\n" +
            "}, {\n" +
            "  \"area_code\": \"0040\",\n" +
            "  \"name_en\": \"Romania\",\n" +
            "  \"name_cn\": \"罗马尼亚\",\n" +
            "  \"country_id\": 141\n" +
            "}, {\n" +
            "  \"area_code\": \"007\",\n" +
            "  \"name_en\": \"Russia\",\n" +
            "  \"name_cn\": \"俄罗斯\",\n" +
            "  \"country_id\": 142\n" +
            "}, {\n" +
            "  \"area_code\": \"001758\",\n" +
            "  \"name_en\": \"Saint Lueia\",\n" +
            "  \"name_cn\": \"圣卢西亚\",\n" +
            "  \"country_id\": 143\n" +
            "}, {\n" +
            "  \"area_code\": \"001784\",\n" +
            "  \"name_en\": \"Saint Vincent\",\n" +
            "  \"name_cn\": \"圣文森特岛\",\n" +
            "  \"country_id\": 144\n" +
            "}, {\n" +
            "  \"area_code\": \"00684\",\n" +
            "  \"name_en\": \"Samoa Eastern\",\n" +
            "  \"name_cn\": \"东萨摩亚(美)\",\n" +
            "  \"country_id\": 145\n" +
            "}, {\n" +
            "  \"area_code\": \"00685\",\n" +
            "  \"name_en\": \"Samoa Western\",\n" +
            "  \"name_cn\": \"西萨摩亚\",\n" +
            "  \"country_id\": 146\n" +
            "}, {\n" +
            "  \"area_code\": \"00378\",\n" +
            "  \"name_en\": \"San Marino\",\n" +
            "  \"name_cn\": \"圣马力诺\",\n" +
            "  \"country_id\": 147\n" +
            "}, {\n" +
            "  \"area_code\": \"00239\",\n" +
            "  \"name_en\": \"Sao Tome and Principe\",\n" +
            "  \"name_cn\": \"圣多美和普林西比\",\n" +
            "  \"country_id\": 148\n" +
            "}, {\n" +
            "  \"area_code\": \"00966\",\n" +
            "  \"name_en\": \"Saudi Arabia\",\n" +
            "  \"name_cn\": \"沙特阿拉伯\",\n" +
            "  \"country_id\": 149\n" +
            "}, {\n" +
            "  \"area_code\": \"00221\",\n" +
            "  \"name_en\": \"Senegal\",\n" +
            "  \"name_cn\": \"塞内加尔\",\n" +
            "  \"country_id\": 150\n" +
            "}, {\n" +
            "  \"area_code\": \"00248\",\n" +
            "  \"name_en\": \"Seychelles\",\n" +
            "  \"name_cn\": \"塞舌尔\",\n" +
            "  \"country_id\": 151\n" +
            "}, {\n" +
            "  \"area_code\": \"00232\",\n" +
            "  \"name_en\": \"Sierra Leone\",\n" +
            "  \"name_cn\": \"塞拉利昂\",\n" +
            "  \"country_id\": 152\n" +
            "}, {\n" +
            "  \"area_code\": \"0065\",\n" +
            "  \"name_en\": \"Singapore\",\n" +
            "  \"name_cn\": \"新加坡\",\n" +
            "  \"country_id\": 153\n" +
            "}, {\n" +
            "  \"area_code\": \"00421\",\n" +
            "  \"name_en\": \"Slovakia\",\n" +
            "  \"name_cn\": \"斯洛伐克\",\n" +
            "  \"country_id\": 154\n" +
            "}, {\n" +
            "  \"area_code\": \"00386\",\n" +
            "  \"name_en\": \"Slovenia\",\n" +
            "  \"name_cn\": \"斯洛文尼亚\",\n" +
            "  \"country_id\": 155\n" +
            "}, {\n" +
            "  \"area_code\": \"00677\",\n" +
            "  \"name_en\": \"Solomon Islands\",\n" +
            "  \"name_cn\": \"所罗门群岛\",\n" +
            "  \"country_id\": 156\n" +
            "}, {\n" +
            "  \"area_code\": \"00252\",\n" +
            "  \"name_en\": \"Somali\",\n" +
            "  \"name_cn\": \"索马里\",\n" +
            "  \"country_id\": 157\n" +
            "}, {\n" +
            "  \"area_code\": \"0027\",\n" +
            "  \"name_en\": \"South Africa\",\n" +
            "  \"name_cn\": \"南非\",\n" +
            "  \"country_id\": 158\n" +
            "}, {\n" +
            "  \"area_code\": \"0034\",\n" +
            "  \"name_en\": \"Spain\",\n" +
            "  \"name_cn\": \"西班牙\",\n" +
            "  \"country_id\": 159\n" +
            "}, {\n" +
            "  \"area_code\": \"0094\",\n" +
            "  \"name_en\": \"Sri Lanka\",\n" +
            "  \"name_cn\": \"斯里兰卡\",\n" +
            "  \"country_id\": 160\n" +
            "}, {\n" +
            "  \"area_code\": \"001758\",\n" +
            "  \"name_en\": \"St.Lucia\",\n" +
            "  \"name_cn\": \"圣卢西亚\",\n" +
            "  \"country_id\": 161\n" +
            "}, {\n" +
            "  \"area_code\": \"001784\",\n" +
            "  \"name_en\": \"St.Vincent\",\n" +
            "  \"name_cn\": \"圣文森特\",\n" +
            "  \"country_id\": 162\n" +
            "}, {\n" +
            "  \"area_code\": \"00249\",\n" +
            "  \"name_en\": \"Sudan\",\n" +
            "  \"name_cn\": \"苏丹\",\n" +
            "  \"country_id\": 163\n" +
            "}, {\n" +
            "  \"area_code\": \"00597\",\n" +
            "  \"name_en\": \"Suriname\",\n" +
            "  \"name_cn\": \"苏里南\",\n" +
            "  \"country_id\": 164\n" +
            "}, {\n" +
            "  \"area_code\": \"00268\",\n" +
            "  \"name_en\": \"Swaziland\",\n" +
            "  \"name_cn\": \"斯威士兰\",\n" +
            "  \"country_id\": 165\n" +
            "}, {\n" +
            "  \"area_code\": \"0046\",\n" +
            "  \"name_en\": \"Sweden\",\n" +
            "  \"name_cn\": \"瑞典\",\n" +
            "  \"country_id\": 166\n" +
            "}, {\n" +
            "  \"area_code\": \"0041\",\n" +
            "  \"name_en\": \"Switzerland\",\n" +
            "  \"name_cn\": \"瑞士\",\n" +
            "  \"country_id\": 167\n" +
            "}, {\n" +
            "  \"area_code\": \"00963\",\n" +
            "  \"name_en\": \"Syria\",\n" +
            "  \"name_cn\": \"叙利亚\",\n" +
            "  \"country_id\": 168\n" +
            "}, {\n" +
            "  \"area_code\": \"00886\",\n" +
            "  \"name_en\": \"Taiwan (China)\",\n" +
            "  \"name_cn\": \"中国台湾\",\n" +
            "  \"country_id\": 169\n" +
            "}, {\n" +
            "  \"area_code\": \"00992\",\n" +
            "  \"name_en\": \"Tajikstan\",\n" +
            "  \"name_cn\": \"塔吉克斯坦\",\n" +
            "  \"country_id\": 170\n" +
            "}, {\n" +
            "  \"area_code\": \"00255\",\n" +
            "  \"name_en\": \"Tanzania\",\n" +
            "  \"name_cn\": \"坦桑尼亚\",\n" +
            "  \"country_id\": 171\n" +
            "}, {\n" +
            "  \"area_code\": \"0066\",\n" +
            "  \"name_en\": \"Thailand\",\n" +
            "  \"name_cn\": \"泰国\",\n" +
            "  \"country_id\": 172\n" +
            "}, {\n" +
            "  \"area_code\": \"00228\",\n" +
            "  \"name_en\": \"Togo\",\n" +
            "  \"name_cn\": \"多哥\",\n" +
            "  \"country_id\": 173\n" +
            "}, {\n" +
            "  \"area_code\": \"00676\",\n" +
            "  \"name_en\": \"Tonga\",\n" +
            "  \"name_cn\": \"汤加\",\n" +
            "  \"country_id\": 174\n" +
            "}, {\n" +
            "  \"area_code\": \"001868\",\n" +
            "  \"name_en\": \"Trinidad and Tobago\",\n" +
            "  \"name_cn\": \"特立尼达和多巴哥\",\n" +
            "  \"country_id\": 175\n" +
            "}, {\n" +
            "  \"area_code\": \"00216\",\n" +
            "  \"name_en\": \"Tunisia\",\n" +
            "  \"name_cn\": \"突尼斯\",\n" +
            "  \"country_id\": 176\n" +
            "}, {\n" +
            "  \"area_code\": \"0090\",\n" +
            "  \"name_en\": \"Turkey\",\n" +
            "  \"name_cn\": \"土耳其\",\n" +
            "  \"country_id\": 177\n" +
            "}, {\n" +
            "  \"area_code\": \"00993\",\n" +
            "  \"name_en\": \"Turkmenistan\",\n" +
            "  \"name_cn\": \"土库曼斯坦\",\n" +
            "  \"country_id\": 178\n" +
            "}, {\n" +
            "  \"area_code\": \"00256\",\n" +
            "  \"name_en\": \"Uganda\",\n" +
            "  \"name_cn\": \"乌干达\",\n" +
            "  \"country_id\": 179\n" +
            "}, {\n" +
            "  \"area_code\": \"00380\",\n" +
            "  \"name_en\": \"Ukraine\",\n" +
            "  \"name_cn\": \"乌克兰\",\n" +
            "  \"country_id\": 180\n" +
            "}, {\n" +
            "  \"area_code\": \"00971\",\n" +
            "  \"name_en\": \"United Arab Emirates\",\n" +
            "  \"name_cn\": \"阿拉伯联合酋长国\",\n" +
            "  \"country_id\": 181\n" +
            "}, {\n" +
            "  \"area_code\": \"0044\",\n" +
            "  \"name_en\": \"United Kingdom\",\n" +
            "  \"name_cn\": \"英国\",\n" +
            "  \"country_id\": 182\n" +
            "}, {\n" +
            "  \"area_code\": \"001\",\n" +
            "  \"name_en\": \"United States of America\",\n" +
            "  \"name_cn\": \"美国\",\n" +
            "  \"country_id\": 183\n" +
            "}, {\n" +
            "  \"area_code\": \"00598\",\n" +
            "  \"name_en\": \"Uruguay\",\n" +
            "  \"name_cn\": \"乌拉圭\",\n" +
            "  \"country_id\": 184\n" +
            "}, {\n" +
            "  \"area_code\": \"00998\",\n" +
            "  \"name_en\": \"Uzbekistan\",\n" +
            "  \"name_cn\": \"乌兹别克斯坦\",\n" +
            "  \"country_id\": 185\n" +
            "}, {\n" +
            "  \"area_code\": \"0058\",\n" +
            "  \"name_en\": \"Venezuela\",\n" +
            "  \"name_cn\": \"委内瑞拉\",\n" +
            "  \"country_id\": 186\n" +
            "}, {\n" +
            "  \"area_code\": \"0084\",\n" +
            "  \"name_en\": \"Vietnam\",\n" +
            "  \"name_cn\": \"越南\",\n" +
            "  \"country_id\": 187\n" +
            "}, {\n" +
            "  \"area_code\": \"00967\",\n" +
            "  \"name_en\": \"Yemen\",\n" +
            "  \"name_cn\": \"也门\",\n" +
            "  \"country_id\": 188\n" +
            "}, {\n" +
            "  \"area_code\": \"00338\",\n" +
            "  \"name_en\": \"Yugoslavia\",\n" +
            "  \"name_cn\": \"南斯拉夫\",\n" +
            "  \"country_id\": 189\n" +
            "}, {\n" +
            "  \"area_code\": \"0027\",\n" +
            "  \"name_en\": \"South Africa\",\n" +
            "  \"name_cn\": \"南非\",\n" +
            "  \"country_id\": 190\n" +
            "}, {\n" +
            "  \"area_code\": \"00263\",\n" +
            "  \"name_en\": \"Zimbabwe\",\n" +
            "  \"name_cn\": \"津巴布韦\",\n" +
            "  \"country_id\": 191\n" +
            "}, {\n" +
            "  \"area_code\": \"00243\",\n" +
            "  \"name_en\": \"Zaire\",\n" +
            "  \"name_cn\": \"扎伊尔\",\n" +
            "  \"country_id\": 192\n" +
            "}, {\n" +
            "  \"area_code\": \"00260\",\n" +
            "  \"name_en\": \"Zambia\",\n" +
            "  \"name_cn\": \"赞比亚\",\n" +
            "  \"country_id\": 193\n" +
            "}, {\n" +
            "  \"area_code\": \"00297\",\n" +
            "  \"name_en\": \"Aruba\",\n" +
            "  \"name_cn\": \"阿鲁巴\",\n" +
            "  \"country_id\": 194\n" +
            "}, {\n" +
            "  \"area_code\": \"00672\",\n" +
            "  \"name_en\": \"Australianoverseasterritories\",\n" +
            "  \"name_cn\": \"澳大利亚海外领地\",\n" +
            "  \"country_id\": 195\n" +
            "}, {\n" +
            "  \"area_code\": \"00975\",\n" +
            "  \"name_en\": \"Bhutan\",\n" +
            "  \"name_cn\": \"不丹\",\n" +
            "  \"country_id\": 196\n" +
            "}, {\n" +
            "  \"area_code\": \"00387\",\n" +
            "  \"name_en\": \"BosniaandHerzegovina\",\n" +
            "  \"name_cn\": \"波斯尼亚和黑塞哥维那\",\n" +
            "  \"country_id\": 197\n" +
            "}, {\n" +
            "  \"area_code\": \"00238\",\n" +
            "  \"name_en\": \"CapeVerde\",\n" +
            "  \"name_cn\": \"佛得角\",\n" +
            "  \"country_id\": 198\n" +
            "}, {\n" +
            "  \"area_code\": \"00269\",\n" +
            "  \"name_en\": \"ComorosIslands\",\n" +
            "  \"name_cn\": \"科摩罗群岛\",\n" +
            "  \"country_id\": 199\n" +
            "}, {\n" +
            "  \"area_code\": \"00385\",\n" +
            "  \"name_en\": \"Croatia\",\n" +
            "  \"name_cn\": \"克罗地亚\",\n" +
            "  \"country_id\": 200\n" +
            "}, {\n" +
            "  \"area_code\": \"00246\",\n" +
            "  \"name_en\": \"DiegoGarcia\",\n" +
            "  \"name_cn\": \"迭戈加西亚群岛\",\n" +
            "  \"country_id\": 201\n" +
            "}, {\n" +
            "  \"area_code\": \"00670\",\n" +
            "  \"name_en\": \"EastTimor\",\n" +
            "  \"name_cn\": \"东帝汶\",\n" +
            "  \"country_id\": 202\n" +
            "}, {\n" +
            "  \"area_code\": \"00240\",\n" +
            "  \"name_en\": \"EquatorialGuinea\",\n" +
            "  \"name_cn\": \"赤道几内亚\",\n" +
            "  \"country_id\": 203\n" +
            "}, {\n" +
            "  \"area_code\": \"00291\",\n" +
            "  \"name_en\": \"Eritrea\",\n" +
            "  \"name_cn\": \"厄立特里亚\",\n" +
            "  \"country_id\": 204\n" +
            "}, {\n" +
            "  \"area_code\": \"00500\",\n" +
            "  \"name_en\": \"FalklandIslands\",\n" +
            "  \"name_cn\": \"福克兰群岛\",\n" +
            "  \"country_id\": 205\n" +
            "}, {\n" +
            "  \"area_code\": \"00298\",\n" +
            "  \"name_en\": \"FaroeIslands\",\n" +
            "  \"name_cn\": \"法罗群岛\",\n" +
            "  \"country_id\": 206\n" +
            "}, {\n" +
            "  \"area_code\": \"00299\",\n" +
            "  \"name_en\": \"Greenland\",\n" +
            "  \"name_cn\": \"格陵兰岛\",\n" +
            "  \"country_id\": 207\n" +
            "}, {\n" +
            "  \"area_code\": \"00590\",\n" +
            "  \"name_en\": \"Guadeloupe\",\n" +
            "  \"name_cn\": \"瓜德罗普\",\n" +
            "  \"country_id\": 208\n" +
            "}, {\n" +
            "  \"area_code\": \"00245\",\n" +
            "  \"name_en\": \"Guinea-Bissau\",\n" +
            "  \"name_cn\": \"几内亚比绍\",\n" +
            "  \"country_id\": 209\n" +
            "}, {\n" +
            "  \"area_code\": \"00686\",\n" +
            "  \"name_en\": \"Kiribati\",\n" +
            "  \"name_cn\": \"基里巴斯\",\n" +
            "  \"country_id\": 210\n" +
            "}, {\n" +
            "  \"area_code\": \"00389\",\n" +
            "  \"name_en\": \"Macedonia\",\n" +
            "  \"name_cn\": \"马其顿\",\n" +
            "  \"country_id\": 211\n" +
            "}, {\n" +
            "  \"area_code\": \"00692\",\n" +
            "  \"name_en\": \"MarshallIslands\",\n" +
            "  \"name_cn\": \"马绍尔群岛\",\n" +
            "  \"country_id\": 212\n" +
            "}, {\n" +
            "  \"area_code\": \"00222\",\n" +
            "  \"name_en\": \"Mauritania\",\n" +
            "  \"name_cn\": \"毛里塔尼亚\",\n" +
            "  \"country_id\": 213\n" +
            "}, {\n" +
            "  \"area_code\": \"00691\",\n" +
            "  \"name_en\": \"Micronesia\",\n" +
            "  \"name_cn\": \"密克罗尼西亚\",\n" +
            "  \"country_id\": 214\n" +
            "}, {\n" +
            "  \"area_code\": \"00382\",\n" +
            "  \"name_en\": \"Montenegro\",\n" +
            "  \"name_cn\": \"黑山\",\n" +
            "  \"country_id\": 215\n" +
            "}, {\n" +
            "  \"area_code\": \"00687\",\n" +
            "  \"name_en\": \"NewCaledonia\",\n" +
            "  \"name_cn\": \"新喀里多尼亚\",\n" +
            "  \"country_id\": 216\n" +
            "}, {\n" +
            "  \"area_code\": \"00683\",\n" +
            "  \"name_en\": \"Niue\",\n" +
            "  \"name_cn\": \"纽埃岛\",\n" +
            "  \"country_id\": 217\n" +
            "}, {\n" +
            "  \"area_code\": \"00680\",\n" +
            "  \"name_en\": \"Palau\",\n" +
            "  \"name_cn\": \"帕劳\",\n" +
            "  \"country_id\": 218\n" +
            "}, {\n" +
            "  \"area_code\": \"00970\",\n" +
            "  \"name_en\": \"Palestine\",\n" +
            "  \"name_cn\": \"巴勒斯坦\",\n" +
            "  \"country_id\": 219\n" +
            "}, {\n" +
            "  \"area_code\": \"00250\",\n" +
            "  \"name_en\": \"Rwanda\",\n" +
            "  \"name_cn\": \"卢旺达\",\n" +
            "  \"country_id\": 220\n" +
            "}, {\n" +
            "  \"area_code\": \"00290\",\n" +
            "  \"name_en\": \"St.Helena\",\n" +
            "  \"name_cn\": \"圣赫勒拿岛\",\n" +
            "  \"country_id\": 221\n" +
            "}, {\n" +
            "  \"area_code\": \"00508\",\n" +
            "  \"name_en\": \"SaintPierreandMiquelon\",\n" +
            "  \"name_cn\": \"圣皮埃尔和密克隆群岛\",\n" +
            "  \"country_id\": 222\n" +
            "}, {\n" +
            "  \"area_code\": \"00381\",\n" +
            "  \"name_en\": \"Serbia\",\n" +
            "  \"name_cn\": \"塞尔维亚\",\n" +
            "  \"country_id\": 223\n" +
            "}, {\n" +
            "  \"area_code\": \"00690\",\n" +
            "  \"name_en\": \"Tokelau\",\n" +
            "  \"name_cn\": \"托克劳群岛\",\n" +
            "  \"country_id\": 224\n" +
            "}, {\n" +
            "  \"area_code\": \"00688\",\n" +
            "  \"name_en\": \"Tuvalu\",\n" +
            "  \"name_cn\": \"图瓦卢\",\n" +
            "  \"country_id\": 225\n" +
            "}, {\n" +
            "  \"area_code\": \"00678\",\n" +
            "  \"name_en\": \"Vanuatu\",\n" +
            "  \"name_cn\": \"瓦努阿图\",\n" +
            "  \"country_id\": 226\n" +
            "}, {\n" +
            "  \"area_code\": \"00379\",\n" +
            "  \"name_en\": \"VaticanCity\",\n" +
            "  \"name_cn\": \"梵蒂冈城\",\n" +
            "  \"country_id\": 227\n" +
            "}, {\n" +
            "  \"area_code\": \"00681\",\n" +
            "  \"name_en\": \"WallisandFutuna\",\n" +
            "  \"name_cn\": \"瓦利斯和富图纳\",\n" +
            "  \"country_id\": 228\n" +
            "}, {\n" +
            "  \"area_code\": \"001284\",\n" +
            "  \"name_en\": \"British Virgin Islands\",\n" +
            "  \"name_cn\": \"英属维尔京群岛\",\n" +
            "  \"country_id\": 229\n" +
            "}, {\n" +
            "  \"area_code\": \"009714\",\n" +
            "  \"name_en\": \"Emirate of Dubai\",\n" +
            "  \"name_cn\": \"迪拜酋长国\",\n" +
            "  \"country_id\": 230\n" +
            "}]}";

    private String excelSaveAddress = "/opt/temp/tempExcel/";

    @Test
    public void test1(){
//        JsonBean jsonBean = JSON.parseObject(jsonTxt, JsonBean.class);
//        List<JsonBean.ListBean> list = jsonBean.getList();
//        list.stream().forEach(e -> System.out.println(e));
//        try {
//            Field[] declaredFields = JsonBean.ListBean.class.getDeclaredFields();
//            ArrayList<String[]> strArrays = new ArrayList<>();
//            list.stream().forEach(e -> {
//                String[] strings = objectToStringArray(declaredFields, e);
//                strArrays.add(strings);
//            });
//            String fileName = "123.csv";
//            String csvFilePath = excelSaveAddress + fileName;
//            // 创建CSV写对象 例如:CsvWriter(文件路径，分隔符，编码格式);
//            CsvWriter csvWriter = new CsvWriter(csvFilePath, ',', Charset.forName("UTF-8"));
//            // 写表头
//            String[] csvHeaders = {"area_code","name_en","name_cn","country_id"};
//            csvWriter.writeRecord(csvHeaders);
//            // 写内容
//            for (String[] quanOrderArray : strArrays) {
//                csvWriter.writeRecord(quanOrderArray);
//            }
//            csvWriter.close();
//            File file = new File(excelSaveAddress + fileName);
//            String utf8NoBomFileName ="234.csv";
//            File utf8NoBomFile = new File(excelSaveAddress + utf8NoBomFileName);
//            CharacterCovertUtil.turnUTF8withoutBOM(file, utf8NoBomFile);
//            file.delete();
//        } catch (Exception e1) {
//            e1.printStackTrace();
//        }
    }

    private String[] objectToStringArray(Field[] declaredFields, Object obj) {
        ArrayList<Object> list = new ArrayList<>();
        try {
            for (Field field : declaredFields) {
//                if (field.getName().equalsIgnoreCase("areaCode")) {
//                    field.setAccessible(true);
//                    Object object = field.get(obj);
//                    if (object != null) {
//                        list.add("00" + object.toString());
//                    } else {
//                        list.add("");
//                    }
//                    continue;
//                }
                field.setAccessible(true);
                Object object = field.get(obj);
                if (object != null) {
                    list.add(object.toString());
                } else {
                    list.add("");
                }
            }
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        String[] a = new String[list.size()];
        return list.toArray(a);
    }

    @Test
    public void test2(){
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.stream().filter(e -> !e.equalsIgnoreCase("2")).forEach(e -> {
            System.out.println(e);
        });
    }
}

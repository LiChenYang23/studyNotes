package Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DateTest {

    @Test
    public void test1() {
        LocalDateTime with = LocalDateTime.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        LocalDateTime localDateTime = with.withHour(23).withMinute(59).withSecond(59);
        LocalDateTime localDateTime4 = with.withHour(23).withMinute(59).withSecond(59);
        System.out.println(localDateTime);
        System.err.println(localDateTime.isBefore(localDateTime4));


        LocalDateTime with2 = LocalDateTime.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
        LocalDateTime localDateTime2 = with2.withHour(0).withMinute(0).withSecond(0);
        System.out.println(localDateTime2);

        int i = localDateTime2.compareTo(localDateTime);

        System.err.println(i);

        Date date = dateUtil(new Date());
        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.format(new Date());
        DayOfWeek dayOfWeek = localDateTime2.getDayOfWeek();
        System.out.println(localDateTime2.plusWeeks(1).with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));

        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects.size());
    }


    public void saveWeeklyHistory(Date date, String symbol) {
        //统计初始时间
        LocalDateTime beginDateTime = date2LocalDateTime(date);
        //统计结束时间
        LocalDateTime endDateTime = beginDateTime.plusWeeks(1).with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)).withHour(23).withMinute(59).withSecond(59).withNano(999);
        LocalDateTime nextDateTime = beginDateTime.plusWeeks(1).with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)).withHour(0).withMinute(0).withSecond(0).withNano(0);
        //判断输入时间（如果是周末 nowDateTime则是下周周末 endDateTime为下周周六，如果是其他 nowDateTime则是本周末 endDateTime为本周周六）
        if (beginDateTime.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0) {
            endDateTime = beginDateTime.plusWeeks(1).with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)).withHour(23).withMinute(59).withSecond(59).withNano(999);
            nextDateTime = beginDateTime.plusWeeks(2).with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)).withHour(0).withMinute(0).withSecond(0).withNano(0);
        }
        //如果初始时间小于当前时间，进入递归
        if (beginDateTime.isBefore(LocalDateTime.now().plusWeeks(1).with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)).withHour(0).withMinute(0).withSecond(0).withNano(0))) {
            //统计当周的数据，并保存
            System.out.println("nextDateTime:" + nextDateTime);
            System.out.println("beginDateTime:" + beginDateTime);
            System.out.println("endDateTime:" + endDateTime);
            System.out.println("aaa" + LocalDateTime.now().plusWeeks(1).with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)).withHour(0).withMinute(0).withSecond(0));
            //形成新的递归时间，进行递归
            saveWeeklyHistory(localDateTime2Date(nextDateTime), symbol);
        }
    }

    private Date dateUtil(Date date) {
        LocalDateTime localDateTime = date2LocalDateTime(date);
        LocalDateTime localDateTime2 = localDateTime.plusDays(7l);
        return localDateTime2Date(localDateTime2);
    }

    private Date localDateTime2Date(LocalDateTime localDateTime) {
        //LocalDateTime转Date
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        return date;
    }

    private LocalDateTime date2LocalDateTime(Date date) {
        //Date转LocalDateTime
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime;
    }

    @Test
    public void test3() {
        List<String> thisWeeks = new ArrayList<>();
        switch (LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY)).plusDays(1).getDayOfWeek().getValue()) {
            case 6:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY))));
            case 5:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY))));
            case 4:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY))));
            case 3:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY))));
            case 2:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY))));
            case 1:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))));
            default:
                thisWeeks.add(LocalDateTime2Str(LocalDateTime.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY))));
                break;
        }
        Collections.reverse(thisWeeks);
        System.out.println(thisWeeks);
    }

    private String LocalDateTime2Str(LocalDateTime dateTime) {
        Date date = localDateTime2Date(dateTime);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = format.format(date) + "%";
        return str;
    }

    @Test
    public void test4() {
        Date firstDayOfMonth = getFirstDayOfMonth(new Date());
        System.out.println(firstDayOfMonth);
    }

    private Date getFirstDayOfMonth(Date date) {
        LocalDateTime dateTime = date2LocalDateTime(date);
        LocalDateTime firstDayOfMonth = dateTime.with(TemporalAdjusters.firstDayOfMonth()).withHour(0).withMinute(0).withSecond(0);
        return localDateTime2Date(firstDayOfMonth);
    }

    @Test
    public void test5() {
        LocalDateTime dateTime = date2LocalDateTime(new Date());
        LocalDateTime firstDayOfMonth = dateTime.with(TemporalAdjusters.firstDayOfMonth()).minusDays(1).withHour(16).withMinute(0).withSecond(0);
        System.out.println(DateFormatUtils.format(localDateTime2Date(firstDayOfMonth), "yyyyMMddHH"));

    }

    @Test
    public void test6() {
        Date date = new Date();
        date = DateUtils.addDays(date, -1);
        date = DateUtils.setMilliseconds(date, 0);
        date = DateUtils.setHours(date, 16);
        date = DateUtils.setMinutes(date, 0);
        date = DateUtils.setSeconds(date, 0);
        System.out.println(DateFormatUtils.format(date, "yyyyMMddHH"));

    }
}

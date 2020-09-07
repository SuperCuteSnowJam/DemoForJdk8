package org.example.timedemo;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        //获取 时
        time.getHour();

        //获取 分
         time.getMinute();

        //获取 秒
        time.getSecond();

        //俩小时后
        time.plusHours(2);

        Duration.between(time,LocalTime.of(14,05,03));

    }


}

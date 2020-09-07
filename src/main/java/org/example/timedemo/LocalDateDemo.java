package org.example.timedemo;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoField.*;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,8,20);
        //获取年
        int year = date.getYear();
        //获取月
        int month = date.getMonth().getValue();
        //获取日
        int day = date.getDayOfMonth();
        //判断今年是否是闰年
        boolean isLeap = date.isLeapYear();

        //获取当前日期
        LocalDate today = LocalDate.now();

        //明天
        LocalDate tomorrow = today.plusDays(1);

        //明天的今天
        LocalDate nextYearToday = today.plusYears(1);

        //学习使用date.get()方法
        date.get(MONTH_OF_YEAR);date.get(YEAR);date.get(DAY_OF_MONTH);date.get(DAY_OF_WEEK);date.get(DAY_OF_YEAR);

        Period period = Period.between(LocalDate.now(),LocalDate.of(2015,9,05));

    }
}

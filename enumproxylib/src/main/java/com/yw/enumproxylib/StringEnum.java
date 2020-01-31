package com.yw.enumproxylib;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.StringDef;

/**
 * 定义一个string类型的注解，用于检查星期的类型安全。
 * create by yangwei
 * on 2020-01-30 22:04 week
 */
public class StringEnum {

    public static final String MONDAY = "monday";
    public static final String TUESDAY = "tuesday";
    public static final String WENDESDAY = "wendesday";
    public static final String THURSDAY = "thursday";
    public static final String FRIDAY = "friday";
    public static final String SATURDAY = "saturday";
    public static final String WEEKDAY = "weekday";

    @StringDef({MONDAY, TUESDAY, WENDESDAY, THURSDAY, FRIDAY, SATURDAY, WEEKDAY})//此处定义注解的值只能是这几个
    @Retention(RetentionPolicy.SOURCE)//编译时注解，源码级检查
    public @interface Week {

    }

    /**
     * 获取日期
     *
     * @param week
     * @return
     */
    public static String getWeek(@Week String week) {
        switch (week) {
            case MONDAY:
                return "星期一";
            case TUESDAY:
                return "星期二";
            case WENDESDAY:
                return "星期三";
            case THURSDAY:
                return "星期四";
            case FRIDAY:
                return "星期五";
            case SATURDAY:
                return "星期六";
            case WEEKDAY:
                return "星期日";
        }
        return null;
    }
}

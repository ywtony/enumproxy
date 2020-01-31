package com.yw.enumproxylib;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

/**
 * 定义一个int类型的注解
 * 用注解代替枚举，做到类型安全
 * create by yangwei
 * on 2020-01-30 21:34
 */
public class EnumProxy {
    public static final int READ_CAR = 0;//红色的汽车
    public static final int GREEN_CAR = 1;//绿色的汽车
    public static final int YELLOW_CAR = 2;//黄色的汽车


    @IntDef({READ_CAR, GREEN_CAR, YELLOW_CAR})
    @Retention(RetentionPolicy.SOURCE)//源码级别
    public @interface CAR_Enum {

    }

    /**
     * 获取汽车类型
     *
     * @param car
     * @return
     */
    public static int getCar(@CAR_Enum int car) {
        switch (car) {
            case READ_CAR:
                return 0;
            case GREEN_CAR:
                return 1;
            case YELLOW_CAR:
                return 2;
        }
        return -1;
    }
}

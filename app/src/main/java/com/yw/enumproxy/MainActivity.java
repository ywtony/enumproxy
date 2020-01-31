package com.yw.enumproxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yw.enumproxylib.EnumProxy;
import com.yw.enumproxylib.StringEnum;

/**
 * 测试例子
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int car_black = 10;
        int bk = EnumProxy.getCar(car_black);//此处类型检查不通过
        int ck = EnumProxy.getCar(EnumProxy.GREEN_CAR);//类型检查通过


        String str = "friday";
        String week1 = StringEnum.getWeek(str);//直接赋值String时类型检查不通过
        String week2 = StringEnum.getWeek(StringEnum.FRIDAY);//赋值定义好的值时类型检查通过
    }
}

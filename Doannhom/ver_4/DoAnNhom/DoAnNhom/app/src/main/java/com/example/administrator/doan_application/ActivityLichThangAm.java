package com.example.administrator.doan_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import java.util.Calendar;
import java.util.Date;

public class ActivityLichThangAm extends AppCompatActivity {


    private Calendar selectedDate;
    private TextView tvNgayThangNamDuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_thang_am);

        selectedDate = (Calendar) getIntent().getSerializableExtra(LichThangFragment.EXTRA_DATE);

        tvNgayThangNamDuong = (TextView) findViewById(R.id.tvNgayThangNamDuong);

        String strThu = "";

        switch (selectedDate.get(Calendar.DAY_OF_WEEK))
        {
            case Calendar.MONDAY:
                strThu = "Thứ 2";
                break;
            case Calendar.TUESDAY:
                strThu = "Thứ 3";
                break;
            case Calendar.WEDNESDAY:
                strThu = "Thứ 4";
                break;
            case Calendar.THURSDAY:
                strThu = "Thứ 5";
                break;
            case Calendar.FRIDAY:
                strThu = "Thứ 6";
                break;
            case Calendar.SATURDAY:
                strThu = "Thứ 7";
                break;
            case Calendar.SUNDAY:
                strThu = "Chủ Nhật";
                break;
        }

        String strNgayThangNam = strThu + ", "
                                + selectedDate.get(Calendar.DAY_OF_MONTH) + " - "
                                + (selectedDate.get(Calendar.MONTH) + 1) + " - "
                                + selectedDate.get(Calendar.YEAR);

        tvNgayThangNamDuong.setText(strNgayThangNam);

    }
}
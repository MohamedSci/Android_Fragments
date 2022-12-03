package com.featheredteam.appp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FragLst.ItemSelected {

    TextView tvDetail;
    ArrayList<String> arrLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail = findViewById(R.id.tvDetail);
        arrLst = new ArrayList<String>();
        arrLst.add("111111111111111111111111111111111111111111111");
        arrLst.add("222222222222222222222222222222222222222222222");
        arrLst.add("333333333333333333333333333333333333333333333");
        arrLst.add("444444444444444444444444444444444444444444444");
        arrLst.add("555555555555555555555555555555555555555555555");
        arrLst.add("666666666666666666666666666666666666666666666");
        arrLst.add("777777777777777777777777777777777777777777777");
        arrLst.add("888888888888888888888888888888888888888888888");
        arrLst.add("999999999999999999999999999999999999999999999");

    }


    @Override
    public void onItemSelected(int i) {
        tvDetail.setText(arrLst.get(i));
    }
}
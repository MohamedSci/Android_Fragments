package com.featheredteam.appp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FragLst.ItemSelected {

    TextView tvDetail;
     String [] arrLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail = findViewById(R.id.tvDetail);
        arrLst =getResources().getStringArray(R.array.descriptions);
    }


    @Override
    public void onItemSelected(int i) {
        tvDetail.setText(arrLst[i]);
    }
}
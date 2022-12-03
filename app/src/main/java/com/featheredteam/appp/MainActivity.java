package com.featheredteam.appp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements FragLst.ItemSelected {

    TextView tvDetail;
    String[] arrLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail = findViewById(R.id.tvDetail);
        arrLst = getResources().getStringArray(R.array.descriptions);

        try{
            if (findViewById(R.id.mainAc) != null) {
                FragmentManager fm = this.getSupportFragmentManager();
                fm.beginTransaction()
                        .show(fm.findFragmentById(R.id.fragLst))
                        .hide(fm.findFragmentById(R.id.fragDetail));
            }
            if (findViewById(R.id.mainAcLa) != null) {
                FragmentManager fm2 = this.getSupportFragmentManager();
                fm2.beginTransaction()
                        .show(fm2.findFragmentById(R.id.fragDetail))
                        .show(fm2.findFragmentById(R.id.fragLst));
            }
        } catch (Exception e){
            System.out.println("eee 111111"+ e);
        }

    }


    @Override
    public void onItemSelected(int i) {

        tvDetail.setText(arrLst[i]);
        try{
            if (findViewById(R.id.mainAc) != null) {
                FragmentManager fm3 = this.getSupportFragmentManager();
                fm3.beginTransaction()
                        .hide(fm3.findFragmentById(R.id.fragLst))
                        .show(fm3.findFragmentById(R.id.fragDetail));
            } else {
                FragmentManager fm4 = this.getSupportFragmentManager();
                fm4.beginTransaction()
                        .show(fm4.findFragmentById(R.id.fragLst))
                        .show(fm4.findFragmentById(R.id.fragDetail));
            }
        } catch (Exception e){
            System.out.println("eee 22222"+ e);
        }

    }
}
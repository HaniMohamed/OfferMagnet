package com.example.hp.offermagnet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationViewEx bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottom = ( BottomNavigationViewEx)findViewById(R.id.BottomNavBar);
        bottom.enableAnimation(false);
        bottom.enableItemShiftingMode(false);
        bottom.enableShiftingMode(false);
        bottom.setTextVisibility(false);

    }
}

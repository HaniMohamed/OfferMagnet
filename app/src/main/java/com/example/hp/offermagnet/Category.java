package com.example.hp.offermagnet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class Category extends AppCompatActivity {

 ImageButton[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        images[0]=(ImageButton)findViewById(R.id.books);
        images[1]=(ImageButton)findViewById(R.id.fashions);
        images[2]=(ImageButton)findViewById(R.id.foods);
        images[3]=(ImageButton)findViewById(R.id.electronics);
        images[4]=(ImageButton)findViewById(R.id.collections);
        images[5]=(ImageButton)findViewById(R.id.shoses);
        images[6]=(ImageButton)findViewById(R.id.cellphone);
        images[7]=(ImageButton)findViewById(R.id.computer);
        images[8]=(ImageButton)findViewById(R.id.officies);




    }
}

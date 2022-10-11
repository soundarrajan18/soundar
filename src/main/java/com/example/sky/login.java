package com.example.sky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

class MainActivity12 extends AppCompatActivity {
    RelativeLayout searchfood,donatefood,updatefood,mycart,myorder,createcity,createplace,myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchfood=findViewById(R.id.searchfood);
        donatefood=findViewById(R.id.donatefood);
        updatefood=findViewById(R.id.updatefdod);
        mycart=findViewById(R.id.mycart);
        myorder=findViewById(R.id.myorder);
        createcity=findViewById(R.id.createcity);
        myprofile=findViewById(R.id.myprofile);
        searchfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,searchfood.class);
                startActivity(intent);
            }
        });
        donatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Donatefood.class);
                startActivity(intent);
            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Updatefood.class);
                startActivity(intent);
            }
        });
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Mycart.class);
                startActivity(intent);
            }
        });
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Myorder.class);
                startActivity(intent);
            }
        });
        createcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Createcity.class);
                startActivity(intent);
            }
        });
        createplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Createplace.class);
                startActivity(intent);
            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity12.this,Myprofile.class);
                startActivity(intent);
            }
        });
    }
}
package com.tronsis.recyclerviewdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tronsis.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onRvMeClcik(View v){
        startActivity(new Intent(this,RecyclerViewMeActivity.class));
    }
    public void onRvMoocClcik(View v){
        startActivity(new Intent(this,RecyclerViewMoocActivity.class));
    }


}

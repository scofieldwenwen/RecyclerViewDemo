package com.tronsis.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * scofield
 * 2016-6-27 15:01:12
 * RecyclerView Demo
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new RecycleViewDivider(this,LinearLayoutManager.VERTICAL));
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));//这里用线性宫格显示 类似于grid view
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流

        stringList.add("Java");
        stringList.add("C++");
        stringList.add("C#");
        stringList.add("JavaScrip");
        stringList.add("C");
        stringList.add("Java");
        stringList.add("C++");
        stringList.add("C#");
        stringList.add("JavaScrip");
        stringList.add("C");
        stringList.add("Java");
        stringList.add("C++");
        stringList.add("C#");
        stringList.add("JavaScrip");
        stringList.add("C");
        stringList.add("Java");
        stringList.add("C++");
        stringList.add("C#");
        stringList.add("JavaScrip");
        stringList.add("C");
        recyclerView.setAdapter(new MyRecycleViewAdapter(stringList));
    }
}

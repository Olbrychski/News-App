package com.example.newspage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView NewsRecyclerview;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        NewsRecyclerview = findViewById(R.id.news_rv);
        mData = new ArrayList<>();

        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));
        mData.add(new NewsItem("Android Design Concept","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua","3 October 2021",R.drawable.profile));


        newsAdapter = new NewsAdapter(this,mData);
        NewsRecyclerview.setAdapter(newsAdapter);
        NewsRecyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}
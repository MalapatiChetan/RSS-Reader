package com.example.rssfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayList<String> rssLinks = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRediff = findViewById(R.id.btnRediff);
        Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
        Button btnSports = findViewById(R.id.btnSports);
        btnRediff.setOnClickListener(this);
        btnCinemaBlend.setOnClickListener(this);
        btnSports.setOnClickListener(this);
        rssLinks.add("https://anchor.fm/s/1fef2b5c/podcast/rss");
        rssLinks.add("https://www.thehindu.com/news/national/feeder/default.rss");
        rssLinks.add("https://www.sportstime247.com/feed/");
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), RSSFeedActivity.class);
        switch (view.getId()) {
            case R.id.btnRediff:
                intent.putExtra("rssLink", rssLinks.get(0));
                startActivity(intent);
                break;
            case R.id.btnCinemaBlend:
                intent.putExtra("rssLink", rssLinks.get(1));
                startActivity(intent);
                break;
            case R.id.btnSports:
                intent.putExtra("rssLink", rssLinks.get(2));
                startActivity(intent);
                break;
        }
    }
}

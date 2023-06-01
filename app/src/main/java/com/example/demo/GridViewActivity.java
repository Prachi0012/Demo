package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;
    int singerimg[]={R.drawable.nehakakkar,R.drawable.king,R.drawable.darshan,R.drawable.arjitsingh,R.drawable.bprank,R.drawable.guru,R.drawable.jubin,R.drawable.yoyo,R.drawable.tulsi,R.drawable.lataji,R.drawable.kumarsanu,R.drawable.dhvani};
    String[] singer ={"Neha Kakkar","King","Darshan Raval","Arjit Singh","B Prank","Guru Randhawa","Jubin","YoYo Honey Singh","Tulsi Kumar","lataji","Kumar Sanu","Dhavni Bushali"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        initview();
    }

    private void initview() {
        gridView=findViewById(R.id.gridview);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(GridViewActivity.this,singer,singerimg);
        gridView.setAdapter(gridViewAdapter);
    }
}
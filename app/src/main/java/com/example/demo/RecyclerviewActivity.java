package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerviewActivity extends AppCompatActivity {
    String[] singer ={"Neha Kakkar","King","Darshan Raval","Arjit Singh","B Prank","Guru Randhawa","Jubin","YoYo Honey Singh","Tulsi Kumar","lataji","Kumar Sanu","Dhavni Bushali"};
    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initview();
    }

    private void initview() {
        rcv=findViewById(R.id.rcv);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(RecyclerviewActivity.this,singer);
        LinearLayoutManager manager = new LinearLayoutManager(RecyclerviewActivity.this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(manager);
        rcv.setAdapter(adapter);
    }
}
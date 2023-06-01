package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ModelclassListviewActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<ModelclassListView> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelclass_listview);
        initview();
    }

    private void initview() {
        listview=findViewById(R.id.listview);
        ModelclassListView m1 = new ModelclassListView();
        m1.setName("Android Development");
        m1.setImage(R.drawable.android);
        list.add(m1);

        ModelclassListView m2 = new ModelclassListView();
        m2.setName("Ios Development");
        m2.setImage(R.drawable.swift);
        list.add(m2);

        ModelclassListView m3 = new ModelclassListView();
        m3.setName("Game Development");
        m3.setImage(R.drawable.unity);
        list.add(m3);

        ModelclassListView m4 = new ModelclassListView();
        m4.setName("Backend Development");
        m4.setImage(R.drawable.nodejs);
        list.add(m4);

        ModelclassListView m5 = new ModelclassListView();
        m5.setName("Front End Development");
        m5.setImage(R.drawable.html);
        list.add(m5);

        ModelclassListView m6 = new ModelclassListView();
        m6.setName("UI/UX Designer");
        m6.setImage(R.drawable.photoshop);
        list.add(m6);

        ModelclassListView m7 = new ModelclassListView();
        m7.setName("Game Design");
        m7.setImage(R.drawable.blender);
        list.add(m7);

        ModelclassListView m8 = new ModelclassListView();
        m8.setName("GIM");
        m8.setImage(R.drawable.gim);
        list.add(m8);

        ModelclassListView m9 = new ModelclassListView();
        m9.setName("Animation");
        m9.setImage(R.drawable.animation);
        list.add(m9);

        ModelclassListView m10 = new ModelclassListView();
        m10.setName("Full stack Development");
        m10.setImage(R.drawable.fullstack);
        list.add(m10);

        ModelclassListView m11 = new ModelclassListView();
        m11.setName("Graphix Designer");
        m11.setImage(R.drawable.illustrator);
        list.add(m11);

        ModelclassListView m12 = new ModelclassListView();
        m12.setName("Fashion Designer");
        m12.setImage(R.drawable.fashion);
        list.add(m12);

        ModelclassListView m13 = new ModelclassListView();
        m13.setName("Python");
        m13.setImage(R.drawable.python);
        list.add(m13);

        ModelclassListView m14 = new ModelclassListView();
        m14.setName("Cyber Security");
        m14.setImage(R.drawable.cyber);
        list.add(m14);

        ModelclassListView m15 = new ModelclassListView();
        m15.setName("Java");
        m15.setImage(R.drawable.java);
        list.add(m15);


        ModelclassListviewAdapter adapter = new ModelclassListviewAdapter(ModelclassListviewActivity.this,list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data = list.get(i).name;
                Toast.makeText(ModelclassListviewActivity.this, "Your Course is ==> "+data, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
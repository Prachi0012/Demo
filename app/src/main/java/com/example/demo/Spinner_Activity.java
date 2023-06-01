package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinner_Activity extends AppCompatActivity {
    //S1
    Spinner spinner1,spinner2,spinner3,spinner4,spinner5;
    String[] course={"Android Developer","IOS Developer","UI/UX Designer","Graphix Designer","BackEnd Developer","FrontEnd Developer","Animation"};
    int logo[]={R.drawable.android,R.drawable.swift,R.drawable.photoshop,R.drawable.illustrator,R.drawable.nodejs,R.drawable.html,R.drawable.animation};
    //S2
    String[] bank={"Bank of Baroda","State Bank of India","Axis Bank","IDFC Bank","HDFC Bank","Punjab national Bank"};
    //s3
    String[] university={"VNSGU","Bhagwan Mahavir University","Swarnim Startup and inovation university","Vidyadeep University","Bhavnagar University"};
    //s4
    String[] branch={"Ak Road","Yogi chowk","Sarthana","Ved Road","Adajan","Dindoli"};
    //s5
    String[] faculty={"Nandini Mam","Darshan Sir","Piyush Sir","Daxa Mam","Hensi Mam","Chirag Sir","Riddhi Mam","Sumita Mam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initview();
    }

    private void initview() {
        //spinner1
        spinner1=findViewById(R.id.spinner1);
        Adapter1 adapter1= new Adapter1(Spinner_Activity.this,course,logo);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), course[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });

        //spinner2
        spinner2=findViewById(R.id.spinner2);
        Adapter2 adapter2= new Adapter2(Spinner_Activity.this,bank);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), bank[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });

        //spinner 3
        spinner3=findViewById(R.id.spinner3);
        Adapter3 adapter3= new Adapter3(Spinner_Activity.this,university);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), university[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
        //spinner 4
        spinner4=findViewById(R.id.spinner4);
        Adapter4 adapter4= new Adapter4(Spinner_Activity.this,branch);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), branch[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
        //spinner 5
        spinner5=findViewById(R.id.spinner5);
        Adapter5 adapter5= new Adapter5(Spinner_Activity.this,faculty);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), faculty[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
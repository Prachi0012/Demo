package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Simple_Spinner_Activity extends AppCompatActivity {
    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_spinner);
        initview();
    }

    private void initview() {
        spinner = findViewById(R.id.spinner);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, courses);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(aa);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Simple_Spinner_Activity.this, ""+courses[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Simple_Spinner_Activity.this, "Select Option", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Custom_Spinner_Activity extends AppCompatActivity {
    Spinner spinner;
    int flags[] = {R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.russia,R.drawable.australia,R.drawable.china,R.drawable.london,R.drawable.africa,R.drawable.srilanka,R.drawable.bhutan};
    String[] country={"India","America","Japan","Russia","Australia","China","London","Africa","Srilanka","Bhutan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);
        initview();
    }

    private void initview() {
        spinner=findViewById(R.id.spinner);
        Adapter adapter= new Adapter(Custom_Spinner_Activity.this,country,flags);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), country[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Custom_Spinner_Activity.this, "Select any country", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
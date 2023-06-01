package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListView_Activity extends AppCompatActivity {
    ListView list;
    ArrayList<String> Friends = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initview();
    }

    private void initview() {
        list = findViewById(R.id.list);
        Friends.add("Palak");
        Friends.add("Apexa");
        Friends.add("Kaushik");
        Friends.add("Smit");
        Friends.add("Mihir");
        Friends.add("Vishwas");
        Friends.add("Monank");
        Friends.add("Vivek");
        Friends.add("Shraddha");
        Friends.add("Sneha");
        Friends.add("Prathna");
        Friends.add("Harshita");
        Friends.add("Maulavee");
        Friends.add("Kashish");
        Friends.add("Mansi");
        Friends.add("Ekta");
        Friends.add("Trisha");
        Friends.add("Shruti");
        Friends.add("Khushi");
        Friends.add("tanvi");

        Friends.get(0);
        Friends.get(1);
        Friends.get(2);
        Friends.get(3);
        Friends.get(4);
        Friends.get(5);
        Friends.get(6);
        Friends.get(7);
        Friends.get(8);
        Friends.get(9);
        Friends.get(10);
        Friends.get(11);
        Friends.get(12);
        Friends.get(13);
        Friends.get(14);
        Friends.get(15);
        Friends.get(16);
        Friends.get(17);
        Friends.get(18);
        Friends.get(19);

        number.add("9725468586");
        number.add("9510007408");
        number.add("8141247376");
        number.add("7096286480");
        number.add("6354296986");
        number.add("7069033821");
        number.add("9510789849");
        number.add("9054264609");
        number.add("6355045004");
        number.add("9725468586");
        number.add("9510007408");
        number.add("9173985204");
        number.add("9104792048");
        number.add("9265765161");
        number.add("9104792048");
        number.add("9510789849");
        number.add("9510007408");
        number.add("7069033821");
        number.add("9510007408");
        number.add("7069033821");

        number.get(0);
        number.get(1);
        number.get(2);
        number.get(3);
        number.get(4);
        number.get(5);
        number.get(6);
        number.get(7);
        number.get(8);
        number.get(9);
        number.get(10);
        number.get(11);
        number.get(12);
        number.get(13);
        number.get(14);
        number.get(15);
        number.get(16);
        number.get(17);
        number.get(18);
        number.get(19);

        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);
        image.add(R.drawable.img11);

        image.get(0);
        image.get(1);
        image.get(2);
        image.get(3);
        image.get(4);
        image.get(5);
        image.get(6);
        image.get(7);
        image.get(8);
        image.get(9);
        image.get(10);
        image.get(11);
        image.get(12);
        image.get(13);
        image.get(14);
        image.get(15);
        image.get(16);
        image.get(17);
        image.get(18);
        image.get(19);


        ListViewAdapter ladapter = new ListViewAdapter(ListView_Activity.this, Friends, number, image);
        list.setAdapter(ladapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String num = number.get(i);
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + num));
                startActivity(callIntent);
            }
        });

    }
}

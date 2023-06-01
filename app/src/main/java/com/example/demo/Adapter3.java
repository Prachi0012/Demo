package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter3 extends BaseAdapter {
    Context Spinner_Activity;
    String university[];
    public Adapter3(Spinner_Activity spinner_activity, String[] university) {
        this.Spinner_Activity= spinner_activity;
        this.university=university;
    }

    @Override
    public int getCount() {
        return university.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(Spinner_Activity).inflate(R.layout.spinner3_item_file,null);
        TextView txtuni =view.findViewById(R.id.txtuni);
//        ImageView img2 = view.findViewById(R.id.img2);

//        img2.setImageResource(banklogo[i]);
        txtuni.setText(university[i]);
        return view;
    }
}

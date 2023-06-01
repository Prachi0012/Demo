package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter1 extends BaseAdapter {
    Context spinner_activity;
    String course[];
    int[] logo;



    public Adapter1(Spinner_Activity spinner_activity, String[] course, int[] logo) {
        this.spinner_activity= spinner_activity;
        this.course=course;
        this.logo=logo;
    }

    @Override
    public int getCount() {
        return course.length;
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
        view= LayoutInflater.from(spinner_activity).inflate(R.layout.spinner1_item_file,null);
        TextView txtcourse =view.findViewById(R.id.txtcourse);
        ImageView img1 = view.findViewById(R.id.img1);

        img1.setImageResource(logo[i]);
        txtcourse.setText(course[i]);
        return view;
    }
}

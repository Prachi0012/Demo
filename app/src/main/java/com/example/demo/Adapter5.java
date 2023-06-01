package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter5 extends BaseAdapter {
    Context Spinner_Activity;
    String faculty[];

    public Adapter5(Spinner_Activity spinner_activity, String[] faculty) {
        this.Spinner_Activity= spinner_activity;
        this.faculty=faculty;
    }

    @Override
    public int getCount() {
        return faculty.length;
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
        view= LayoutInflater.from(Spinner_Activity).inflate(R.layout.spinner5_item_file,null);
        TextView txtfaculty =view.findViewById(R.id.txtfaculty);
        txtfaculty.setText(faculty[i]);
        return view;
    }
}

package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter4 extends BaseAdapter {
    Context Spinner_Activity;
    String branch[];

    public Adapter4(Spinner_Activity spinner_activity, String[] branch) {
        this.Spinner_Activity= spinner_activity;
        this.branch=branch;
    }

    @Override
    public int getCount() {
        return branch.length;
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
        view= LayoutInflater.from(Spinner_Activity).inflate(R.layout.spinner4_item_file,null);
        TextView txtbranch =view.findViewById(R.id.txtbranch);
//        ImageView img2 = view.findViewById(R.id.img2);

//        img2.setImageResource(banklogo[i]);
        txtbranch.setText(branch[i]);
        return view;
    }
}

package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter2 extends BaseAdapter {
    Context Spinner_Activity;
    String bank[];

    LayoutInflater inflter;

    public Adapter2(Spinner_Activity spinner_activity, String[] bank) {
        this.Spinner_Activity= spinner_activity;
        this.bank=bank;
    }

    @Override
    public int getCount() {
        return bank.length;
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
        view= LayoutInflater.from(Spinner_Activity).inflate(R.layout.spinner2_item_file,null);
        TextView txtBank =view.findViewById(R.id.txtBank);
//        ImageView img2 = view.findViewById(R.id.img2);

//        img2.setImageResource(banklogo[i]);
        txtBank.setText(bank[i]);
        return view;
    }
}

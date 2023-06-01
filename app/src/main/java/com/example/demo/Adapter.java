package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    Context custom_spinner_activity;
    String country[];
    int[] flags;
    LayoutInflater inflter;
    public Adapter(Custom_Spinner_Activity custom_spinner_activity, String[] country, int[] flags) {
        this.custom_spinner_activity=custom_spinner_activity;
        this.country=country;
        this.flags=flags;

    }

    @Override
    public int getCount() {

        return flags.length;
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
        view= LayoutInflater.from(custom_spinner_activity).inflate(R.layout.custom_spinner_item_file,null);
        TextView txtcountry =view.findViewById(R.id.txtcountry);
        ImageView img = view.findViewById(R.id.img);

        img.setImageResource(flags[i]);
        txtcountry.setText(country[i]);
        return view;
    }
}

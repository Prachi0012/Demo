package com.example.demo;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context listView_activity;
    ArrayList<String> Friends;
    ArrayList<String> number;
    ArrayList<Integer> image;
    public ListViewAdapter(ListView_Activity listView_activity, ArrayList<String> friends, ArrayList<String> number, ArrayList<Integer> image) {
        this.Friends=friends;
        this.image=image;
        this.number=number;
        this.listView_activity=listView_activity;
    }

    @Override
    public int getCount() {
        return Friends.size();
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

        view = LayoutInflater.from(listView_activity).inflate(R.layout.listview_item_file,null);
        TextView txtfrd=view.findViewById(R.id.txtfrd);
        TextView txtnumber=view.findViewById(R.id.txtnumber);
        ImageView profile=view.findViewById(R.id.profile);
        txtfrd.setText(Friends.get(i));
        txtnumber.setText(number.get(i));
        profile.setImageResource(image.get(i));

        return view;
    }
}

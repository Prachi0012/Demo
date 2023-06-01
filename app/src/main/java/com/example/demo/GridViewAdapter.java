package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
    Context GridViewActivity;
    String[] singer;
    int[] singerimg;
    public GridViewAdapter(GridViewActivity gridViewActivity, String[] singer, int[] singerimg) {
        this.GridViewActivity=gridViewActivity;
        this.singer=singer;
        this.singerimg=singerimg;
    }

    @Override
    public int getCount() {
        return singerimg.length;
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
        view = LayoutInflater.from(GridViewActivity).inflate(R.layout.gridview_item_file,null);
        TextView txtSinger = view.findViewById(R.id.txtSinger);
        ImageView img = view.findViewById(R.id.img);
        txtSinger .setText(singer[i]);
        img.setImageResource(singerimg[i]);
        return view;
    }
}

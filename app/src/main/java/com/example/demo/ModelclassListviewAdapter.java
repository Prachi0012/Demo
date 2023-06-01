package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelclassListviewAdapter extends BaseAdapter {
    Context modelclassListviewActivity;
    ArrayList<ModelclassListView> list;

    public ModelclassListviewAdapter(ModelclassListviewActivity modelclassListviewActivity, ArrayList<ModelclassListView> list) {
        this.list=list;
        this.modelclassListviewActivity=modelclassListviewActivity;
    }

    @Override
    public int getCount() {
        return list.size();
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view = LayoutInflater.from(modelclassListviewActivity).inflate(R.layout.modelclass_listview_item_file,null);
        TextView txtname = view.findViewById(R.id.txtname);
        ImageView cimg = view.findViewById(R.id.cimg);
        txtname.setText(list.get(i).name);
        cimg.setImageResource(list.get(i).image);
        return view;
    }
}

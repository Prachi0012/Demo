package com.example.demo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {
    RecyclerviewActivity recyclerviewActivity;
    String[] singer;
    public RecyclerviewAdapter(RecyclerviewActivity recyclerviewActivity, String[] singer) {
        this.recyclerviewActivity = recyclerviewActivity;
        this.singer = singer;
    }
    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(recyclerviewActivity).inflate(R.layout.recyclerview_item_file, parent, false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.MyViewHolder holder, int position) {
        holder.txtname.setText(singer[position]);
    }
    @Override
    public int getItemCount() {

        return singer.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtname;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.txtname);
        }
    }
}
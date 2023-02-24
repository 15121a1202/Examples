package com.example.recyclerview_example;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class fruitsListAdapter extends RecyclerView.Adapter<fruitsListAdapter.ViewHolder>  {

    private ArrayList<Fruits> fruits = new ArrayList<>();
    private Context context;

    public fruitsListAdapter(Context context) {
        this.context =context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruits_list_items,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.fruitsname.setText(fruits.get(position).getName());
        holder.fruitsclr.setText(fruits.get(position).getColor());

        Glide.with(context).asBitmap().load(fruits.get(position).getImageurl()).into(holder.fruitsImage);

    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    public void setFruits(ArrayList<Fruits> fruits) {
        this.fruits = fruits;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView fruitsname;
        private TextView fruitsclr;
        private ImageView fruitsImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitsname = itemView.findViewById(R.id.fruitsName);
            fruitsclr = itemView.findViewById(R.id.fruitsclr);
            fruitsImage = itemView.findViewById(R.id.fruitsImage);
        }
    }
}

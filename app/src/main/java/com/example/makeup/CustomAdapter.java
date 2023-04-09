package com.example.makeup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    List<Pojo> list;
    Context context;

    public CustomAdapter(List<Pojo> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).getImage_link()).error(R.drawable.error_img).into(holder.image_link);
        holder.name.setText(list.get(position).getName());
        holder.price_sign.setText(list.get(position).getPrice_sign());
        holder.price.setText(list.get(position).getPrice());
        holder.description.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image_link;
        TextView name,price_sign,price,description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_link = itemView.findViewById(R.id.image_link);
            name = itemView.findViewById(R.id.name);
            price_sign = itemView.findViewById(R.id.price_sign);
            price = itemView.findViewById(R.id.price);
            description = itemView.findViewById(R.id.description);
        }
    }
}

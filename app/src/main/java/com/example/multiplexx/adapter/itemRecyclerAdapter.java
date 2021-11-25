package com.example.multiplexx.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.multiplexx.R;
import com.example.multiplexx.model.categoryitem;

import java.util.List;

public class itemRecyclerAdapter extends RecyclerView.Adapter<itemRecyclerAdapter.itemViewHolder>
{

    Context context;
    List<categoryitem> categoryitemList;

    public itemRecyclerAdapter(Context context, List<categoryitem> categoryitemList) {
        this.context = context;
        this.categoryitemList = categoryitemList;
    }

    @NonNull

    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemViewHolder(LayoutInflater.from(context).inflate(R.layout.sam_recycler_row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {

        Glide.with(context).load(categoryitemList.get(position).getImageUrl()).into(holder.itemImage);

        holder.itemImage.setOnClickListener(v -> Toast.makeText(context,""+categoryitemList.get(position).getMovieName(),Toast.LENGTH_SHORT).show());
    }


    @Override
    public int getItemCount() {
        return categoryitemList.size();
    }

    public static final class itemViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage=itemView.findViewById(R.id.item_image);
        }
    }
}

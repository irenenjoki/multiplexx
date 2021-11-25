package com.example.multiplexx.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.multiplexx.R;

import java.util.List;

public class MultiplexxPagerAdapter extends PagerAdapter {
    Context context;
    List<Multiplexx> multiplexxList;



    public MultiplexxPagerAdapter(Context context, List<Multiplexx> multiplexxList) {
        this.context = context;
        this.multiplexxList = multiplexxList;
    }

    @Override
    public int getCount() {
        return multiplexxList.size();

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull  ViewGroup container, int position, @NonNull  Object object) {
        container.removeView((View)object);
    }

    @NonNull

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       @SuppressLint("InflateParams") View view=LayoutInflater.from(context).inflate(R.layout.multiplexx_layout,null);
       ImageView multiplexxImage=view.findViewById(R.id.multiplex_image);

       Glide.with(context).load(multiplexxList.get(position).getImageUrl()).into(multiplexxImage);

       container.addView(view);
       multiplexxImage.setOnClickListener(v -> Toast.makeText(context,""+multiplexxList.get(position).getImageUrl(), Toast.LENGTH_SHORT).show());
       return view;
    }
}


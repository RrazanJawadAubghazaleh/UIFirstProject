package com.example.fisrttaskui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.fisrttaskui.R;
import com.example.fisrttaskui.model.PropertiesHome;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.viewitem> {


    ArrayList<PropertiesHome> items;
    private Context context;


    public RecycleAdapter(Context context) {
        this.context = context;
    }


    //onCreateViewHolder used to HAndle on Clicks
    @Override
    public viewitem onCreateViewHolder(final ViewGroup parent, int viewType) {

        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_hottest_properties, parent, false);
        return new viewitem(itemView);
    }


    //to fill each item with data from the array depending on position
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final viewitem holder, final int position) {

      holder.imageViewPropertiesHome.setImageResource(items.get(position).getImage());
      holder.tvName.setText(items.get(position).getName());
      holder.tvplace.setText(items.get(position).getPlace());
      holder.tvPrice.setText(items.get(position).getPrice());

    }


    @Override
    public int getItemCount() {
        if (items == null)
            return 0;

        return items.size();
    }

    public void setList(ArrayList<PropertiesHome> list) {
        this.items = list;
        notifyDataSetChanged();
    }




    class viewitem extends RecyclerView.ViewHolder {

        //Declare
       // ImageView image;
        TextView tvName,tvplace,tvPrice;
        ImageView imageViewHarte;
        SimpleDraweeView imageViewPropertiesHome ;
        //initialize
        public viewitem(View itemView) {
            super(itemView);
            imageViewPropertiesHome = (SimpleDraweeView)itemView.findViewById(R.id.my_image_view_home);
            tvName=  itemView.findViewById(R.id.tv_name_hottest);
            imageViewHarte=  itemView.findViewById(R.id.my_heart);
            tvplace=  itemView.findViewById(R.id.tv_place_home);
            tvPrice=  itemView.findViewById(R.id.tv_price_home);

        }
    }

}


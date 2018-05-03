package com.luisro00005513.hoysifragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StockAdapter extends RecyclerView.Adapter<StockViewHolder>{

    List <Item> stock_list;

    public StockAdapter(ArrayList<Item> item_list) {
    }

    @Override
    public StockViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View stock_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_stock,parent,false);

        return new StockViewHolder(stock_view);
    }

            /*   this.item_code = item_code;
        this.item_name = item_name;
        this.item_quntity = item_quntity;
        this.item_price = item_price;
        this.item_cost = item_cost;
        this.item_image = item_image;*/

    @Override
    public void onBindViewHolder(StockViewHolder holder, int position) {
        holder.txt_code.setText(stock_list.get(position).getItem_code());
        holder.txt_name.setText(stock_list.get(position).getItem_name());
        holder.txt_qty.setText(stock_list.get(position).getItem_quntity());
        holder.txt_price.setText(stock_list.get(position).getItem_price());
        holder.txt_price.setText(stock_list.get(position).getItem_price());
        holder.img_stock.setImageResource(stock_list.get(position).getItem_image());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

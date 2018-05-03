package com.luisro00005513.hoysifragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StockViewHolder extends RecyclerView.ViewHolder {

            /*   this.item_code = item_code;
        this.item_name = item_name;
        this.item_quntity = item_quntity;
        this.item_price = item_price;
        this.item_cost = item_cost;
        this.item_image = item_image;*/

     TextView txt_code;
     TextView txt_name;
     TextView txt_qty;
     TextView txt_price;
     TextView txt_cost;
     ImageView img_stock;

    public StockViewHolder(View itemView) {
        super(itemView);
        txt_code = (TextView) itemView.findViewById(R.id.item_code);
        txt_name = (TextView)itemView.findViewById(R.id.item_name);
        txt_qty = (TextView)itemView.findViewById(R.id.quantity);
        txt_price = (TextView) itemView.findViewById(R.id.price);
        txt_cost = (TextView) itemView.findViewById(R.id.cost);
        img_stock = (ImageView) itemView.findViewById(R.id.stock_image);
    }
}

package com.planet01.kioske.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.cart_items_model;

import java.util.ArrayList;
import java.util.List;

public class TabCartViewAdaptor extends RecyclerView.Adapter<TabCartViewAdaptor.ViewHolder> {

  private List<cart_items_model>  cart_items_model_list;
    Context context;
   public  TabCartViewAdaptor(Context context,List<cart_items_model> cart_items_model_list) {
    this.context = context;
   this.cart_items_model_list = cart_items_model_list;
}

    @NonNull
    @Override
    public TabCartViewAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
LayoutInflater inflater = LayoutInflater.from(context);
View v = inflater.inflate(R.layout.my_cart_rv,null);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull TabCartViewAdaptor.ViewHolder holder, int position) {
cart_items_model cart_items_model = cart_items_model_list.get(position);
        holder.prdct_name.setText(cart_items_model.getProduct_title());
        holder.prdct_size.setText(cart_items_model.getProduct_size());
        holder.prdct_price.setText(String.valueOf(cart_items_model.getProduct_price()));
        holder.prdct_image.setImageDrawable(context.getResources().getDrawable(cart_items_model.getProduct_image()));
    }
    @Override
    public int getItemCount() {
        return cart_items_model_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

    TextView prdct_name;
        TextView prdct_price;
        TextView prdct_size;
    ImageView prdct_image;
    Button  add_to_cart_btn;
    ImageButton add_cart_item_btn,minus_cart_itembtn;
    LinearLayout btnlayout,counter_btn_layout;
        TextView counter_text;
        int counter = 1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            prdct_name = (TextView)itemView.findViewById(R.id.product_name);
            prdct_size = (TextView)itemView.findViewById(R.id.product_size);
            prdct_price = (TextView)itemView.findViewById(R.id.product_price);
            prdct_image = (ImageView)itemView.findViewById(R.id.product_image);
            counter_text =(TextView)itemView.findViewById(R.id.cart_counter);
            add_to_cart_btn = (Button)itemView.findViewById(R.id.Add_to_cart_btn);
            counter_btn_layout = (LinearLayout)itemView.findViewById(R.id.counter_btn_layout);
            btnlayout = (LinearLayout)itemView.findViewById(R.id.button_layout);
            add_cart_item_btn = itemView.findViewById(R.id.add_button);
            minus_cart_itembtn= itemView.findViewById(R.id.minus_button);
            add_to_cart_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counter_btn_layout.setVisibility(View.GONE);
                    btnlayout.setVisibility(View.VISIBLE);
                }
            });

add_cart_item_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        counter++;
        counter_text.setText(Integer.toString(counter));
    }
});

minus_cart_itembtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (counter == 0){
            minus_cart_itembtn.setEnabled(false);
        } else
            counter--;
        counter_text.setText(Integer.toString(counter));
        minus_cart_itembtn.setEnabled(true);


    }
});
        }



    }
}

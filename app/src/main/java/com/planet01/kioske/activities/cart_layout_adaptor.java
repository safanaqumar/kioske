package com.planet01.kioske.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.cart_layout_model;

import java.util.List;

public class cart_layout_adaptor extends RecyclerView.Adapter<cart_layout_adaptor.ViewHolder> {

    Context context;
    private List<cart_layout_model> cart_layout_modelList;

    public cart_layout_adaptor(Context context, List<cart_layout_model> cart_layout_modelList) {
        this.context = context;
        this.cart_layout_modelList = cart_layout_modelList;

    }

    @NonNull
    @Override
    public cart_layout_adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cart_layout_rv, null);
        ViewHolder vh = new ViewHolder(v);


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull cart_layout_adaptor.ViewHolder holder, int position) {
        cart_layout_model cart_layout_model = cart_layout_modelList.get(position);
        holder.cart_layout_prdct_name.setText(cart_layout_model.getCart_layout_product_title());
        holder.cart_layout_prdct_size.setText(cart_layout_model.getCart_layout_product_size());
        holder.cart_layout_prdct_price.setText(String.valueOf(cart_layout_model.getCart_layout_product_price()));
        holder.cart_layout_prdct_image.setImageDrawable(context.getResources().getDrawable(cart_layout_model.getCart_layout_product_image()));
    }

    @Override
    public int getItemCount() {
        return cart_layout_modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        int counter = 1;
        TextView cart_layout_prdct_name;
        TextView cart_layout_prdct_price;
        TextView cart_layout_prdct_size;
        ImageView cart_layout_prdct_image;
        ImageButton cart_layout_add_btn, cart_layout_minus_btn;
        TextView layout_cart_view_counter_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cart_layout_prdct_name = itemView.findViewById(R.id.layout_cart_view_name);
            cart_layout_prdct_price = itemView.findViewById(R.id.layout_cart_view_price);
            cart_layout_prdct_size = itemView.findViewById(R.id.layout_cart_view_size);
            cart_layout_prdct_image = itemView.findViewById(R.id.layout_cart_view_image);
            cart_layout_add_btn = itemView.findViewById(R.id.layout_add_cart_view_button);
            cart_layout_minus_btn = itemView.findViewById(R.id.layout_cart_view_minus_button);
            layout_cart_view_counter_text = itemView.findViewById(R.id.layout_cart_view_counter_text);

            cart_layout_add_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counter++;
                    layout_cart_view_counter_text.setText(Integer.toString(counter));
                }
            });
            cart_layout_minus_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (counter == 0) {
                        cart_layout_minus_btn.setEnabled(false);

                    } else
                        counter--;
                    layout_cart_view_counter_text.setText(Integer.toString(counter));

                    cart_layout_minus_btn.setEnabled(true);

                }
            });
        }
    }
}

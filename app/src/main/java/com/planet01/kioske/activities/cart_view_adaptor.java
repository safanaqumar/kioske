package com.planet01.kioske.activities;

import android.content.Context;
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
import com.planet01.kioske.activities.Model.cart_products_model;

import java.util.List;

public class cart_view_adaptor extends RecyclerView.Adapter<cart_view_adaptor.ViewHolder> {

    private List<cart_products_model> cart_products_model_list;
    Context context;
    public  cart_view_adaptor(Context context,List<cart_products_model> cart_products_model_list) {
        this.context = context;
        this.cart_products_model_list=cart_products_model_list;

    }


    @NonNull
    @Override
    public cart_view_adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.my_cart_products,null);
      ViewHolder vh = new ViewHolder(v);
// set the view's size, margins, paddings and layout parameters
        // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull cart_view_adaptor.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return cart_products_model_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView cart_view_name;
        TextView cart_view_price;
        TextView cart_view_size;
        ImageView cart_view_image;
        Button cart_view_button;
        ImageButton cart_view_add_item_btn,cart_view_minus_item_btn;
        LinearLayout cart_view_layout,cart_view_btn_layout;
        TextView cart_view_counter_text;
        int counter = 1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cart_view_name = itemView.findViewById(R.id.cart_view_name);
            cart_view_price = itemView.findViewById(R.id.cart_view_price);
            cart_view_size = itemView.findViewById(R.id.cart_view_size);
            cart_view_image = itemView.findViewById(R.id.cart_view_image);
         //   cart_view_button= itemView.findViewById(R.id.rv_add_to_cart_view_btn);
         //   cart_view_btn_layout = itemView.findViewById(R.id.cart_view_btn_layout);
            cart_view_layout = itemView.findViewById(R.id.cart_view_layout);
            cart_view_add_item_btn = itemView.findViewById(R.id.add_cart_view_button);
            cart_view_minus_item_btn=itemView.findViewById(R.id.cart_view_minus_button);
            cart_view_counter_text = itemView.findViewById(R.id.cart_view_counter_text);

          /*  cart_view_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cart_view_btn_layout.setVisibility(View.GONE);
                    cart_view_layout.setVisibility(View.VISIBLE);

                }
            });
cart_view_add_item_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        counter++;
        cart_view_counter_text.setText(Integer.toString(counter));
    }
});
cart_view_minus_item_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (counter == 0){
            cart_view_minus_item_btn.setEnabled(false);

        } else
            counter--;
        cart_view_counter_text.setText(Integer.toString(counter));

        cart_view_minus_item_btn.setEnabled(true);

    }
});*/


        }
    }
}

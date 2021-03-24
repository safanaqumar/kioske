package com.planet01.kioske.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.cart_products_model;

import java.util.ArrayList;
import java.util.List;

public class Activity_cart_layout  extends AppCompatActivity {

    public TextView counter_text;
RecyclerView.LayoutManager layoutManager;

List<cart_products_model> cart_products_model_list;
    int counter = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cart_view_order_again);
        RecyclerView recyclerView = findViewById(R.id.rv_cart_view);
        recyclerView.hasFixedSize();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cart_products_model_list = new ArrayList<>();
        cart_products_model_list.add(new cart_products_model("chetoes","23.5",60,R.drawable.kiosk_appicon));
        cart_products_model_list.add(new cart_products_model("lays","2.5",622000,R.drawable.kiosk_appicon));
        cart_products_model_list.add(new cart_products_model("chetoes","3.5",60030,R.drawable.kiosk_appicon));
        cart_products_model_list.add(new cart_products_model("chetoes","23",60500,R.drawable.kiosk_appicon));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        cart_view_adaptor cart_view_adaptor1 = new cart_view_adaptor(Activity_cart_layout.this, cart_products_model_list);
        recyclerView.setAdapter(cart_view_adaptor1);


    }


}

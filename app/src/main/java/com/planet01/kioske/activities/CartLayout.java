package com.planet01.kioske.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.cart_layout_model;

import java.util.ArrayList;
import java.util.List;

public class CartLayout extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    List<cart_layout_model> cart_layout_modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_activity);
        recyclerView = (RecyclerView) findViewById(R.id.cart_layout_rv);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cart_layout_modelList = new ArrayList<>();
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));
        cart_layout_modelList.add(new cart_layout_model("Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        cart_layout_adaptor customAdapter = new cart_layout_adaptor(CartLayout.this, cart_layout_modelList);
        recyclerView.setAdapter(customAdapter);

    }



}

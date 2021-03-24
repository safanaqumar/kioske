package com.planet01.kioske.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;
import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.cart_items_model;

import java.util.ArrayList;
import java.util.List;

public class Every_day_essentails extends AppCompatActivity {

    TabLayout tabLayout;
    RecyclerView recyclerView;
List<cart_items_model> cart_items_modelList;
Button add_to_cart_btn;
LinearLayout btnlayout,counter_btn_layout;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_everyday_essentials);
         btnlayout = findViewById(R.id.button_layout);
        // add_to_cart_btn = findViewById(R.id.Add_to_cart_btn);
       counter_btn_layout = findViewById(R.id.counter_btn_layout);
        recyclerView = (RecyclerView) findViewById(R.id.tabs_rv);
        recyclerView.hasFixedSize();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cart_items_modelList = new ArrayList<>();

        cart_items_modelList.add(
                new cart_items_model(
                        1,
                        "Dalda cooking oil",
                        "4.5",
                        60000,
                        R.drawable.kiosk_appicon));
        cart_items_modelList.add(
                new cart_items_model(
                        2,
                        "lays",
                        "2.3",
                        43000,
                        R.drawable.kiosk_appicon));
        cart_items_modelList.add(
                new cart_items_model(
                        3,
                        "oreo",
                        "1.35mm",
                        4.3,
                        R.drawable.kiosk_appicon));
        cart_items_modelList.add(
                new cart_items_model(
                        4,
                        "cake",
                        "15 gm",
                        4.35,
                        R.drawable.kiosk_appicon));
        cart_items_modelList.add(
                new cart_items_model(
                        5,
                        "prince",
                        "1 gm",
                        5.35,
                        R.drawable.kiosk_appicon));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        TabCartViewAdaptor customAdapter = new TabCartViewAdaptor(Every_day_essentails.this, cart_items_modelList);
        recyclerView.setAdapter(customAdapter);
        //Tab layout implimentation
        tabLayout = (TabLayout) findViewById(R.id.tabs_layout);
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("First");
        tabLayout.addTab(firstTab);
        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Second");
        tabLayout.addTab(secondTab);
        TabLayout.Tab ThirdTab = tabLayout.newTab();
        ThirdTab.setText("Third");
        tabLayout.addTab(ThirdTab);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}

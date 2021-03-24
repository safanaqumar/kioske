package com.planet01.kioske;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.planet01.kioske.activities.Every_day_essentails;
import com.planet01.kioske.activities.Model.search_result_model;
import com.planet01.kioske.activities.SearchResultAdaptor;
import com.planet01.kioske.activities.TabCartViewAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Search_result extends AppCompatActivity {
RecyclerView recyclerView;
List<search_result_model> search_result_modelList;
RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        recyclerView = (RecyclerView) findViewById(R.id.searchResult_rv);
        recyclerView.hasFixedSize();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        search_result_modelList = new ArrayList<>();
        search_result_modelList.add(new search_result_model(
                "Dalda cooking oil",
                "4.5",
                60000,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "Mailo",
                "4.5",
                60,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "cooking oil",
                "4.5",
                6,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "oil",
                "5",
                60,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "Dalda",
                "4",
                500,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "Dalda",
                "4",
                500,
                R.drawable.kiosk_appicon
        ));
        search_result_modelList.add(new search_result_model(
                "Dalda",
                "4",
                500,
                R.drawable.kiosk_appicon
        ));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        SearchResultAdaptor customAdapter = new SearchResultAdaptor(Search_result.this, search_result_modelList);
        recyclerView.setAdapter(customAdapter);

    }
}
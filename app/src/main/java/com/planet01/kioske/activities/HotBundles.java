package com.planet01.kioske.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.planet01.kioske.R;

public class HotBundles extends AppCompatActivity {
Button order_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_for_bundles);
initViews();
onClick();

        //  getSupportFragmentManager().beginTransaction().replace(R.id.frame_koski,new OrgerAgainFragment()).commit();
    }

    private void onClick() {
        order_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotBundles.this,Every_day_essentails.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        order_now = findViewById(R.id.order_now);
    }
}

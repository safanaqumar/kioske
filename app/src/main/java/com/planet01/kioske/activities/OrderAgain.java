package com.planet01.kioske.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.planet01.kioske.R;

public class OrderAgain extends AppCompatActivity {
Button order_again;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_again);
initViews();
onClickViews();
      //  getSupportFragmentManager().beginTransaction().replace(R.id.frame_koski,new OrgerAgainFragment()).commit();
    }
    private void initViews() {

        order_again = findViewById(R.id.add_to_cart);
    }

    private void onClickViews() {

        order_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OrderAgain.this,CartLayout.class);
                startActivity(intent);
            }
        });
    }


}
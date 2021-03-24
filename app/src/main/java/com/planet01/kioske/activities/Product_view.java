package com.planet01.kioske.activities;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.slider.Slider;
import com.planet01.kioske.R;

import java.util.ArrayList;
import java.util.List;

public class Product_view  extends AppCompatActivity {

   public TextView counter_text;
   ViewFlipper viewFlipper;
    int counter = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_view);

        initViews();
        int images[]  = {R.drawable.kiosk_appicon,R.drawable.kiosk_appicon,R.drawable.kiosk_appicon};
        
        viewFlipper = findViewById(R.id.Slider);

for (int i = 0 ; i < images.length; i++)
{
    Sliderimages(images[i]);
}
    }

    public void Sliderimages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_left);
    }

    public  void increaseInteger(View view){
    counter++;
    counter_text.setText(Integer.toString(counter));

}

    public  void DecreaseInteger(View view){
        if (counter == 0){
         //   minus_cart_itembtn.setEnabled(false);

        } else
            counter--;
        counter_text.setText(Integer.toString(counter));

  //      minus_cart_itembtn.setEnabled(true);
    }


    private void initViews() {


        counter_text = findViewById(R.id.cart_counter);
        
    }
}

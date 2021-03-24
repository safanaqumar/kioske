package com.planet01.kioske.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.planet01.kioske.R;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {
Button login_button;
TextView signup;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
initviews();
onClickViews();
    }

    private void onClickViews() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);

            }
        });
 signup.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent = new Intent(Login.this,Signup.class);
         startActivity(intent);
     }
 });

    }



    private void initviews() {
        login_button= findViewById(R.id.btnlogIn);
        signup = findViewById(R.id.btn_signup);
    }

}
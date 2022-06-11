package com.example.chaletbooking.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chaletbooking.R;
import com.example.chaletbooking.fragments.HomeFragment;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



            Button btnLogin = findViewById(R.id.btnLogin);
            Button btnReg = findViewById(R.id.btnReg);


        btnReg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(home.this, Register.class);
                    startActivity(intent);
                }
            });

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(home.this, login.class);
                    startActivity(intent);
                }
            });
        }
    }

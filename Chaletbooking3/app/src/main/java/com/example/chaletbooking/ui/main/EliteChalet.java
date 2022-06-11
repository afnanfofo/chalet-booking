package com.example.chaletbooking.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chaletbooking.R;
import com.example.chaletbooking.pojo.ChaletModel;

public class EliteChalet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elite_chalet);

        Intent in = getIntent();
        ChaletModel model = (ChaletModel) in.getSerializableExtra("model");

        TextView Title = findViewById(R.id.Title);
        Title.setText(model.getTitle());


        Button BookBtn = findViewById(R.id.BookBtn);
        BookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EliteChalet.this, Booking.class);
                intent.putExtra("id", model.getId());
                intent.putExtra("price", model.getPrice());
                startActivity(intent);
                finish();
            }
        });
    }
}


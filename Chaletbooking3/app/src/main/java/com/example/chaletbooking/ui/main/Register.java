package com.example.chaletbooking.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chaletbooking.R;
import com.example.chaletbooking.pojo.Model;
import com.example.chaletbooking.API.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    EditText editt1, editt2, editt3, editt4;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        editt1 = (EditText) findViewById(R.id.editt1);
        editt2 = (EditText) findViewById(R.id.editt2);
        editt3 = (EditText) findViewById(R.id.editt3);
        editt4 = (EditText) findViewById(R.id.editt4);
        btnReg = (Button) findViewById(R.id.btnReg);


        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Model model = new Model(editt1.getText().toString(), editt2.getText().toString(), Integer.parseInt(editt4.getText().toString()));

                Call<Model> user = retrofit.getInstance().setUser(model);
                user.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {
                        Toast.makeText(Register.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Register.this, login.class);
                        startActivity(i);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        Toast.makeText(Register.this, "error occurs ", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }
}



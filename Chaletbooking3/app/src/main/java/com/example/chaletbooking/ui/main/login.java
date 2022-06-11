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

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {
    EditText edit1, edit2;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        loginBtn = (Button) findViewById(R.id.btnBook);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<List<Model>> user = retrofit.getInstance().getUser(edit1.getText().toString(), edit2.getText().toString());
                user.enqueue(new Callback<List<Model>>() {
                    @Override
                    public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                        Toast.makeText(login.this, "Login Successffuly", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                        finish();

                    }

                    @Override
                    public void onFailure(Call<List<Model>> call, Throwable t) {
                        Toast.makeText(login.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
}
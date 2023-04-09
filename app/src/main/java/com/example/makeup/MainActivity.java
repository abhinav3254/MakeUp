package com.example.makeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.makeup.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    API.ApiInstance api;

    List<Pojo> list;
    CustomAdapter adapter;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Please Wait..");
        progressDialog.setMessage("Preparing to load..");
        progressDialog.show();

        apiMethod("lipstick");


        binding.blush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.blush.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.bronzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.bronzer.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.eyebrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.eyebrow.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.eyeliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.eyeliner.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.eyeshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.eyeshadow.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.foundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.foundation.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });
        binding.lipLiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = "lip_liner";
                apiMethod(name);
            }
        });
        binding.lipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.lipstick.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });

        binding.mascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = binding.mascara.getText().toString().toLowerCase();
                apiMethod(name);
            }
        });

        binding.nailPolish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                String name = "nail_polish";
                apiMethod(name);
            }
        });


    }

    public void apiMethod(String name) {
        api = API.RetrofitInstance.getRetrofit().create(API.ApiInstance.class);
        api.getAll(name).enqueue(new Callback<List<Pojo>>() {
            @Override
            public void onResponse(Call<List<Pojo>> call, Response<List<Pojo>> response) {
                progressDialog.dismiss();
                list = response.body();
                binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                adapter = new CustomAdapter(list,MainActivity.this);
                binding.recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Pojo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
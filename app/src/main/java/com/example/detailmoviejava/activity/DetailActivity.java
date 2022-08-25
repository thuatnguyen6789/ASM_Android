package com.example.detailmoviejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.detailmoviejava.R;
import com.example.detailmoviejava.model.Movie;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent shipper = getIntent();
        String name = shipper.getStringExtra("NAME");
        TextView tvName = findViewById(R.id.tvName);
        tvName.setText(name);
        String create_at = shipper.getStringExtra("CREATE_AT");
        TextView tvCreate_at = findViewById(R.id.tvCreate_at);
        tvCreate_at.setText(create_at);
        String thumbnail = shipper.getStringExtra("THUMBNAIL");
        ImageView ivCover = findViewById(R.id.ivCover);
        Glide.with(this).load(thumbnail).into(ivCover);
        String description = shipper.getStringExtra("DESCRIPTION");
        TextView tvDes = findViewById(R.id.tvDes);
        tvDes.setText(description);
        String typeOf = shipper.getStringExtra("TYPE_OF_MOVIE");
        TextView tvType = findViewById(R.id.tvType);
        tvType.setText(typeOf);
        String director = shipper.getStringExtra("DIRECTOR");
        TextView tvDirector = findViewById(R.id.tvDirector);
        tvDirector.setText(director);
    }
}
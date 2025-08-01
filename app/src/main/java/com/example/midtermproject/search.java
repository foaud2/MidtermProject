package com.example.midtermproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView TV1 = findViewById(R.id.tv5_1);
        TextView TV2 = findViewById(R.id.tv5_2);
        TextView TV3 = findViewById(R.id.tv5_3);
        TextView TV4 = findViewById(R.id.tv5_4);
        TextView TV5 = findViewById(R.id.tv5_5);
        TextView TV6 = findViewById(R.id.tv5_6);
        TextView TV7 = findViewById(R.id.tv5_7);
        TextView TV8 = findViewById(R.id.tv5_8);
        TextView TV9 = findViewById(R.id.tv5_9);
        TextView TV10 = findViewById(R.id.tv5_10);
        TextView TV11 = findViewById(R.id.tv5_11);
        ImageView IM1 =findViewById(R.id.im5_1);
        ImageView IM2 =findViewById(R.id.im5_2);
        ImageView Im1 = findViewById(R.id.img_home);
        ImageView Im2 = findViewById(R.id.imgsersh);
        ImageView Im3 = findViewById(R.id.imgWishlist);
        ImageView Im4 = findViewById(R.id.imgProfile);
        TextView profil = findViewById(R.id.TVProfile);
        TextView Wishlist = findViewById(R.id.TVWishlist);
        TextView Browse = findViewById(R.id.TVsersh);
        TextView Home = findViewById(R.id.TV_home);

        Im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(search.this,profil.class);
                startActivity(a);
            }
        });
        Im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(search.this,Favorites.class);
                startActivity(b);
            }
        });
        Im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(search.this,home.class);
                startActivity(c);
            }
        });


    }
}
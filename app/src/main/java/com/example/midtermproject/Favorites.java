package com.example.midtermproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorites);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView Tv1 = findViewById(R.id.tv6_1);
        ImageView IM1 = findViewById(R.id.im6_1);
        ImageView IM2 = findViewById(R.id.im6_2);
        ImageView IM3 = findViewById(R.id.im6_3);
        TextView Tv2 =findViewById(R.id.tv6_2);
        TextView Tv3 =findViewById(R.id.tv6_3);
        TextView Tv4 =findViewById(R.id.tv6_4);
        TextView Tv5 =findViewById(R.id.tv6_5);
        TextView Tv6 =findViewById(R.id.tv6_6);
        TextView Tv7 =findViewById(R.id.tv6_7);
        TextView Tv8 =findViewById(R.id.tv6_8);
        TextView Tv9 =findViewById(R.id.tv6_9);
        TextView Tv10 =findViewById(R.id.tv6_10);
        TextView Tv11=findViewById(R.id.tv6_11);
        TextView Tv12=findViewById(R.id.tv6_12);
        TextView Tv13=findViewById(R.id.tv6_13);
        TextView Tv14 =findViewById(R.id.tv6_14);
        TextView Tv15=findViewById(R.id.tv6_15);
        TextView Tv16=findViewById(R.id.tv6_16);
        TextView Tv17=findViewById(R.id.tv6_17);
        TextView Tv18=findViewById(R.id.tv6_18);
        TextView Tv19=findViewById(R.id.tv6_19);
        TextView Tv20=findViewById(R.id.tv6_20);
        TextView Tv21=findViewById(R.id.tv6_21);
        TextView Tv22=findViewById(R.id.tv6_22);
        ImageView Im1 = findViewById(R.id.img_home);
        ImageView Im2 = findViewById(R.id.imgsersh);
        ImageView Im3 = findViewById(R.id.imgWishlist);
        ImageView Im4 = findViewById(R.id.imgProfile);
        TextView profil = findViewById(R.id.TVProfile);
        TextView Wishlist = findViewById(R.id.TVWishlist);
        TextView Browse = findViewById(R.id.TVsersh);
        TextView Home = findViewById(R.id.TV_home);
        Button BT1 = findViewById(R.id.Bu6_1);

        Im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Favorites.this,profil.class);
                startActivity(a);
            }
        });
        Im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Favorites.this,search.class);
                startActivity(b);
            }
        });
        Im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Favorites.this,home.class);
                startActivity(c);
            }
        });
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Favorites.this,cart.class);
                startActivity(d);
            }
        });


    }
}


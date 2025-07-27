package com.example.midtermproject;

import android.content.Intent;
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

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView TV1=findViewById(R.id.tv7_1);
        TextView TV2=findViewById(R.id.tv7_2);
        ImageView IV =findViewById(R.id.im7_2);
        ImageButton ImB1 = findViewById(R.id.icon7_1);
        ImageButton ImB2 = findViewById(R.id.icon7_2);
        ImageButton ImB3 = findViewById(R.id.icon7_3);
        ImageButton ImB4 = findViewById(R.id.icon7_4);
        TextView profil = findViewById(R.id.profil);
        TextView Wishlist = findViewById(R.id.Wishlist);
        TextView Browse = findViewById(R.id.Browse);
        TextView Home = findViewById(R.id.Home);
        Button BT1 = findViewById(R.id.Bt7_1);
        Button BT2 = findViewById(R.id.Bt7_2);
        Button BT3 = findViewById(R.id.Bt7_3);
        Button BT4 = findViewById(R.id.Bt7_4);
        Button BT5 = findViewById(R.id.Bt7_5);

        ImB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(profil.this,search.class);
                startActivity(a);
            }
        });
        ImB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(profil.this,Favorites.class);
                startActivity(b);
            }
        });
        ImB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(profil.this,home.class);
                startActivity(c);
            }
        });

    }
}
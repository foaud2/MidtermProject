package com.example.midtermproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton ImBtop = findViewById(R.id.icontop);
        TextView TV1 =findViewById(R.id.tv4_1);
        TextView TV2 =findViewById(R.id.tv4_2);
        ImageButton ImBWoman =findViewById(R.id.imghome2);
        ImageButton ImBMan =findViewById(R.id.imghome5);
        ImageButton ImBKid =findViewById(R.id.imghome4);
        ImageButton ImBShoes =findViewById(R.id.imghome3);
        TextView TVWoman =findViewById(R.id.tv4_3);
        TextView TVMan  =findViewById(R.id.tv4_4);
        TextView TVKid =findViewById(R.id.tv4_5);
        TextView TVShoes =findViewById(R.id.tv4_6);
        ImageButton ImB1 = findViewById(R.id.icon4_1);
        ImageButton ImB2 = findViewById(R.id.icon4_2);
        ImageButton ImB3 = findViewById(R.id.icon4_3);
        ImageButton ImB4 = findViewById(R.id.icon4_4);
        TextView profil = findViewById(R.id.profil);
        TextView Wishlist = findViewById(R.id.Wishlist);
        TextView Browse = findViewById(R.id.Browse);
        TextView Home = findViewById(R.id.Home);
        ImageView IMl1=findViewById(R.id.im4_1);
        TextView TV3=findViewById(R.id.tv4_7);
        TextView TV4=findViewById(R.id.tv4_8);
        TextView TV5=findViewById(R.id.tv4_9);
        TextView TV6=findViewById(R.id.tv4_10);
        TextView TV7=findViewById(R.id.tv4_11);
        ImageView IMl2=findViewById(R.id.im4_2);
        TextView TV8=findViewById(R.id.tv4_13);
        TextView TV9=findViewById(R.id.tv4_15);
        TextView TV10=findViewById(R.id.tv4_16);
        TextView TV11=findViewById(R.id.tv4_17);
        TextView TV12=findViewById(R.id.tv4_18);


        ImB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(home.this,profil.class);
                startActivity(a);
            }
        });
        ImB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(home.this,search.class);
                startActivity(b);
            }
        });
        ImB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(home.this,Favorites.class);
                startActivity(c);
            }
        });
        ImBMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TVWoman.setTextColor(ContextCompat.getColor(home.this, R.color.black));
                TVMan.setTextColor(ContextCompat.getColor(home.this, R.color.TealBlue));
                IMl1.setImageResource(R.drawable.img_man2);
                IMl2.setImageResource(R.drawable.img_man3);
                TV8.setText("man");
                TV3.setText("man");
            }
        });
        ImBWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TVWoman.setTextColor(ContextCompat.getColor(home.this, R.color.TealBlue));
                TVMan.setTextColor(ContextCompat.getColor(home.this, R.color.black));
                IMl1.setImageResource(R.drawable.imgsearch1);
                IMl2.setImageResource(R.drawable.imgsearch2);
                TV8.setText("Woman");
                TV3.setText("Woman");

            }
        });

        ImBtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d =new Intent(home.this,cart.class);
                startActivity(d);
            }
        });
        ImBtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e =new Intent(home.this,cart.class);
                startActivity(e);
            }
        });

    }
}


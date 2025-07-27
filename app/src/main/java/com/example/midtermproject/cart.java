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

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton ImBback=findViewById(R.id.back);
        TextView Tv1 = findViewById(R.id.tv8_1);
        ImageView IM1 = findViewById(R.id.im8_1);
        ImageView IM2 = findViewById(R.id.im8_2);
        TextView Tv2 =findViewById(R.id.tv8_2);
        TextView Tv3 =findViewById(R.id.tv8_3);
        TextView Tv4 =findViewById(R.id.tv8_4);
        TextView Tv5 =findViewById(R.id.tv8_5);
        TextView Tv6 =findViewById(R.id.tv8_6);
        TextView Tv7 =findViewById(R.id.tv8_7);
        TextView Tv8 =findViewById(R.id.tv8_8);
        TextView Tv9 =findViewById(R.id.tv8_9);
        TextView Tv10 =findViewById(R.id.tv8_10);
        TextView Tv11=findViewById(R.id.tv8_11);
        TextView Tv12=findViewById(R.id.tv8_12);
        TextView Tv13=findViewById(R.id.tv8_13);
        TextView Tv14 =findViewById(R.id.tv8_14);
        TextView Tv15=findViewById(R.id.tv8_15);
        Button BT1 =findViewById(R.id.Bu8_1);

        ImBback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a =new Intent(cart.this,home.class);
                startActivity(a);
            }
        });
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b =new Intent(cart.this,Checkout.class);
                startActivity(b);
            }
        });

    }
}
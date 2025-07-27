package com.example.midtermproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }
        );
        TextView TV1 = findViewById(R.id.tv1_1);
        TextView Tv2 =findViewById(R.id.tv1_2);
        Button   Bu1 = findViewById(R.id.Bu1_1);
        Button   Bu2 = findViewById(R.id.Bu1_2);
        Button   Bu3 = findViewById(R.id.Bu1_3);
        Bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,home.class);
                startActivity(a);

            }
        });
        Bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b =new Intent(MainActivity.this,REGISTER.class);
                startActivity(b);
            }
        });
        Bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c =new Intent(MainActivity.this,Login.class);
                startActivity(c);
            }
        });


            }



}
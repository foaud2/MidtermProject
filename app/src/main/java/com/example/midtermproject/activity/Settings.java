package com.example.midtermproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.midtermproject.R;

public class Settings extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        TextView TV1 = findViewById(R.id.TV9_1);
//        ImageButton ImB1 = findViewById(R.id.back);
        Button BT1 = findViewById(R.id.button1);
//        Button BT2 = findViewById(R.id.button2);
//        Button BT3 = findViewById(R.id.button3);
//        Button BT4 = findViewById(R.id.button4);
//        Button BT5 = findViewById(R.id.button5);

//        ImB1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(Settings.this, profil.class);
//                startActivity(a);
//            }
//        });
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b  = new Intent(Settings.this, home.class);
                startActivity(b);
            }
        });


    }
}
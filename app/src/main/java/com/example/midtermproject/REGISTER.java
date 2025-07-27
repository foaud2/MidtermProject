package com.example.midtermproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class REGISTER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView TVa1=findViewById(R.id.tv2_a1);
        EditText EDa1 =findViewById(R.id.ed2_a1);
        TextView TVa2=findViewById(R.id.tv2_a2);
        TextView TVa3=findViewById(R.id.tv2_a3);
        EditText EDa2 =findViewById(R.id.ed2_a2);
        TextView TVa4=findViewById(R.id.tv2_a4);
        TextView TV1 = findViewById(R.id.tv2_1);
        EditText ED1 =findViewById(R.id.ed2_1);
        TextView TV2 = findViewById(R.id.tv2_2);
        TextView TV3 = findViewById(R.id.tv2_3);
        TextView TV4 = findViewById(R.id.tv2_4);
        EditText ED2 =findViewById(R.id.ed2_2);
        TextView TV5 = findViewById(R.id.tv2_5);
        TextView TV6 = findViewById(R.id.tv2_6);
        Button BT1 =findViewById(R.id.Bu2_1);
        Button BT2 =findViewById(R.id.Bu2_2);
        TextView TV7 = findViewById(R.id.tv2_7);
        Button BT3 =findViewById(R.id.Bu2_3);
        Button BT4 =findViewById(R.id.Bu2_4);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(REGISTER.this,Login.class);
                startActivity(a);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(REGISTER.this, home.class);
                startActivity(b);
            }
        });
    }
}
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

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView TV1 = findViewById(R.id.tv3_1);
        EditText ED1 =findViewById(R.id.ed3_1);
        TextView TV2 = findViewById(R.id.tv3_2);
        TextView TV3 = findViewById(R.id.tv3_3);
        TextView TV4 = findViewById(R.id.tv3_4);
        EditText ED2 =findViewById(R.id.ed3_2);
        TextView TV5 = findViewById(R.id.tv3_5);
        TextView TV6 = findViewById(R.id.tv3_6);
        Button BT1 =findViewById(R.id.Bu3_1);
        Button BT2 =findViewById(R.id.Bu3_2);
        TextView TV7 = findViewById(R.id.tv3_7);
        Button BT3 =findViewById(R.id.Bu3_3);
        Button BT4 =findViewById(R.id.Bu3_4);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Login.this,REGISTER.class);
                startActivity(a);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Login.this, home.class);
                startActivity(b);
            }
        });



    }
}
package com.example.midtermproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.midtermproject.Fragments.new2_Fragments;
import com.example.midtermproject.Fragments.new_Framents;
import com.example.midtermproject.R;

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
        FrameLayout FrameLayout = findViewById(R.id.FrameLayout);
        FrameLayout FrameLayout2 = findViewById(R.id.frameLayout22);
        new_Framents new_Framents =new new_Framents();
        new2_Fragments new2_Framents=new new2_Fragments();
        FragmentManager myFragmentManager=getSupportFragmentManager();
        FragmentTransaction myFragmentTransaction=myFragmentManager.beginTransaction();
        myFragmentTransaction.add(R.id.FrameLayout,new_Framents);
        myFragmentTransaction.add(R.id.frameLayout22,new2_Framents);
        myFragmentTransaction.commit();
    }
}

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
//        TextView TV1=findViewById(R.id.tv7_1);
//        TextView TV2=findViewById(R.id.tv7_2);
//        ImageView IV =findViewById(R.id.im7_2);
//        ImageView Im1 = findViewById(R.id.img_home);
//        ImageView Im2 = findViewById(R.id.imgsersh);
//        ImageView Im3 = findViewById(R.id.imgWishlist);
//        ImageView Im4 = findViewById(R.id.imgProfile);
//        TextView profil = findViewById(R.id.TVProfile);
//        TextView Wishlist = findViewById(R.id.TVWishlist);
//        TextView Browse = findViewById(R.id.TVsersh);
//        TextView Home = findViewById(R.id.TV_home);
//        Button BT1 = findViewById(R.id.Bt7_1);
//        Button BT2 = findViewById(R.id.Bt7_2);
//        Button BT3 = findViewById(R.id.Bt7_3);
//        Button BT4 = findViewById(R.id.Bt7_4);
//        Button BT5 = findViewById(R.id.Bt7_5);


//        Im2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(profil.this,search.class);
//                startActivity(a);
//            }
//        });
//        Im3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent b = new Intent(profil.this,Favorites.class);
//                startActivity(b);
//            }
//        });
//        Im1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent c = new Intent(profil.this,home.class);
//                startActivity(c);
//            }
//        });
//        BT3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d = new Intent(profil.this,Listveiw.class);
//                startActivity(d);
//            }
//        });


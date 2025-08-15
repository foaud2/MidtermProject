package com.example.midtermproject.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.midtermproject.R;
import com.example.midtermproject.adapter.Settingadapter;
import com.example.midtermproject.models.Setting;

import java.util.ArrayList;

public class Listveiw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listveiw);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lv =findViewById(R.id.lsview);
        ArrayList<Setting>ArryList=new ArrayList<>();

        ArryList.add(new Setting( "home",R.drawable.home));
        ArryList.add(new Setting( "Language",R.drawable.internet));
        ArryList.add(new Setting( "Share the app",R.drawable.share));
        ArryList.add(new Setting( "Rate the app on the store",R.drawable.heart));
        ArryList.add(new Setting( "Contact  us",R.drawable.message));
        Settingadapter adapter = new Settingadapter(this, ArryList);


        lv.setAdapter(adapter);



    }
}
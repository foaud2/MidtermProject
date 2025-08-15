package com.example.midtermproject.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.midtermproject.R;
import com.example.midtermproject.models.Setting;

import java.util.ArrayList;

public class Settingadapter extends BaseAdapter {
    Context context;
    ArrayList<Setting> SettingList;
    LayoutInflater inflater;

    public Settingadapter(Context context, ArrayList<Setting> settingsList) {
        this.context = context;
        this.SettingList = settingsList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return SettingList.size();
    }

    @Override
    public Object getItem(int position) {
        return SettingList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return SettingList.get(position).getId();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.activity_settings, parent, false);
        }
        Button BThome = convertView.findViewById(R.id.button1);
        ImageButton ImB = convertView.findViewById(R.id.ImageButtonhome);
        BThome.setText(SettingList.get(position).getName());
        ImB.setImageResource(SettingList.get(position).getId());
        return convertView;
    }

}

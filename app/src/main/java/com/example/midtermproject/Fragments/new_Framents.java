package com.example.midtermproject.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.midtermproject.R;
import com.example.midtermproject.activity.Listveiw;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link new_Framents#newInstance} factory method to
 * create an instance of this fragment.
 */
public class new_Framents extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public new_Framents() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment new_Framents.
     */
    // TODO: Rename and change types and number of parameters
    public static new_Framents newInstance(String param1, String param2) {
        new_Framents fragment = new new_Framents();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new__framents, container, false);
        TextView TV1 = view.findViewById(R.id.tv7_1);
        TextView TV2 = view.findViewById(R.id.tv7_2);
        ImageView IV = view.findViewById(R.id.im7_2);
        Button BT1 = view.findViewById(R.id.Bt7_1);
        Button BT2 = view.findViewById(R.id.Bt7_2);
        Button BT3 = view.findViewById(R.id.Bt7_3);
        Button BT4 = view.findViewById(R.id.Bt7_4);
        Button BT5 = view.findViewById(R.id.Bt7_5);

        BT3.setOnClickListener(v -> {
            Intent i = new Intent(getActivity(), Listveiw.class);
            startActivity(i);
        });

        return view;
    }




}
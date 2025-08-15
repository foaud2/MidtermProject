package com.example.midtermproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.midtermproject.R;
import com.example.midtermproject.activity.Favorites;
import com.example.midtermproject.activity.home;
import com.example.midtermproject.activity.profil;
import com.example.midtermproject.activity.search;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link new2_Fragments#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class new2_Fragments extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment new2_Fragments.
     */
    // TODO: Rename and change types and number of parameters
    public static new2_Fragments newInstance(String param1, String param2) {
        new2_Fragments fragment = new new2_Fragments();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public new2_Fragments() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_new2__fragments, container, false);
        ImageView imgHome = view.findViewById(R.id.img_home);
        ImageView imgSearch = view.findViewById(R.id.imgsersh);
        ImageView imgWishlist = view.findViewById(R.id.imgWishlist);
        ImageView imgProfile = view.findViewById(R.id.imgProfile);

        imgHome.setOnClickListener(v -> {
            Intent a = new Intent(getActivity(), home.class);
            startActivity(a);
        });

        imgSearch.setOnClickListener(v -> {
            Intent b = new Intent(getActivity(), search.class);
            startActivity(b);
        });

        imgWishlist.setOnClickListener(v -> {
            Intent c = new Intent(getActivity(), Favorites.class);
            startActivity(c);
        });

        imgProfile.setOnClickListener(v -> {
            Intent d = new Intent(getActivity(), profil.class);
            startActivity(d);
        });

        return view;
    }

}
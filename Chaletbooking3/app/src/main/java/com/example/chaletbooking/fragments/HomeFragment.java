package com.example.chaletbooking.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.chaletbooking.R;
import com.example.chaletbooking.pojo.ChaletModel;
import com.example.chaletbooking.ui.main.EliteChalet;
import com.example.chaletbooking.ui.main.HelenChalet;
import com.example.chaletbooking.ui.main.MariaChalet;
import com.example.chaletbooking.ui.main.MiravalleChalet;
import com.example.chaletbooking.ui.main.SkaikChalet;
import com.example.chaletbooking.ui.main.WhiteChalet;

public class HomeFragment extends Fragment {

    public ImageButton whiteimg, mariaimg, helenimg, miravalimg, skaikimg, eliteimg;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        whiteimg = (ImageButton) view.findViewById(R.id.whiteimg);
        mariaimg = (ImageButton) view.findViewById(R.id.mariaimg);
        helenimg = (ImageButton) view.findViewById(R.id.helenimg);
        miravalimg = (ImageButton) view.findViewById(R.id.miravalimg);
        skaikimg = (ImageButton) view.findViewById(R.id.skaikimg);
        eliteimg = (ImageButton) view.findViewById(R.id.eliteimg);

        whiteimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("White Chaleh Description");
                model.setPrice(100);
                model.setTitle("White");
                model.setImage("");
                Intent intent = new Intent(getActivity(), WhiteChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "White chalet", Toast.LENGTH_LONG).show();
            }
        });
        mariaimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("Maria Chaleh Description");
                model.setPrice(100);
                model.setTitle("Maria");
                model.setImage("");
                Intent intent = new Intent(getActivity(), MariaChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "Maria chalet", Toast.LENGTH_LONG).show();

            }
        });
        helenimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("Helen Chaleh Description");
                model.setPrice(50);
                model.setTitle("Helen");
                model.setImage("");
                Intent intent = new Intent(getActivity(), HelenChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "Helen chalet", Toast.LENGTH_LONG).show();

            }
        });
        miravalimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("Miravalle Chaleh Description");
                model.setPrice(500);
                model.setTitle("Miravalle");
                model.setImage("");
                Intent intent = new Intent(getActivity(), MiravalleChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "Miravalle chalet", Toast.LENGTH_LONG).show();

            }
        });
        skaikimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("Skaik Chalet Description");
                model.setPrice(300);
                model.setTitle("Skaik");
                model.setImage("");
                Intent intent = new Intent(getActivity(), SkaikChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "Skaik chalet", Toast.LENGTH_LONG).show();

            }
        });
        eliteimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), EliteChalet.class));
                ChaletModel model = new ChaletModel();
                model.setId("0");
                model.setDescription("Elite Chalet Description");
                model.setPrice(200);
                model.setTitle("Elite");
                model.setImage("");
                Intent intent = new Intent(getActivity(), EliteChalet.class);
                intent.putExtra("model", model);
                startActivity(intent);
                Toast.makeText(getActivity(), "Elite chalet", Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }


}
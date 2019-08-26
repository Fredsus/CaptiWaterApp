package com.example.alfredsusanto.captiwaterapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HouseFragment extends Fragment implements View.OnClickListener{
    View vHouse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        vHouse = inflater.inflate(R.layout.fragment_house, container, false);

        TextView houseName = (TextView) vHouse.findViewById(R.id.frag_house_text);
        ListView areaListView = (ListView) vHouse.findViewById(R.id.area_listview);
        ImageView addAreaButton = (ImageView) vHouse.findViewById(R.id.add_area_btn);
        addAreaButton.setOnClickListener(this);
        return vHouse;
    }

    @Override
    public void onClick(View v) {

    }
}

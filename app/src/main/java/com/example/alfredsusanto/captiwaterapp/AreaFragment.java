package com.example.alfredsusanto.captiwaterapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AreaFragment extends Fragment implements View.OnClickListener{
    View vArea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        vArea = inflater.inflate(R.layout.fragment_area, container, false);

        TextView houseName = (TextView) vArea.findViewById(R.id.frag_area_text);
        ListView tapListView = (ListView) vArea.findViewById(R.id.tap_listview);
        ImageView addTapButton = (ImageView) vArea.findViewById(R.id.add_tap_btn);
        addTapButton.setOnClickListener(this);

        return vArea;
    }

    @Override
    public void onClick(View v) {

    }
}

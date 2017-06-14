package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by irina on 07.06.2017.
 */

public class BusAdapter extends ArrayAdapter<Bus> {

    public BusAdapter(Activity context, ArrayList<Bus> buses){
        super(context, 0, buses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.transportation_list_item, parent, false);
        }

        Bus currentBus = getItem(position);

        TextView busNumber = (TextView) listItemView.findViewById(R.id.bus_number);
        busNumber.setText(getContext().getString(currentBus.getBusNumber()));


        return listItemView;
    }
}

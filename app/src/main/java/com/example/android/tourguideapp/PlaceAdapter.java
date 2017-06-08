package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irina on 08.06.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.normal_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView preview = (ImageView) listItemView.findViewById(R.id.preview);
        preview.setImageResource(currentPlace.getImageId());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        TextView phoneNumber = (TextView) listItemView.findViewById(R.id.phone_number);
        phoneNumber.setText(currentPlace.getPhoneNumber());

        return listItemView;
    }
}

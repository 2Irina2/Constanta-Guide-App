package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.start;

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

        final Place currentPlace = getItem(position);

        ImageView preview = (ImageView) listItemView.findViewById(R.id.preview);
        preview.setImageResource(currentPlace.getImageId());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        final TextView phoneNumber = (TextView) listItemView.findViewById(R.id.phone_number);
        if(currentPlace.hasPhoneNumber()){
            phoneNumber.setText(currentPlace.getPhoneNumber());
            phoneNumber.setVisibility(View.VISIBLE);
        }
        else{
            phoneNumber.setVisibility(View.GONE);
        }
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri call = Uri.parse("tel:" + phoneNumber.getText().toString());
                Intent dial = new Intent(Intent.ACTION_DIAL, call);
                getContext().startActivity(dial);

            }
        });

        final TextView getLocation = (TextView) listItemView.findViewById(R.id.get_location);
        getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:<" + currentPlace.getLatitude()  + ">,<" + currentPlace.getLongitude() + ">?q=<" + currentPlace.getLatitude()  + ">,<" + currentPlace.getLongitude() + ">(" + currentPlace.getName() + ")");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);

            }
        });

        return listItemView;
    }
}

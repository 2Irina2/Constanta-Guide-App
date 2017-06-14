package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.phoneNumber;
import static com.example.android.tourguideapp.R.string.restaurants;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_list);

        final ArrayList<Place> hotels = new ArrayList<Place>();
        hotels.add(new Place(R.string.hotel_jolie, R.string.number_jolie, R.drawable.jolie, R.string.latitude_jolie, R.string.longitude_jolie));
        hotels.add(new Place(R.string.hotel_royal, R.string.number_royal, R.drawable.royal, R.string.latitude_royal, R.string.longitude_royal));
        hotels.add(new Place(R.string.hotel_maryiotis, R.string.number_maryiotis, R.drawable.maryiotis, R.string.latitude_maryiotis, R.string.longitude_maryiotis));
        hotels.add(new Place(R.string.hotel_golden_rose, R.string.number_golden_rose, R.drawable.golden_rose, R.string.latitude_golden_rose, R.string.longitude_golden_rose));
        hotels.add(new Place(R.string.hotel_ibis, R.string.number_ibis, R.drawable.ibis, R.string.latitude_ibis, R.string.longitude_ibis));
        hotels.add(new Place(R.string.hotel_austin, R.string.number_austin, R.drawable.austin, R.string.latitude_austin, R.string.longitude_austin));
        hotels.add(new Place(R.string.hotel_havana, R.string.number_havana, R.drawable.havana, R.string.latitude_havana, R.string.longitude_havana));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

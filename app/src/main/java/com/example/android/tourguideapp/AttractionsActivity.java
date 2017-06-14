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
import static com.example.android.tourguideapp.R.string.hotels;
import static com.example.android.tourguideapp.R.string.restaurants;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_list);

        final ArrayList<Place> attractions = new ArrayList<Place>();
        attractions.add(new Place(R.string.attraction_mamaia_beach, R.drawable.mamaia, R.string.latitude_mamaia_beach, R.string.longitude_mamaia_beach));
        attractions.add(new Place(R.string.attraction_cazino, R.drawable.cazino, R.string.latitude_cazino, R.string.longitude_cazino));
        attractions.add(new Place(R.string.attraction_the_mosque, R.drawable.mosque, R.string.latitude_the_mosque, R.string.longitude_the_mosque));
        attractions.add(new Place(R.string.attraction_tomis_harbour, R.drawable.harbour, R.string.latitude_tomis_harbour, R.string.longitude_tomis_harbour));
        attractions.add(new Place(R.string.attraction_ovidiu_square, R.drawable.ovidiu_square, R.string.latitude_ovidiu_square, R.string.longitude_ovidiu_square));
        attractions.add(new Place(R.string.attraction_cathedral, R.drawable.catedrala, R.string.latitude_cathedral, R.string.longitude_cathedral));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

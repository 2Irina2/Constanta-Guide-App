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
import static com.example.android.tourguideapp.R.string.latitude_gara;
import static com.example.android.tourguideapp.R.string.restaurants;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_list);

        final ArrayList<Place> parks = new ArrayList<Place>();
        parks.add(new Place(R.string.park_tabacarie, R.drawable.tabacarie, R.string.latitude_tabacarie, R.string.longitude_tabacarie));
        parks.add(new Place(R.string.park_gara, R.drawable.gara, R.string.latitude_gara, R.string.longitude_gara));
        parks.add(new Place(R.string.park_primarie, R.drawable.primarie, R.string.latitude_gara, R.string.longitude_gara));
        parks.add(new Place(R.string.park_poarta, R.drawable.poarta_6, R.string.latitude_poarta, R.string.longitude_poarta));
        parks.add(new Place(R.string.park_opera, R.drawable.opera, R.string.latitude_opera, R.string.longitude_opera));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, parks);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

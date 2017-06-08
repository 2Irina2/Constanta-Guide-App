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
        attractions.add(new Place("Mamaia Beach", R.drawable.mamaia, "44.279085", "28.621983"));
        attractions.add(new Place("Cazino", R.drawable.cazino, "44.170480", "28.663553"));
        attractions.add(new Place("The Mosque", R.drawable.mosque, "44.173283", "28.6596882707"));
        attractions.add(new Place("Tomis Harbour", R.drawable.harbour, "44.175557", "28.661223"));
        attractions.add(new Place("Ovidiu Square", R.drawable.ovidiu_square, "44.174217", "28.658076"));
        attractions.add(new Place("Saint Paul and Peter Cathedral", R.drawable.catedrala, "44.171234", "28.660967"));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, attractions);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

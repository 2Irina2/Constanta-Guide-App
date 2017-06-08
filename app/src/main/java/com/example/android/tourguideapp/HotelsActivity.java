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
        hotels.add(new Place("Hotel Jolie", "0241 697 638", R.drawable.jolie, "44.201298", "28.645268"));
        hotels.add(new Place("Hotel Royal", "0241 542 690", R.drawable.royal, "44.199137", "28.646769"));
        hotels.add(new Place("Hotel Maryiotis", "0241 629 999", R.drawable.maryiotis, "44.202337", "28.645476"));
        hotels.add(new Place("Hotel Golden Rose", "0341 445 302", R.drawable.golden_rose, "44.203958", "28.642707"));
        hotels.add(new Place("Hotel Ibis", "0241 508 050", R.drawable.ibis, "44.177633", "28.654693"));
        hotels.add(new Place("Hotel Austin", "0735 844 882", R.drawable.austin, "44.212075", "28.620630"));
        hotels.add(new Place("Hotel Havana", "0721 123 424", R.drawable.havana, "44.180788", "28.640530"));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

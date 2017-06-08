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

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_list);

        final ArrayList<Place> parks = new ArrayList<Place>();
        parks.add(new Place("Tabacarie", R.drawable.tabacarie, "44.210532", "28.631517"));
        parks.add(new Place("Gara", R.drawable.gara, "44.168921", "28.635632"));
        parks.add(new Place("Primarie", R.drawable.primarie, "444.176344", "28.650396"));
        parks.add(new Place("Poarta 6", R.drawable.poarta_6, "44.139469", "28.631380"));
        parks.add(new Place("Opera", R.drawable.opera, "44.181090", "28.649657"));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, parks);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

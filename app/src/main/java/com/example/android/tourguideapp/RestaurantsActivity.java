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

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_list);

        final ArrayList<Place> restaurants = new ArrayList<Place>();
        restaurants.add(new Place(R.string.rest_marco_polo, R.string.number_marco_polo, R.drawable.marco_polo, R.string.latitude_marco_polo, R.string.longitude_marco_polo));
        restaurants.add(new Place(R.string.rest_irish, R.string.number_irish, R.drawable.irish_pub, R.string.latitude_irish, R.string.longitude_irish));
        restaurants.add(new Place(R.string.rest_toscana, R.string.number_toscana, R.drawable.toscana, R.string.latitude_toscana, R.string.longitude_toscana));
        restaurants.add(new Place(R.string.rest_chevalet, R.string.number_chevalet, R.drawable.chevalet, R.string.latitude_chevalet, R.string.longitude_chevalet));
        restaurants.add(new Place(R.string.rest_pizzico, R.string.number_pizzico, R.drawable.pizzico, R.string.latitude_pizzico, R.string.longitude_pizzico));
        restaurants.add(new Place(R.string.rest_london, R.string.number_london, R.drawable.london_pub, R.string.latitude_london, R.string.longitude_london));
        restaurants.add(new Place(R.string.rest_crazy, R.string.number_crazy, R.drawable.crazy, R.string.latitude_crazy, R.string.longitude_crazy));
        restaurants.add(new Place(R.string.rest_dolce, R.string.number_dolce, R.drawable.la_dolce_vita, R.string.latitude_dolce, R.string.longitude_dolce));
        restaurants.add(new Place(R.string.rest_integra, R.string.number_integra, R.drawable.integra, R.string.latitude_integra, R.string.longitude_integra));
        restaurants.add(new Place(R.string.rest_scoica, R.string.number_scoica, R.drawable.la_scoica, R.string.latitude_scoica, R.string.longitude_scoica));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

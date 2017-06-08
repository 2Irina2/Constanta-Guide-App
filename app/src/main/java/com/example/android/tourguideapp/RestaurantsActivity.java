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
        restaurants.add(new Place("Marco Polo", "0241 617 357", R.drawable.marco_polo, "44.182493", "28.649354"));
        restaurants.add(new Place("Irish Pub", "0241 550 400", R.drawable.irish_pub, "44.181051", "28.652222"));
        restaurants.add(new Place("Toscana", "0241 616 360", R.drawable.toscana, "44.182873", "28.649179"));
        restaurants.add(new Place("Chevalet", "0721 421 501", R.drawable.chevalet, "44.264257", "28.620457"));
        restaurants.add(new Place("Pizzico", "0241 615 555", R.drawable.pizzico, "44.174367", "28.658540"));
        restaurants.add(new Place("London Pub", "0341 417 190", R.drawable.london_pub, "44.177793", "28.653477"));
        restaurants.add(new Place("Crazy", "0726 779 292", R.drawable.crazy, "44.182251", "28.649841"));
        restaurants.add(new Place("La Dolce Vita", "0241 547 740", R.drawable.la_dolce_vita, "44.208699", "28.642968"));
        restaurants.add(new Place("Integra", "0241 691 973", R.drawable.integra, "44.202167", "28.628053"));
        restaurants.add(new Place("La Scoica", " 0727 726 422", R.drawable.la_scoica, "44.193216", "28.649577"));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);


    }
}

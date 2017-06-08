package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.tourguideapp.R.string.parks;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button transportationButton = (Button) findViewById(R.id.transportation_button);
        transportationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transportationIntent = new Intent(MainActivity.this, TransportationActivity.class);
                startActivity(transportationIntent);
            }
        });

        Button restaurantsButton = (Button) findViewById(R.id.restaurants_button);
        restaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        Button parksButton = (Button) findViewById(R.id.parks_button);
        parksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });

        Button hotelsButton = (Button) findViewById(R.id.hotels_button);
        hotelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        Button attractionsButton = (Button) findViewById(R.id.attractions_button);
        attractionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });
    }
}

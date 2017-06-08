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
        restaurants.add(new Place("Marco Polo", "0241 617 357", R.drawable.marco_polo));
        restaurants.add(new Place("Irish Pub", "0241 550 400", R.drawable.irish_pub));
        restaurants.add(new Place("Toscana", "0241 616 360", R.drawable.toscana));
        restaurants.add(new Place("Chevalet", "0721 421 501", R.drawable.marco_polo));
        restaurants.add(new Place("Pizzico", "0241 615 555", R.drawable.pizzico));
        restaurants.add(new Place("London Pub", "0341 417 190", R.drawable.london_pub));
        restaurants.add(new Place("Crazy", "0726 779 292", R.drawable.crazy));
        restaurants.add(new Place("La Dolce Vita", "0241 547 740", R.drawable.la_dolce_vita));
        restaurants.add(new Place("Integra", "0241 691 973", R.drawable.integra));
        restaurants.add(new Place("La Scoica", " 0727 726 422", R.drawable.la_scoica));

        final PlaceAdapter pAdapter = new PlaceAdapter(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.normal_list);
        listView.setAdapter(pAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Place restaurant = restaurants.get(position);
                final String phoneNumber = restaurant.getPhoneNumber();
                TextView phoneNumberView = (TextView) view.findViewById(R.id.phone_number);

                phoneNumberView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(getApplicationContext(), phoneNumber, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });

            }
        });

    }
}

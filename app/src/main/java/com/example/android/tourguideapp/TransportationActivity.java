package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.WorkSource;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportation_list);

        final ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus("1", R.drawable.route_1));
        buses.add(new Bus("2", R.drawable.route_2));
        buses.add(new Bus("3", R.drawable.route_3));
        buses.add(new Bus("5", R.drawable.route_5));
        buses.add(new Bus("40", R.drawable.route_40));
        buses.add(new Bus("42", R.drawable.route_42));
        buses.add(new Bus("43", R.drawable.route_43));
        buses.add(new Bus("44", R.drawable.route_44));
        buses.add(new Bus("48", R.drawable.route_48));
        buses.add(new Bus("51", R.drawable.route_51));
        buses.add(new Bus("100", R.drawable.route_100));

        final BusAdapter bAdapter = new BusAdapter(this, buses);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(bAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bus bus = buses.get(position);

                Intent routeIntent = new Intent(TransportationActivity.this, RouteActivity.class);
                startActivity(routeIntent);
            }
        });
    }
}

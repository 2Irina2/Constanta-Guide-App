package com.example.android.tourguideapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class RouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        ImageView routeImage = (ImageView) findViewById(R.id.route_image);
        // How do I set the resource id?
        // routeImage.setImageResource();
    }
}

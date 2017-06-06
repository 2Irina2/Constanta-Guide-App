package com.example.android.tourguideapp;

/**
 * Created by irina on 06.06.2017.
 */

public class Bus {
    private String mBusNumber;
    private int mRouteResId;

    public Bus(String busNumber, int routeResId){
        mBusNumber = busNumber;
        mRouteResId = routeResId;
    }

    public String getBusNumber(){
        return mBusNumber;
    }
    public int getRouteResId(){
        return mRouteResId;
    }
}

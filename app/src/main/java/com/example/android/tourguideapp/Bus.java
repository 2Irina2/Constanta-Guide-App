package com.example.android.tourguideapp;

/**
 * Created by irina on 06.06.2017.
 */

public class Bus {
    private int mBusNumberId;
    private int mRouteResId;

    public Bus(int busNumber, int routeResId){
        mBusNumberId = busNumber;
        mRouteResId = routeResId;
    }

    public int getBusNumber(){
        return mBusNumberId;
    }
    public int getRouteResId(){
        return mRouteResId;
    }
}

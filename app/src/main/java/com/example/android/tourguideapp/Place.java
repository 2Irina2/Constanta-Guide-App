package com.example.android.tourguideapp;

/**
 * Created by irina on 08.06.2017.
 */

public class Place {
    private static final String NO_NUMBER_PROVIDED = "0";

    private String mName;
    private String mPhoneNumber = NO_NUMBER_PROVIDED;
    private int mImageId;
    private String mLatitude;
    private String mLongitude;

    public Place(String name, String phoneNumber, int imageId, String latitude, String longitude){
        mName = name;
        mPhoneNumber = phoneNumber;
        mImageId = imageId;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public Place(String name, int imageId, String latitude, String longitude){
        mName = name;
        mImageId = imageId;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public String getName(){
        return mName;
    }

    public String getPhoneNumber(){
        return mPhoneNumber;
    }

    public int getImageId(){
        return mImageId;
    }

    public String getLatitude(){
        return mLatitude;
    }

    public String getLongitude(){
        return mLongitude;
    }

    public boolean hasPhoneNumber(){
        return mPhoneNumber != NO_NUMBER_PROVIDED;
    }
}

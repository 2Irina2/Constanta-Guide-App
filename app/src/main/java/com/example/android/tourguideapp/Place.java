package com.example.android.tourguideapp;

/**
 * Created by irina on 08.06.2017.
 */

public class Place {
    private static final int NO_NUMBER_PROVIDED = 0;

    private int mNameId;
    private int mPhoneNumberId = NO_NUMBER_PROVIDED;
    private int mImageId;
    private int mLatitudeId;
    private int mLongitudeId;

    public Place(int name, int phoneNumber, int imageId, int latitude, int longitude){
        mNameId = name;
        mPhoneNumberId = phoneNumber;
        mImageId = imageId;
        mLatitudeId = latitude;
        mLongitudeId = longitude;
    }

    public Place(int name, int imageId, int latitude, int longitude){
        mNameId = name;
        mImageId = imageId;
        mLatitudeId = latitude;
        mLongitudeId = longitude;
    }

    public int getName(){
        return mNameId;
    }

    public int getPhoneNumber(){
        return mPhoneNumberId;
    }

    public int getImageId(){
        return mImageId;
    }

    public int getLatitude(){
        return mLatitudeId;
    }

    public int getLongitude(){
        return mLongitudeId;
    }

    public boolean hasPhoneNumber(){
        return mPhoneNumberId != NO_NUMBER_PROVIDED;
    }
}

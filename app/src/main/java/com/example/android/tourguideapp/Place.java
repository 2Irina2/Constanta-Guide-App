package com.example.android.tourguideapp;

/**
 * Created by irina on 08.06.2017.
 */

public class Place {
    private String mName;
    private String mPhoneNumber;
    private int mImageId;

    public Place(String name, String phoneNumber, int imageId){
        mName = name;
        mPhoneNumber = phoneNumber;
        mImageId = imageId;
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
}

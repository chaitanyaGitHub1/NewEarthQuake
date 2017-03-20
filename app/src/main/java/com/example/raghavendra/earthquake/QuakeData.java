package com.example.raghavendra.earthquake;

import java.lang.String;
import java.lang.*;
import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by raghavendra on 3/8/2017.
 */

public class QuakeData {

    /** Magnitude of the earthquake */
    private double mMagnitude;


    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;



    /**
     * Constructs a new {@link QuakeData} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public QuakeData(double magnitude, String location, long timeInMilliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the magnitude of the earthquake.
     */
    public double getmMagnitude() {
        return mMagnitude;
    }




    public  String getmLocation()
    {



        return  mLocation;
    }



    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }




}

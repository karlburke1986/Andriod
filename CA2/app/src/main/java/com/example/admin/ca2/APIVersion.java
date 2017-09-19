package com.example.admin.ca2;

import java.util.ArrayList;

/**
 * Created by Admin on 06/04/2017.
 */

//Karl Burke
//x00115288

public class APIVersion {
    private String codeName;
    private String platformVersion;
    private int apiLevel;
    private int year;

    public String getCodeName() {
        return codeName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public int getApiLevel() {
        return apiLevel;
    }

    public int getYear() {
        return year;
    }

    public APIVersion(String codeName, String platformVersion, int apiLevel, int year) {
        this.codeName = codeName;
        this.platformVersion = platformVersion;
        this.apiLevel = apiLevel;
        this.year = year;
    }

    public APIVersion() {
        codeName = "";
        platformVersion = "";
        apiLevel = 0;
        year = 0;
    }

    public ArrayList<APIVersion> apiList()
    {
        ArrayList<APIVersion> apis = new ArrayList<APIVersion>();
        apis.add(new APIVersion("Nougat", "7.1", 25, 2016));
        apis.add(new APIVersion("Nougat", "7.0", 24, 2016));
        apis.add(new APIVersion("Marshmallow", "6.0", 23, 2015));
        apis.add(new APIVersion("Lollipop", "5.1", 22, 2014));
        apis.add(new APIVersion("Lollipop", "5.0", 21, 2014));
        apis.add(new APIVersion("KitKat", "4.4-4.4.4", 19, 2013));
        apis.add(new APIVersion("Jelly Bean", "4.3.x", 18, 2012));
        apis.add(new APIVersion("Jelly Bean", "4.2.x", 17, 2012));
        apis.add(new APIVersion("Jelly Bean", "4.1.x", 16, 2012));

        return apis;
    }
}



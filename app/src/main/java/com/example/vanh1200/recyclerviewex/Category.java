package com.example.vanh1200.recyclerviewex;

import java.util.ArrayList;

public class Category {
    private String mName;
    private ArrayList<App> mApps;

    public Category() {
    }

    public Category(String name, ArrayList<App> apps) {
        mName = name;
        mApps = apps;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public ArrayList<App> getApps() {
        return mApps;
    }

    public void setApps(ArrayList<App> apps) {
        mApps = apps;
    }
}

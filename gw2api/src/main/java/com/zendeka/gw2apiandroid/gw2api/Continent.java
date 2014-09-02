package com.zendeka.gw2apiandroid.gw2api;

import com.zendeka.gw2apiandroid.gw2api.utils.Size;

/**
 * Created by lawrence on 9/1/14.
 */
public class Continent {
    private final int mIdentifier;
    private final String mName;
    private final Size mDimensions;
    private final int mMinZoom;
    private final int mMaxZoom;
    private final int[] mFloors;

    public Continent(int identifier, String name, Size dimensions, int minZoom, int maxZoom, int[] floors) {
        mIdentifier = identifier;
        mName = name;
        mDimensions = dimensions;
        mMinZoom = minZoom;
        mMaxZoom = maxZoom;
        mFloors = floors;
    }

    public int getIdentifier() {
        return mIdentifier;
    }

    public String getName() {
        return mName;
    }

    public Size getDimensions() {
        return mDimensions;
    }

    public int getMinZoom() {
        return mMinZoom;
    }

    public int getMaxZoom() {
        return mMaxZoom;
    }

    public int[] getFloors() {
        return mFloors;
    }
}

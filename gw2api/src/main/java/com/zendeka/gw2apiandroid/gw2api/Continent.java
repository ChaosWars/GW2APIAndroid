package com.zendeka.gw2apiandroid.gw2api;

import com.zendeka.gw2apiandroid.gw2api.utils.Size;

import java.util.Collections;
import java.util.List;

/**
 * Created by lawrence on 9/1/14.
 */
public class Continent {
    private final int mIdentifier;
    private final String mName;
    private final Size mDimensions;
    private final int mMinZoom;
    private final int mMaxZoom;
    private final List<Integer> mFloors;

    public Continent(int identifier, String name, Size dimensions, int minZoom, int maxZoom, List<Integer> floors) {
        mIdentifier = identifier;
        mName = name;
        mDimensions = dimensions;
        mMinZoom = minZoom;
        mMaxZoom = maxZoom;
        mFloors = floors;
        Collections.sort(mFloors);
    }

    public final int getIdentifier() {
        return mIdentifier;
    }

    public final String getName() {
        return mName;
    }

    public final Size getDimensions() {
        return mDimensions;
    }

    public final int getMinZoom() {
        return mMinZoom;
    }

    public final int getMaxZoom() {
        return mMaxZoom;
    }

    public final List<Integer> getFloors() {
        return mFloors;
    }
}

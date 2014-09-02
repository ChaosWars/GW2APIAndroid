package com.zendeka.gw2apiandroid.gw2api.utils;

/**
 * Created by lawrence on 9/1/14.
 */
public class Size {
    private int mHeight;
    private int mWidth;

    public Size() {
        mWidth = 0;
        mHeight = 0;
    }

    public Size(int width, int height) {
        mWidth = width;
        mHeight = height;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int height) {
        mHeight = height;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        mWidth = width;
    }
}

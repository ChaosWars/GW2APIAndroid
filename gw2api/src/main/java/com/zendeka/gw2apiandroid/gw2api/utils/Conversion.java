package com.zendeka.gw2apiandroid.gw2api.utils;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lawrence on 9/1/14.
 */
public class Conversion {
    public static Size convertIntegerListToSize(List<Integer> list) {
        return new Size(list.get(0), list.get(1));
    }

    public static int[] convertIntegerListToArrayOfInt(List<Integer> list) {
        int[] newList = new int[list.size()];
        int index = 0;

        for (Integer value : list) {
            newList[index] = value.intValue();
            ++index;
        }

        return newList;
    }
}

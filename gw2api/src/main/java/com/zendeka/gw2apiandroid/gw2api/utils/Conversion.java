package com.zendeka.gw2apiandroid.gw2api.utils;

import java.util.List;

/**
 * Created by lawrence on 9/1/14.
 */
public class Conversion {
    /**
     * Create a @link(Size) from the first two elements of a @link(List) of @link(Integer)
     * @param list The list to create the Size from
     * @return The Size created from the first two elements of list
     */
    public static Size createSize(List<Integer> list) {
        if (list.size() < 1) {
            return new Size(0, 0);
        }

        return new Size(list.get(0), list.get(1));
    }

    /**
     * Convert a @link(List) of @link(Integer) to an array of int
     * @param list The list to create the array from
     * @return The array of int created from list
     */
//    public static int[] convertList(List<Integer> list) {
//        int[] newList = new int[list.size()];
//        int index = 0;
//
//        for (Integer value : list) {
//            newList[index] = value;
//            ++index;
//        }
//
//        return newList;
//    }
}

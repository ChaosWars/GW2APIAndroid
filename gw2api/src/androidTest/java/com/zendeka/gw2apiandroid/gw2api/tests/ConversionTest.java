package com.zendeka.gw2apiandroid.gw2api.tests;

import android.test.InstrumentationTestCase;

import com.zendeka.gw2apiandroid.gw2api.utils.Conversion;
import com.zendeka.gw2apiandroid.gw2api.utils.Size;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lawrence on 9/1/14.
 */
public class ConversionTest extends InstrumentationTestCase {
    public void testConvertListOfIntegersToSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Size size = Conversion.createSize(list);

        assertEquals(1, size.getWidth());
        assertEquals(2, size.getHeight());
    }

//    public void testConvertListOfIntegersToArrayOfInt() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        int[] newList = Conversion.convertList(list);
//
//        assertEquals(1, newList[0]);
//        assertEquals(2, newList[1]);
//        assertEquals(3, newList[2]);
//    }
}

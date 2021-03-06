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
        List<Integer> list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));

        Size size = Conversion.convertIntegerListToSize(list);

        assertEquals(1, size.getWidth());
        assertEquals(2, size.getHeight());
    }

    public void testConvertListOfIntegersToArrayOfInt() {
        List<Integer> list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));

        int[] newList = Conversion.convertIntegerListToArrayOfInt(list);

        assertEquals(1, newList[0]);
        assertEquals(2, newList[1]);
        assertEquals(3, newList[2]);
    }
}

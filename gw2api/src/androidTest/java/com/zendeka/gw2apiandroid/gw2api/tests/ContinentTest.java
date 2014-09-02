package com.zendeka.gw2apiandroid.gw2api.tests;

import android.test.InstrumentationTestCase;

import com.zendeka.gw2apiandroid.gw2api.Continent;
import com.zendeka.gw2apiandroid.gw2api.utils.Size;

/**
 * Created by lawrence on 9/1/14.
 */
public class ContinentTest extends InstrumentationTestCase {

    public void testConstructor() {
        final int identifier = 1;
        final String name = "testName";
        final Size dimensions = new Size(10, 20);
        final int minZoom = 1;
        final int maxZoom = 2;
        final int floors[] = { 3, 4, 5 };
        final Continent continent = new Continent(identifier, name, dimensions, minZoom, maxZoom, floors);
        assertEquals(identifier, continent.getIdentifier());
        assertEquals(name, continent.getName());
        assertEquals(dimensions, continent.getDimensions());
        assertEquals(minZoom, continent.getMinZoom());
        assertEquals(maxZoom, continent.getMaxZoom());
        assertEquals(floors, continent.getFloors());
    }
}

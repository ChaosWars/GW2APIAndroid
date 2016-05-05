package com.zendeka.gw2apiandroid.gw2api.tests;

import android.test.InstrumentationTestCase;
import android.util.JsonReader;

import com.zendeka.gw2apiandroid.gw2api.Continent;
import com.zendeka.gw2apiandroid.gw2api.R;
import com.zendeka.gw2apiandroid.gw2api.parsers.ContinentsParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by lawrence on 9/2/14.
 */
public class ContinentsParserTest extends InstrumentationTestCase {
    public void testParseContinents() {
        InputStream inputStream = getInstrumentation().getTargetContext().getResources().openRawResource(R.raw.json_continents_v2);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        JsonReader jsonReader = new JsonReader(inputStreamReader);
        ContinentsParser parser = new ContinentsParser();

        try {
            List<Continent> continentsList = parser.readContinents(jsonReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

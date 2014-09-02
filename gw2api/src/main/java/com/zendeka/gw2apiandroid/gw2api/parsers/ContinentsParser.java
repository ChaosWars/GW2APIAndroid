package com.zendeka.gw2apiandroid.gw2api.parsers;

import android.util.JsonReader;

import com.zendeka.gw2apiandroid.gw2api.Continent;
import com.zendeka.gw2apiandroid.gw2api.utils.Conversion;
import com.zendeka.gw2apiandroid.gw2api.utils.Size;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lawrence on 9/1/14.
 */
public class ContinentsParser {
    public List<Continent> readContinents(JsonReader jsonReader) throws IOException {
        List<Continent> continents = new ArrayList();

        jsonReader.beginObject();

        while (jsonReader.hasNext()) {
            final String name = jsonReader.nextName();

            if (name.equals("continents")) {
                jsonReader.beginObject();

                while (jsonReader.hasNext()) {
                    Continent continent = readContinent(jsonReader);
                    continents.add(continent);
                }

                jsonReader.endObject();
            }
        }

        jsonReader.endObject();
        return continents;
    }

    private Continent readContinent(JsonReader jsonReader) throws  IOException {
        final int identifier = Integer.parseInt(jsonReader.nextName());
        String continentName = "";
        final List<Integer> dimensionsList = new ArrayList();
        int minZoom = 0;
        int maxZoom = 0;
        final List<Integer> floorsList = new ArrayList();

        jsonReader.beginObject();

        while (jsonReader.hasNext()) {
            String name = jsonReader.nextName();

            switch (name) {
                case "name":
                    continentName = jsonReader.nextString();
                    break;
                case "continent_dims":
                    readIntArray(jsonReader, dimensionsList);
                    break;
                case "min_zoom":
                    minZoom = jsonReader.nextInt();
                    break;
                case "max_zoom":
                    maxZoom = jsonReader.nextInt();
                    break;
                case "floors":
                    readIntArray(jsonReader, floorsList);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }

        jsonReader.endObject();

        int[] floors = Conversion.convertIntegerListToArrayOfInt(floorsList);
        Size dimensions = Conversion.convertIntegerListToSize(dimensionsList);
        return new Continent(identifier, continentName, dimensions, minZoom, maxZoom, floors);
    }

    private void readIntArray(JsonReader jsonReader, List<Integer> list) throws IOException {
        jsonReader.beginArray();

        while (jsonReader.hasNext()) {
            list.add(jsonReader.nextInt());
        }

        jsonReader.endArray();
    }
}

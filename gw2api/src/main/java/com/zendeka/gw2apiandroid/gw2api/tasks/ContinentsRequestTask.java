package com.zendeka.gw2apiandroid.gw2api.tasks;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lawrence on 9/4/14.
 */
public class ContinentsRequestTask extends AsyncTask<String, String, String> {
    private final OnContinentsRequestTaskCompleted mListener;

    public interface OnContinentsRequestTaskCompleted {
        public void continentsRequestTaskResult(String result);
    }

    public ContinentsRequestTask(OnContinentsRequestTaskCompleted listener) {
        mListener = listener;
    }

    @Override
    protected String doInBackground(String... params) {
        String response = "";
        String urlString = params[0];
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection)url.openConnection();
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            BufferedReader buffer = new BufferedReader(reader);
            response = readResponse(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response;
    }

    @Override
    protected void onPostExecute(String result) {
        mListener.continentsRequestTaskResult(result);
    }

    private String readResponse(BufferedReader buffer) throws IOException {
        String response = "";
        String s;
        while ((s = buffer.readLine()) != null) {
            response += s;
        }

        return response;
    }
}

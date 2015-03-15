package com.zendeka.gw2apiandroid.gw2api.tasks;

import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
        String url = params[0];
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);

        try {
            HttpResponse execute = client.execute(httpGet);
            InputStream content = execute.getEntity().getContent();

            BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
            String s;
            while ((s = buffer.readLine()) != null) {
                response += s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    protected void onPostExecute(String result) {
        mListener.continentsRequestTaskResult(result);
    }
}

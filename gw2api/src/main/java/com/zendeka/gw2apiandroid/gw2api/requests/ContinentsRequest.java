package com.zendeka.gw2apiandroid.gw2api.requests;

import android.app.Fragment;

import com.zendeka.gw2apiandroid.gw2api.tasks.ContinentsRequestTask;

import java.lang.ref.WeakReference;

/**
 * Created by lawrence on 9/4/14.
 */
public class ContinentsRequest extends Fragment {
    public static final String TAG = "CONTINENTS_REQUEST";
    private static final String URL = "https://api.guildwars2.com/v1/continents.json";
    private WeakReference<ContinentsRequestTask> mTask;

    public ContinentsRequest() {
        setRetainInstance(true);
    }

    public void getContinents(ContinentsRequestTask.OnContinentsRequestTaskCompleted listener) {
        ContinentsRequestTask task = new ContinentsRequestTask(listener);
        mTask = new WeakReference<>(task);
        task.execute(URL);
    }

    public ContinentsRequestTask getTask() {
        return mTask != null ? mTask.get() : null;
    }
}

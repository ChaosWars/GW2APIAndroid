package com.zendeka.gw2apiandroid.gw2api.tests;

import android.test.InstrumentationTestCase;

import com.zendeka.gw2apiandroid.gw2api.tasks.ContinentsRequestTask;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lawrence on 9/5/14.
 */
public class ContinentsRequestTaskTest extends InstrumentationTestCase implements ContinentsRequestTask.OnContinentsRequestTaskCompleted {
    private static final String URL = "https://api.guildwars2.com/v2/continents.json";
    CountDownLatch mSignal;

    public void setUp() {
        mSignal = new CountDownLatch(1);
    }

    public void tearDown() {
        try {
            mSignal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testContinentsRequestTask() {
        ContinentsRequestTask task = new ContinentsRequestTask(this);
        task.execute(URL);
    }

    @Override
    public void continentsRequestTaskResult(String result) {
        mSignal.countDown();
        assertEquals("Result should have contained \"continents\" key", true, result.contains("continents"));
    }
}

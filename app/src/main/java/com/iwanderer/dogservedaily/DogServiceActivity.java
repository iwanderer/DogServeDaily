package com.iwanderer.dogservedaily;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by leslie on 15-10-23.
 */
public class DogServiceActivity extends IntentService {

    public DogServiceActivity() {
        super("DogServiceActivity");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        long endTime = System.currentTimeMillis() + 5 * 1000;
        while (System.currentTimeMillis() < endTime) {
            synchronized (this) {
                try {
                    wait(endTime - System.currentTimeMillis());
                } catch (Exception e) {
                }
            }
        }
    }

}

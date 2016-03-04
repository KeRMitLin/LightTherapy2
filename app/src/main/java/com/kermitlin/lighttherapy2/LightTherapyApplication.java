package com.kermitlin.lighttherapy2;

import com.firebase.client.Firebase;

public class LightTherapyApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}

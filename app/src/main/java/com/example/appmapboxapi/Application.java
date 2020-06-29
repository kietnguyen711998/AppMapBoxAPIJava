package com.example.appmapboxapi;

import com.mapbox.mapboxsdk.Mapbox;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Mapbox.getInstance(this, getString(R.string.mapbox_access_token));

    }
}


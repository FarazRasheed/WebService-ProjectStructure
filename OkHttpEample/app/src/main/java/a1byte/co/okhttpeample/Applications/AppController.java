package a1byte.co.okhttpeample.Applications;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by Admin on 10/14/2016.
 */

public class AppController extends Application {

    private static AppController mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        AndroidNetworking.initialize(getApplicationContext());
    }


}

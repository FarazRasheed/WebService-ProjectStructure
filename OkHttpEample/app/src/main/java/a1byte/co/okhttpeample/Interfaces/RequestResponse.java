package a1byte.co.okhttpeample.Interfaces;

import com.androidnetworking.error.ANError;

import org.json.JSONObject;

/**
 * Created by Admin on 11/7/2016.
 */

public interface RequestResponse {

    public void requeststarted();
    public  void requestCompleted(JSONObject jsonObject);
    public void requestEndedWithError(ANError error);
}

package a1byte.co.okhttpeample.Network;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import org.json.JSONObject;

import java.util.HashMap;

import a1byte.co.okhttpeample.Interfaces.RequestResponse;

/**
 * Created by Admin on 11/7/2016.
 */

public class CustomRequest {

    public static void PostRequest (String url, final boolean isShow, HashMap<String, String> headers,
                                    JSONObject object, final RequestResponse callback){
        AndroidNetworking.post(url)
                .addJSONObjectBody(object) // posting json
                .setTag("test")
                .addHeaders(headers)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.requestCompleted(response);
                    }

                    @Override
                    public void onError(ANError anError) {
                        callback.requestEndedWithError(anError);
                    }
                });
    }

    public static void GetRequest (String url, final boolean isShow, HashMap<String, String> headers
            , final RequestResponse callback){
        AndroidNetworking.get(url)
                .setTag("test")
                .addHeaders(headers)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.requestCompleted(response);
                    }

                    @Override
                    public void onError(ANError anError) {
                        callback.requestEndedWithError(anError);
                    }
                });
    }
}

package a1byte.co.okhttpeample.Views.Activities.RegisterViews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidnetworking.error.ANError;

import org.json.JSONException;
import org.json.JSONObject;

import a1byte.co.okhttpeample.Interfaces.RequestResponse;
import a1byte.co.okhttpeample.Network.CustomRequest;
import a1byte.co.okhttpeample.R;
import a1byte.co.okhttpeample.Utills.HeadersClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("userEmail", "admin@omg.com");
            jsonObject.put("userPassword", "12345");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        PostFUNC(jsonObject);
        GETFUNC();

    }

    public void PostFUNC(JSONObject jsonObject){
        CustomRequest.PostRequest("http://188.166.248.252:5000/users/loginUser",
                true, HeadersClass.EmptyHeaders(), jsonObject, new RequestResponse() {
                    @Override
                    public void requeststarted() {

                    }

                    @Override
                    public void requestCompleted(JSONObject jsonObject) {
                        Log.e("Dara1", jsonObject.toString());

                    }

                    @Override
                    public void requestEndedWithError(ANError error) {
                        Log.e("error1", error.getMessage());
                    }
                });
    }
    public void GETFUNC(){
        CustomRequest.GetRequest("http://188.166.248.252:5000/news", true, HeadersClass.Headers(),
                new RequestResponse() {
                    @Override
                    public void requeststarted() {

                    }

                    @Override
                    public void requestCompleted(JSONObject jsonObject) {
                        Log.e("Dara2", jsonObject.toString());
                    }

                    @Override
                    public void requestEndedWithError(ANError error) {
                        Log.e("error2", error.getMessage());
                    }
                });
    }
}

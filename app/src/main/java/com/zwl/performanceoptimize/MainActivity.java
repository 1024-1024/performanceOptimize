package com.zwl.performanceoptimize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.socks.library.KLog;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("key1", "value1");
            jsonObject.put("key2", "value2");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        KLog.json(jsonObject.toString());
        KLog.json(jsonObject.toString());
        KLog.json(jsonObject.toString());
        KLog.json(jsonObject.toString());
    }
}

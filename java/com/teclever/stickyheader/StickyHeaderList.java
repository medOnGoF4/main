package com.teclever.stickyheader;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class StickyHeaderList extends AppCompatActivity {

    StickyListHeadersListView listView;
    String jsonUrl="https://192.168.1.50:8443/admin/control/getMohallaSampleList";
    String jsonUrl2="http://api.androidhive.info/contacts/";
    String jsonResponse=null;
    Iterator<String> keys;
    //FetchJson fetchJson=new FetchJson(jsonUrl2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //fetchJson.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky_header_list);
        listView= (StickyListHeadersListView) findViewById(R.id.list);
        //adapter comes here
        loadJSONFromAsset();
        ReadJson readJson=new ReadJson();
        readJson.start();

    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getApplication().getAssets().open("Contacts.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public class ReadJson extends Thread {
        @Override
        public void run() {
            try {
                JSONObject obj = new JSONObject(loadJSONFromAsset());
                JSONArray m_jArry = obj.getJSONArray("contacts");
               Log.d("Debug","Data read from json success");
                ArrayList<HashMap<String, String>> formList = new ArrayList<HashMap<String, String>>();
                HashMap<String, String> m_li;

                for (int i = 0; i < m_jArry.length(); i++) {
                    JSONObject jo_inside = m_jArry.getJSONObject(i);
//                Log.d("Details-->", jo_inside.getString("formule"));
//                String formula_value = jo_inside.getString("formule");
//                String url_value = jo_inside.getString("url");
//
//                //Add your values in your `ArrayList` as below:
//                m_li = new HashMap<String, String>();
//                m_li.put("formule", formula_value);
//                m_li.put("url", url_value);
//
//                formList.add(m_li);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}

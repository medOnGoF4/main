package com.teclever.stickyheader;


import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class FetchJson extends Thread
{
    String jsonUrl,response;
    public FetchJson(String jsonUrl)
    {
        this.jsonUrl=jsonUrl;
    }

    @Override
    public void run() {
        try {
            URL url=new URL(jsonUrl);
            Log.d("Debug","connectiong to net...");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStream is = new BufferedInputStream(conn.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
                sb.append(line).append('\n');
            response=sb.toString();
            Log.d("Debug","connected to net!!!");
            //Log.d("Debug",getJsonResponse()+"/ERROR/");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getJsonResponse()
    {
        return response;
    }
}

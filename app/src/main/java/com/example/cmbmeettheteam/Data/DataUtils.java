package com.example.cmbmeettheteam.Data;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DataUtils {

    private static final String TAG = "DataUtils";

    public static final String INTENT_EXTRA_TEAM_MEMBER = "TeamMember";

    public static String getRawData(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }
            inputStream.close();
        } catch (Exception e) {
            Log.e(TAG, "Error reading from Raw data source: " + e.toString());
        }

        return stringBuilder.toString();
    }
}

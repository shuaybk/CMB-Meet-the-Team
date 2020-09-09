package com.example.cmbmeettheteam.Utils;

import android.content.Context;
import android.util.Log;

import com.example.cmbmeettheteam.R;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DataUtils {

    private static final String TAG = "DataUtils";

    public static String getRawData(Context context) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            InputStream inputStream = context.getResources().openRawResource(R.raw.team); //TO DO: Get the inputstream from Raw folder
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

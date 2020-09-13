package com.example.cmbmeettheteam.Data;

import android.util.Log;

import com.example.cmbmeettheteam.Models.TeamMember;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonUtils {

    private static final String TAG = "JsonUtils";
    private static final String JSON_TEAMMEMBER_ID_KEY = "id";
    private static final String JSON_TEAMMEMBER_NAME_KEY = "name";
    private static final String JSON_TEAMMEMBER_POSITION_KEY = "position";
    private static final String JSON_TEAMMEMBER_IMAGE_KEY = "profile_image";
    private static final String JSON_TEAMMEMBER_PERSONALITY_KEY = "personality";
    private static final String JSON_TEAMMEMBER_INTERESTS_KEY = "interests";
    private static final String JSON_TEAMMEMBER_DATING_PREFS_KEY = "dating_preferences";


    public static ArrayList<TeamMember> jsonToTeamList(String json) {
        ArrayList<TeamMember> team = new ArrayList<>();

        try {
            JSONArray teamJsonArray = new JSONArray(json);
            for (int i = 0; i < teamJsonArray.length(); i++) {
                TeamMember teamMember = jsonToTeamMember(teamJsonArray.getJSONObject(i));
                team.add(teamMember);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error parsing JSON: " + e.getMessage());
        }

        return team;
    }

    private static TeamMember jsonToTeamMember(JSONObject jsonObject) {
        String id = "";
        String name = "";
        String position = "";
        String image = "";
        String personality = "";
        String interests = "";
        String datingPrefs = "";

        try {
            if (jsonObject.has(JSON_TEAMMEMBER_ID_KEY)) {
                id = jsonObject.getString(JSON_TEAMMEMBER_ID_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_NAME_KEY)) {
                name = jsonObject.getString(JSON_TEAMMEMBER_NAME_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_POSITION_KEY)) {
                position = jsonObject.getString(JSON_TEAMMEMBER_POSITION_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_IMAGE_KEY)) {
                image = jsonObject.getString(JSON_TEAMMEMBER_IMAGE_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_PERSONALITY_KEY)) {
                personality = jsonObject.getString(JSON_TEAMMEMBER_PERSONALITY_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_INTERESTS_KEY)) {
                interests = jsonObject.getString(JSON_TEAMMEMBER_INTERESTS_KEY);
            }
            if (jsonObject.has(JSON_TEAMMEMBER_DATING_PREFS_KEY)) {
                datingPrefs = jsonObject.getString(JSON_TEAMMEMBER_DATING_PREFS_KEY);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error parsing TeamMember JSON: " + e.getMessage());
        }

        return new TeamMember(id, name, position, image, personality, interests, datingPrefs);
    }
}

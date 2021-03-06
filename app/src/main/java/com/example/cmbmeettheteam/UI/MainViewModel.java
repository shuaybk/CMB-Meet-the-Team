package com.example.cmbmeettheteam.UI;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.cmbmeettheteam.Models.TeamMember;
import com.example.cmbmeettheteam.R;
import com.example.cmbmeettheteam.Data.DataUtils;
import com.example.cmbmeettheteam.Data.JsonUtils;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    private final String TAG = this.getClass().getSimpleName();

    private ArrayList<TeamMember> teamMembers;

    public ArrayList<TeamMember> getTeamInfo(Context context) {
        if (teamMembers == null) {
            String rawJson = DataUtils.getRawData(context.getResources().openRawResource(R.raw.team));
            teamMembers = JsonUtils.jsonToTeamList(rawJson);
        }
        return teamMembers;
    }

}

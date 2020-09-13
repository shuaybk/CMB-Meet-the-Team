package com.example.cmbmeettheteam.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

import com.example.cmbmeettheteam.Data.DataUtils;
import com.example.cmbmeettheteam.Data.JsonUtils;
import com.example.cmbmeettheteam.Models.TeamMember;
import com.example.cmbmeettheteam.R;
import com.example.cmbmeettheteam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements TeamRecyclerViewAdapter.TeamMemberItemClickListener {

    private final String TAG = this.getClass().getSimpleName();
    private final int NUM_COLUMNS = 2;

    private int screenWidth;

    private MainViewModel mData;
    private ActivityMainBinding mBinding;
    private TeamRecyclerViewAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDisplayProperties();

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mData = new ViewModelProvider(this).get(MainViewModel.class);

        int imageWidth = screenWidth/NUM_COLUMNS;
        teamAdapter = new TeamRecyclerViewAdapter(mData.getTeamInfo(this), imageWidth, this);
        mBinding.teamRecyclerView.setAdapter(teamAdapter);
        mBinding.teamRecyclerView.setLayoutManager(new GridLayoutManager(this, NUM_COLUMNS));
    }

    private void getDisplayProperties() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
    }

    @Override
    public void onTeamMemberItemClick(TeamMember teamMember) {
        Intent intent = new Intent(this, MemberDetailsActivity.class);
        intent.putExtra(DataUtils.INTENT_EXTRA_TEAM_MEMBER, teamMember);
        startActivity(intent);
    }
}

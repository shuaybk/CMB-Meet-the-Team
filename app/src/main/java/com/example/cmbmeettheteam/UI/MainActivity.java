package com.example.cmbmeettheteam.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.cmbmeettheteam.R;
import com.example.cmbmeettheteam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    MainViewModel mData;
    ActivityMainBinding mBinding;
    TeamRecyclerViewAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mData = new ViewModelProvider(this).get(MainViewModel.class);
        teamAdapter = new TeamRecyclerViewAdapter(mData.getTeamInfo(this));
        mBinding.teamRecyclerView.setAdapter(teamAdapter);
        mBinding.teamRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }
}

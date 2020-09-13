package com.example.cmbmeettheteam.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.cmbmeettheteam.Data.DataUtils;
import com.example.cmbmeettheteam.Models.TeamMember;
import com.example.cmbmeettheteam.R;
import com.example.cmbmeettheteam.databinding.ActivityMemberDetailsBinding;

public class MemberDetailsActivity extends AppCompatActivity {

    ActivityMemberDetailsBinding mBinding;
    TeamMember teamMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_member_details);

        teamMember = getIntent().getParcelableExtra(DataUtils.INTENT_EXTRA_TEAM_MEMBER);

    }
}

package com.example.cmbmeettheteam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.cmbmeettheteam.Utils.DataUtils;
import com.example.cmbmeettheteam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    MainViewModel mData;
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mData = new ViewModelProvider(this).get(MainViewModel.class);
        mBinding.test.setText(DataUtils.getRawData(getResources().openRawResource(R.raw.team)));
    }
}

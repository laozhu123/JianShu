package com.zhu.zjut.jianshu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.zhu.zjut.jianshu.R;
import com.zhu.zjut.jianshu.application.MyApplication;

public class MainActivity extends BaseActivity {

    public static MainActivity mMainActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainActivity = this;
        setContentView(R.layout.activity_main);
        initActionBar();
        changeSkinMode(MyApplication.appConfig.getNightModeSwitch());
    }


    public void initActionBar() {
        mActionBar = getSupportActionBar();
    }

    public void changeSkinMode(boolean isNight) {
        changeActionbarSkinMode(mActionBar, isNight);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_index, menu);
        getMenuInflater().inflate(R.menu.menu_column, menu);
        return true;
    }

    public void setting(View view){
        startActivity(new Intent(this,SettingActivity.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.action_night:
                Toast.makeText(this,"转换",Toast.LENGTH_SHORT).show();
                boolean isNightMode = MyApplication.appConfig.getNightModeSwitch();
                MyApplication.appConfig.setNightModeSwitch(!isNightMode);
                changeSkinMode(!isNightMode);
                break;
            case R.id.action_recyle:
                Toast.makeText(this,"同步",Toast.LENGTH_SHORT).show();
            case R.id.action_edit:
                Toast.makeText(this,"编辑",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}

package com.domain.internapp;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {

private Toolbar mToolbar;
private AppBarLayout mAppBarLayout;
private BottomNavigationView mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mToolbar=findViewById(R.id.toolbar);
         mBottomNavigation=findViewById(R.id.bottom_navigation);
         mAppBarLayout=findViewById(R.id.appbar);

        setSupportActionBar(mToolbar);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.bnPreferences:
//                newGame();
                return true;
            case R.id.bnHome:
//                showHelp();
                return true;
            case R.id.bnMe:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}

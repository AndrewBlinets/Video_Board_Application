package by.andrew.blinets.video_board;



import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import by.andrew.blinets.video_board.Fragment.Fragment_add;
import by.andrew.blinets.video_board.Fragment.Fragment_advretisement;
import by.andrew.blinets.video_board.Fragment.Fragment_search;
import by.andrew.blinets.video_board.Fragment.Fragment_settings;
import by.andrew.blinets.video_board.Fragment.Fragment_sub_and_categories;

/**
 * Created by Андрей on 10.02.2017.
 */

public class Activity_main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        Fragment fragment = null;

        Class fragmentClass = Fragment_sub_and_categories.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu_toolbar; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Fragment fragment = null;
        Class fragmentClass = null;

        switch (item.getItemId())
        {
            case R.id.search_menu_toolbar:
            {
                fragmentClass = Fragment_search.class;
                break;
            }
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        Fragment fragment = null;
        Class fragmentClass = null;

        switch(item.getItemId())
        {
            case R.id.advertisement_menu_navigation:
            {
                fragmentClass = Fragment_advretisement.class;
                break;
            }
            case R.id.advertisement_moderation_menu_navigation:
            {
                fragmentClass = Fragment_advretisement.class;
                break;
            }
            case R.id.categoty_menu_navigation:
            {
                fragmentClass = Fragment_sub_and_categories.class;
                break;
            }
            case R.id.add_menu_navigation:
            {
                fragmentClass = Fragment_add.class;
                break;
            }
            case R.id.search_menu_navigation:
            {
                fragmentClass = Fragment_search.class;
                break;
            }
            case R.id.settings_menu_navigation:
            {
                fragmentClass = Fragment_settings.class;
                break;
            }
            case R.id.exit_menu_navigation:
            {
                finish();
                break;
            }
            default:
            {
                fragmentClass = Fragment_sub_and_categories.class;
                break;
            }
        }
       if(fragmentClass != null) {
           try {
               fragment = (Fragment) fragmentClass.newInstance();
           } catch (Exception e) {
               e.printStackTrace();
           }
           FragmentManager fragmentManager = getSupportFragmentManager();
           fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
       }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
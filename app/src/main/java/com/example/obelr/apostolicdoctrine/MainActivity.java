package com.example.obelr.apostolicdoctrine;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar=null;
    ListView listView;
    ArrayList<Module> modules;
    String [] strArr;
    DBController controller;

    MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        app= (MyApplication)getApplication();
        super.onCreate(savedInstanceState);
        setTheme(constant.theme);
        app.saveTheme(getApplicationContext(),constant.color);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(constant.color);
        controller = new DBController(this);

        listView = (ListView)findViewById(R.id.MainList);

        updateListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0||position == 1){
                    Intent intent = new Intent(MainActivity.this,LessonActivity.class)
                            .putExtra(Intent.EXTRA_TEXT,modules.get(position).getMODULE_CURRENT_LESSON());
                    startActivity(intent);

                }
                else
                    Toast.makeText(MainActivity.this, "COMING SOON :)", Toast.LENGTH_SHORT).show();
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_lan)
        {

            if (DBHandler.langIsEnglish){
                item.setTitle("ENGLISH");
                getSupportActionBar().setTitle("የሐዋርያት ትምህርት");
                DBHandler.langIsEnglish = false;
            }else{
                item.setTitle("አማርኛ");
                getSupportActionBar().setTitle(R.string.app_name);
                DBHandler.langIsEnglish = true;
            }

            updateListView();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){

            case R.id.nav_home:
                Intent h = new Intent(MainActivity.this,MainActivity.class);
                startActivity(h);
                break;
            case R.id.nav_beginners:
                Intent b = new Intent(MainActivity.this,Beginners.class);
                startActivity(b);
                break;
            case R.id.nav_intermediate:
                Intent i = new Intent(MainActivity.this,Intermediate.class);
                startActivity(i);
                break;
            case R.id.nav_advanced:
                Intent A = new Intent(MainActivity.this,Advanced.class);
                startActivity(A);
                break;
            case R.id.nav_setting:
                Intent s = new Intent(MainActivity.this,setting.class);
                startActivity(s);
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void updateListView(){


        modules = controller.getAllMoudles();
        strArr = new String[modules.size()];
        for (int i = 0; i<strArr.length; i++)
        {
            strArr[i]=modules.get(i).getMODULE_TITLE();
        }

        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                strArr));
    }
}

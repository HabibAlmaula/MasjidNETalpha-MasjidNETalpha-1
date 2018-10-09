package com.rawzadigital.www.masjidnetalpha;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class KajianActivity extends AppCompatActivity {

    //Bottom Nav Button
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationViewKajian
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke Profile Activity", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent(KajianActivity.this, Activity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_video:
                    Toast.makeText(getApplicationContext(), "Anda berada di Halaman Kajian", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_materi:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke MateriActivty",  Toast.LENGTH_SHORT).show();
                    Intent materiIntent = new Intent(KajianActivity.this, MateriActivity.class);
                    startActivity(materiIntent);
                    return true;
                case R.id.nav_event:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke  EventActivity",Toast.LENGTH_SHORT).show();
                    Intent eventIntent = new Intent(KajianActivity.this, EventActivity.class);
                    startActivity(eventIntent);
                    return true;
                case R.id.nav_profile:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke ProfileActivity", Toast.LENGTH_SHORT).show();
                    Intent profileIntent = new Intent(KajianActivity.this, TakmirActivity.class);
                    startActivity(profileIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kajian);

        WebView wvKajian;
        final String url = "http://masjid.fkam.or.id/detail/allRecord/oauth/phone/";

        Intent kajianIntent = getIntent();

        String Uid = kajianIntent.getStringExtra("UID");
        String UID = url + Uid;

        wvKajian = findViewById(R.id.wv_kajian);
        wvKajian.getSettings().setJavaScriptEnabled(true);
        wvKajian.loadUrl(UID);
        wvKajian.setWebViewClient(new WebViewClient());

        BottomNavigationView navigationViewKajian = findViewById(R.id.navigation_bawah);
        navigationViewKajian.setOnNavigationItemSelectedListener(mNavigationViewKajian);

    }
}

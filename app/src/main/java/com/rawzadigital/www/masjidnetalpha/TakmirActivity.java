package com.rawzadigital.www.masjidnetalpha;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class TakmirActivity extends AppCompatActivity {

    //Bottom Nav Button
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationViewTakmir
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke Profile Activity", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent(TakmirActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_video:
                    //Toast.makeText(getApplicationContext(), "Navigasi ke  VideoActivity", Toast.LENGTH_SHORT).show();
                    Intent videoIntent = new Intent(TakmirActivity.this, KajianActivity.class);
                    startActivity(videoIntent);
                    return true;
                case R.id.nav_materi:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke MateriActivty",  Toast.LENGTH_SHORT).show();
                    Intent materiIntent = new Intent(TakmirActivity.this, MateriActivity.class);
                    startActivity(materiIntent);
                    return true;
                case R.id.nav_event:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke  EventActivity",Toast.LENGTH_SHORT).show();
                    Intent eventIntent = new Intent(TakmirActivity.this, EventActivity.class);
                    startActivity(eventIntent);
                    return true;
                case R.id.nav_profile:
                    Intent profileIntent = new Intent(TakmirActivity.this, Activity.class);
                    startActivity(profileIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takmir);

        WebView wvMasjid;
        final String url = "http://masjid.fkam.or.id/detail/navbar/oauth/phone";

        Intent takmirIntent = getIntent();

        String Uid = takmirIntent.getStringExtra("UID");
        String UID = url + Uid;

        wvMasjid = findViewById(R.id.wv_takmir);
        wvMasjid.getSettings().setJavaScriptEnabled(true);
        wvMasjid.loadUrl(UID);
        wvMasjid.setWebViewClient(new WebViewClient());

        BottomNavigationView navigationViewTakmir = findViewById(R.id.navigation_bawah);
        navigationViewTakmir.setOnNavigationItemSelectedListener(mNavigationViewTakmir);


    }

}

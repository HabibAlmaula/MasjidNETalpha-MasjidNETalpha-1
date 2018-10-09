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

public class EventActivity extends AppCompatActivity {

    //Bottom Nav Button
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationViewEvent
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke Profile Activity", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent(EventActivity.this, Activity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_video:
                    //Toast.makeText(getApplicationContext(), "Navigasi ke  VideoActivity", Toast.LENGTH_SHORT).show();
                    Intent videoIntent = new Intent(EventActivity.this, KajianActivity.class);
                    startActivity(videoIntent);
                    return true;
                case R.id.nav_materi:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke MateriActivty",  Toast.LENGTH_SHORT).show();
                    Intent materiIntent = new Intent(EventActivity.this, MateriActivity.class);
                    startActivity(materiIntent);
                    return true;
                case R.id.nav_event:
                    Toast.makeText(getApplicationContext(), "Anda di halaman event", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_profile:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke ProfileActivity", Toast.LENGTH_SHORT).show();
                    Intent profileIntent = new Intent(EventActivity.this, TakmirActivity.class);
                    startActivity(profileIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        WebView wvMasjid;
        final String url = "http://masjid.fkam.or.id/detail/allEvents/oauth/phone/";

        Intent takmirIntent = getIntent();

        String Uid = takmirIntent.getStringExtra("UID");
        String UID = url + Uid;

        wvMasjid = findViewById(R.id.wv_event);
        wvMasjid.getSettings().setJavaScriptEnabled(true);
        wvMasjid.loadUrl(UID);
        wvMasjid.setWebViewClient(new WebViewClient());

        BottomNavigationView navigationViewEvent = findViewById(R.id.navigation_bawah);
        navigationViewEvent.setOnNavigationItemSelectedListener(mNavigationViewEvent);
    }
}

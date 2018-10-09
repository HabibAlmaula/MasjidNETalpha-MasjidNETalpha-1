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

public class MateriActivity extends AppCompatActivity {

    //Bottom Nav Button
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationViewMateri
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke Profile Activity", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent(MateriActivity.this, Activity.class);
                    startActivity(intent);
                    return true;
                case R.id.nav_video:
                    //Toast.makeText(getApplicationContext(), "Navigasi ke  VideoActivity", Toast.LENGTH_SHORT).show();
                    Intent videoIntent = new Intent(MateriActivity.this, KajianActivity.class);
                    startActivity(videoIntent);
                    return true;
                case R.id.nav_materi:
                    Toast.makeText(getApplicationContext(), "Anda di Halaman Materi", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_event:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke  EventActivity",Toast.LENGTH_SHORT).show();
                    Intent eventIntent = new Intent(MateriActivity.this, EventActivity.class);
                    startActivity(eventIntent);
                    return true;
                case R.id.nav_profile:
                    //Toast.makeText(getApplicationContext(),"Navigasi ke ProfileActivity", Toast.LENGTH_SHORT).show();
                    Intent profileIntent = new Intent(MateriActivity.this, ProfileActivity.class);
                    startActivity(profileIntent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        WebView wvMateri;
        final String url = "http://masjid.fkam.or.id/detail/allArticles/oauth/phone/";

        Intent materiIntent = getIntent();

        String Uid = materiIntent.getStringExtra("UID");
        String UID = url + Uid;

        wvMateri = findViewById(R.id.wv_materi);
        wvMateri.getSettings().setJavaScriptEnabled(true);
        wvMateri.loadUrl(UID);
        wvMateri.setWebViewClient(new WebViewClient());

        BottomNavigationView navigationViewTakmir = findViewById(R.id.navigation_bawah);
        navigationViewTakmir.setOnNavigationItemSelectedListener(mNavigationViewMateri);

    }
}

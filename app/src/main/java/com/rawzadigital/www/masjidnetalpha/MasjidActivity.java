package com.rawzadigital.www.masjidnetalpha;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.rawzadigital.www.masjidnetalpha.Fragment.AkunFragment;
import com.rawzadigital.www.masjidnetalpha.Fragment.EventFragment;
import com.rawzadigital.www.masjidnetalpha.Fragment.KajianFragment;
import com.rawzadigital.www.masjidnetalpha.Fragment.MasjidFragment;
import com.rawzadigital.www.masjidnetalpha.Fragment.MateriFragment;

public class MasjidActivity extends AppCompatActivity {

    private BottomNavigationViewEx bottom_navbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid);

        bottom_navbar = findViewById(R.id.bottom_navbar);
        bottom_navbar.enableShiftingMode(false);
        bottom_navbar.enableShiftingMode(false);

        final FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.content_graber, new MasjidFragment()).commit();

        bottom_navbar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationViewEx.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationViewEx.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    ft.replace(R.id.content_graber,new MasjidFragment()).commit();
                    return true;

                case R.id.nav_video:
                    ft.replace(R.id.content_graber,new KajianFragment()).commit();
                    return true;

                case R.id.nav_materi:
                    ft.replace(R.id.content_graber,new MateriFragment()).commit();
                    return true;

                case R.id.nav_event:
                    ft.replace(R.id.content_graber,new EventFragment()).commit();
                    return true;

                case R.id.nav_profile:
                    ft.replace(R.id.content_graber,new AkunFragment()).commit();
                    return true;




            }

            return false;
        }
    };
}

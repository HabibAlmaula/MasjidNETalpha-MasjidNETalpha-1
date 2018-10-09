package com.rawzadigital.www.masjidnetalpha;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //tambahan UID habib
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        final String Uid = currentUser.getUid();


        //Button ke MasjidActivity
        CardView cardViewMasjid = findViewById(R.id.cv_masjid);
        cardViewMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MasjidActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        ImageView ibMasjid = findViewById(R.id.ib_masjid);
        ibMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(ProfileActivity.this, MasjidActivity.class);
                intent.putExtra("UID",  Uid);
                startActivity(intent);
            }
        });

        //Button ke Takmir Activity
        CardView cardViewTakmir = findViewById(R.id.cv_takmir);
        cardViewTakmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Takmir Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, TakmirActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        ImageView ibTakmir = findViewById(R.id.ib_takmir);
        ibTakmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Takmir Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, TakmirActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        //Button ke Event Activity
        CardView cardViewEvent = findViewById(R.id.cv_event);
        cardViewEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Event Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, EventActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        ImageView ibEvent = findViewById(R.id.ib_event);
        ibEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Event Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, EventActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        //Button ke Kajian Video Activity
        CardView cardViewKajian = findViewById(R.id.cv_kajian);
        cardViewKajian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Kajian Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, KajianActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        ImageView ibKajian = findViewById(R.id.ib_kajian);
        ibKajian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Kajian Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, KajianActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        //Button ke Materi Activity
        CardView cardViewMateri = findViewById(R.id.cv_materi);
        cardViewMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Kajian Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, MateriActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        ImageView ibMateri = findViewById(R.id.ib_materi);
        ibMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Button ke Materi Activity", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ProfileActivity.this, MateriActivity.class);
                intent.putExtra("UID", Uid);
                startActivity(intent);
            }
        });

        //Button ke Lainnya Activity
        //CardView  cardViewLainnya = findViewById(R.id.cv_lainnya);
        //cardViewLainnya.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Toast.makeText(getApplicationContext(), "Button ke Lainnya Activity", Toast.LENGTH_LONG).show();
        //Intent intent = new Intent(ProfileActivity.this, LainnyaActivity.class);
        //intent.putExtra("UID", Uid);
        //startActivity(intent);
        //   }
        //});

        //ImageView ibLainnya =  findViewById(R.id.ib_lainnya);
        //ibLainnya.setOnClickListener(new View.OnClickListener() {
        //@Override
        //    public void onClick(View v) {
        //        Toast.makeText(getApplicationContext(), "Button ke Lainnya Activity", Toast.LENGTH_LONG).show();
        //Intent intent =  new Intent(ProfileActivity.this, LainnyaActivity.class);
        //intent.putExtra("UID",  Uid);
        //startActivity(intent);
        //    }
        // });
        //}
    }
}

package com.rawzadigital.www.masjidnetalpha.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rawzadigital.www.masjidnetalpha.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KajianFragment extends Fragment {

    WebView wv_kajian;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_kajian, container, false);

       // FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
       // final String Uid = currentUser.getUid();

        final String url = "http://masjid.fkam.or.id/detail/allRecord/oauth/phone/";
        final String DummyUid ="w5le0dtirzYxN2vcxgt9p2gPRDz2";

        wv_kajian = rootView.findViewById(R.id.wv_kajian);

        WebSettings webSettings = wv_kajian.getSettings();

       // webSettings.setJavaScriptEnabled(true);

        wv_kajian.loadUrl(url+DummyUid);

        return rootView;
    }

}

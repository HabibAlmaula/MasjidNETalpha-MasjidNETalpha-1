package com.rawzadigital.www.masjidnetalpha.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rawzadigital.www.masjidnetalpha.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasjidFragment extends Fragment {

    WebView wv_masjid;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_masjid, container, false);

       // FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        //final String Uid = currentUser.getUid();

        final String url = "http://masjid.fkam.or.id/oauth/phone/";
        final String DummyUid ="w5le0dtirzYxN2vcxgt9p2gPRDz2";

        wv_masjid = rootView.findViewById(R.id.wv_masjid);

        wv_masjid.getSettings().setJavaScriptEnabled(true);
        wv_masjid.setWebViewClient(new WebViewClient());

        wv_masjid.loadUrl(url+DummyUid);

        return rootView;
    }

}

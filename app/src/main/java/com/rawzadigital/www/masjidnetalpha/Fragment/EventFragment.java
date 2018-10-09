package com.rawzadigital.www.masjidnetalpha.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rawzadigital.www.masjidnetalpha.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


WebView wv_event;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_event, container, false);

      //  FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
       // final String Uid = currentUser.getUid();

        final String url = "http://masjid.fkam.or.id/detail/allEvents/oauth/phone/";
        final String DummyUid ="w5le0dtirzYxN2vcxgt9p2gPRDz2";

        wv_event = rootView.findViewById(R.id.wv_event);

        wv_event.getSettings().setJavaScriptEnabled(true);
        wv_event.setWebViewClient(new WebViewClient());

        wv_event.loadUrl(url+DummyUid);

        return rootView;
    }

}

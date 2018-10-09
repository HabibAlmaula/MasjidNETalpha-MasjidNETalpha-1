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
public class MateriFragment extends Fragment {


    WebView wv_materi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_materi, container, false);

      //  FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
       // final String Uid = currentUser.getUid();

        final String url = "http://masjid.fkam.or.id/detail/allArticles/oauth/phone/";
        final String DummyUid ="w5le0dtirzYxN2vcxgt9p2gPRDz2";

        wv_materi = rootView.findViewById(R.id.wv_materi);

        wv_materi.getSettings().setJavaScriptEnabled(true);
        wv_materi.setWebViewClient(new WebViewClient());

        wv_materi.loadUrl(url+DummyUid);

        return rootView;
    }

}

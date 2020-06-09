package com.hashtech360.hashtech360.ui.cloud_apps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hashtech360.hashtech360.R;

public class CloudAppsFragment extends Fragment {

    private CloudAppsViewModel cloudAppsViewModel;
    //private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        cloudAppsViewModel =
                ViewModelProviders.of(this).get(CloudAppsViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_cloud_apps, container, false);
        //final TextView textView = root.findViewById(R.id.text_cloud_apps);
        //webView = root.findViewById(R.id.webview_cloud_apps);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/cloud-based-softwares/");

        return root;
    }


}
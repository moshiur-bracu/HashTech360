package com.hashtech360.hashtech360.ui.mobile_apps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hashtech360.hashtech360.R;

public class MobileAppsFragment extends Fragment {

    private MobileAppsViewModel mobileAppsViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mobileAppsViewModel =
                ViewModelProviders.of(this).get(MobileAppsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mobile_apps, container, false);
        /*final TextView textView = root.findViewById(R.id.text_mobile_apps);
        mobileAppsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //webView = root.findViewById(R.id.webview_mobile_apps);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/mobile-application/");
        return root;
    }
}
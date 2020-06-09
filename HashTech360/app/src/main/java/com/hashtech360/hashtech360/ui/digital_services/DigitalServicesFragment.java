package com.hashtech360.hashtech360.ui.digital_services;

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

public class DigitalServicesFragment extends Fragment {

    private DigitalServicesViewModel digitalServicesViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        digitalServicesViewModel =
                ViewModelProviders.of(this).get(DigitalServicesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_digital_services, container, false);
        /*final TextView textView = root.findViewById(R.id.text_digital_services);
        digitalServicesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //webView = root.findViewById(R.id.webview_digital_services);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/360-degree-digital-services/");
        return root;
    }
}
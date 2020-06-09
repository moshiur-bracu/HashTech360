package com.hashtech360.hashtech360.ui.web_development;

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

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hashtech360.hashtech360.R;
import com.hashtech360.hashtech360.ui.why_us.WhyUsFragment;

public class WebDevelopmentFragment extends Fragment {

    private WebDevelopmentViewModel webDevelopmentViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        webDevelopmentViewModel =
                ViewModelProviders.of(this).get(WebDevelopmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_web_development, container, false);
        /*final TextView textView = root.findViewById(R.id.text_web_development);
        webDevelopmentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //webView = root.findViewById(R.id.webview_web_development);
       // webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/web-application-design-development/");
        return root;
    }
}
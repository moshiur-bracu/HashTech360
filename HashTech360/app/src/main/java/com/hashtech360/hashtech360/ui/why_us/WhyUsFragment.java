package com.hashtech360.hashtech360.ui.why_us;

import android.content.Intent;
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

public class WhyUsFragment extends Fragment {

    private WhyUsViewModel whyUsViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        whyUsViewModel =
                ViewModelProviders.of(this).get(WhyUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_why_us, container, false);
        /*final TextView textView = root.findViewById(R.id.text_why_us);
        whyUsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //webView = root.findViewById(R.id.webview_why_us);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/");

        /*FloatingActionButton fab_email = root.findViewById(R.id.fab_email);
        fab_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            }
        });*/

        return root;
    }
}
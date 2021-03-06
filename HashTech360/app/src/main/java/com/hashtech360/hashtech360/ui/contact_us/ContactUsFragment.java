package com.hashtech360.hashtech360.ui.contact_us;

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

public class ContactUsFragment extends Fragment {

    private ContactUsViewModel contactUsViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactUsViewModel =
                ViewModelProviders.of(this).get(ContactUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contact_us, container, false);
        /*final TextView textView = root.findViewById(R.id.text_contact_us);
        contactUsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        //webView = root.findViewById(R.id.webview_contact_us);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://hashtech360.com/");
        return root;
    }
}
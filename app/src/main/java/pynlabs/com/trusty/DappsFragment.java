package pynlabs.com.trusty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class DappsFragment extends Fragment {


    public static DappsFragment newInstance() {
        DappsFragment fragment = new DappsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_dapps, container, false);


        WebView dappsWebView = rootView.findViewById(R.id.dappsWebview);
        dappsWebView.getSettings().setJavaScriptEnabled(true);
        dappsWebView.loadUrl(getString(R.string.dapps_url));

        return rootView;
    }


}

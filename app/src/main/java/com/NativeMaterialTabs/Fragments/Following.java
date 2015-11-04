package com.NativeMaterialTabs.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.NativeMaterialTabs.R;

/**
 * Created by mshico on 11/4/15.
 */
public class Following extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.following_tab, container, false);
        return v;
    }
}

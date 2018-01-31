package io.github.rajdeep1008.cryptofolio.fragment;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import io.github.rajdeep1008.cryptofolio.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.app_preferences);
    }
}

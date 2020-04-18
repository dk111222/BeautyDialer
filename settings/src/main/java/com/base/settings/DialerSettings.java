package com.base.settings;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import com.base.common.TelecomHelper;

public class DialerSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat implements Preference.OnPreferenceChangeListener {
        private final String KEY_DEF_DIALER = "default_dialer";
        private final String KEY_DEF_CALLINGSCREENSERVICE = "default_dialer";
        private SwitchPreferenceCompat mDefDialerPref;
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
            mDefDialerPref = findPreference("default_dialer");
            mDefDialerPref.setOnPreferenceChangeListener(this);
            mDefDialerPref.setSummary(TelecomHelper.getInstance().getDefaultDialer());
        }

        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {
            if (mDefDialerPref == preference) {
                boolean on = (boolean)newValue;
                if(on) {
                } else {
                }
                mDefDialerPref.setSummary(TelecomHelper.getInstance().getDefaultDialer());
                return on;
            }
            return false;
        }
    }
}
package com.eui.futbol.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import com.eui.futbol.ApplicationClass;

/**
 * Created by lfmingo on 11/03/15.
 */
public class InjectedActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((ApplicationClass) getApplicationContext()).inject(this);
    }
}

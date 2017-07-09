package com.siberiadante;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;

/**
 * Created by SiberiaDante on 2017/5/10.
 * user this lib,you should init it first：context
 */

public class SiberiaDanteLib {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    @SuppressLint("StaticFieldLeak")
    private static Activity activity;

    public SiberiaDanteLib() {
        throw new UnsupportedOperationException("not init SiberiaDanteLib");
    }

    public static void initLib(Context context) {
        SiberiaDanteLib.context = context.getApplicationContext();
    }

    public static void initLib(Activity activity) {
        SiberiaDanteLib.activity = activity;
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        } else {
            throw new NullPointerException(context.getString(R.string.NotInitError));

        }
    }

    public static Activity getActivity() {
        if (activity != null) {
            return activity;
        } else {
            throw new NullPointerException(activity.getString(R.string.NotInitErrorActivity));
        }
    }
}

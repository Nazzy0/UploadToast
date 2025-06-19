package com.example.uploadtoast;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    private static final String ALLOWED_PACKAGE = "com.skyproject.myapp";

    public static void show(Context context, String message) {
        String pkg = context.getPackageName();
        if (!pkg.equals(ALLOWED_PACKAGE)) {
            throw new SecurityException("Unauthorized: This library is not allowed in " + pkg);
        }
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
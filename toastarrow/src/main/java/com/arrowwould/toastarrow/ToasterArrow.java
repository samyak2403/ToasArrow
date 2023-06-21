package com.arrowwould.toastarrow;

import android.content.Context;
import android.widget.Toast;

public class ToasterArrow {
    public static void simpleToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}

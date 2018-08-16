package com.foodies.root.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 16/8/18.
 */

public class Toastmessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}

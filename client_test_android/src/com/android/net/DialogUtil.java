package com.android.net;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.app.Activity;
public class DialogUtil
{
 
    public static void showDialog(final Context ctx
        , String msg , boolean closeSelf)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx)
            .setMessage(msg).setCancelable(false);
        if(closeSelf)
        {
            builder.setPositiveButton("OK", new OnClickListener()
            {
                public void onClick(DialogInterface dialog, int which)
                {
                    //CLOSE Activity
                    ((Activity)ctx).finish();
                }
            });        
        }
        else
        {
            builder.setPositiveButton("OK", null);
        }
        builder.create().show();
    }    

    public static void showDialog(Context ctx , View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx)
            .setView(view).setCancelable(false)
            .setPositiveButton("OK", null);
        builder.create()
            .show();
    }
}
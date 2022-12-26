package com.example.rental_point;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
public class MessageBox {
    public void show(String title, String message, Activity activity)
    {
        dialog = new AlertDialog.Builder(activity) // Pass a reference to your main activity here
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        dialog.cancel();
                        prov = true;
                    }
                })
                .show();
    }
    boolean prov = false;
    private AlertDialog dialog;
}

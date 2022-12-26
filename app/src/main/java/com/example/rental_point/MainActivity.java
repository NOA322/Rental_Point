package com.example.rental_point;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


    }

    public void onClick(View v) {
        EditText et_emailText = findViewById(R.id.et_email);
        EditText et_passwordText = findViewById(R.id.et_password);
        String emailText = et_emailText.getText().toString();
        String passwordText = et_passwordText.getText().toString();
        MessageBox messageBox = new MessageBox();
        //if (1==1) {
        if (et_emailText.getText().toString().equals("mironov@namecomp.ru") && et_passwordText.getText().toString().equals("YOyhfR")) {
            messageBox.show("Система", "Добро пожаловать (старший смены) Миронов Вениамин Куприянович", this);
            Intent intent = new Intent(this, MenuActivity.class);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        et_emailText.setText("");
                        et_passwordText.setText("");
                        startActivity(intent);
                    }
                }, 2000);


        }else{
            messageBox.show("Система", "Логин или пароль введен неверно", this);
        }

    }


}
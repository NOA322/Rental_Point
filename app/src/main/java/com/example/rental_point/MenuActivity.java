
package com.example.rental_point;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(this, AddOrederActivity.class);
        startActivity(intent);
    }
    public void onClick2(View v) {
        Intent intent = new Intent(this, OrdersActivity.class);
        startActivity(intent);

    }
    public void onClick3(View v) {
        MessageBox messageBox = new MessageBox();
        messageBox.show("", "Логин или пароль введен неверно", this);

    }
}
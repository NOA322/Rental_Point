package com.example.rental_point;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ClientAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_add);
    }

    public void onClick1(View v) {
        EditText et_Text1 = findViewById(R.id.editTextTextPersonName1);
        EditText et_Text2 = findViewById(R.id.editTextTextPersonName2);
        EditText et_Text3 = findViewById(R.id.editTextTextPersonName3);
        String _Text1 = et_Text1.getText().toString();
        String _Text2 = et_Text2.getText().toString();
        String _Text3 = et_Text3.getText().toString();
        String[] arr  = new String[AddOrederActivity.arraySpinner.length+1];

        for(int i = 0; i <AddOrederActivity.arraySpinner.length; i++){
            arr[i]=AddOrederActivity.arraySpinner[i];
        }
        arr[AddOrederActivity.arraySpinner.length] = _Text1+" "+_Text2+" "+_Text3;
        AddOrederActivity.arraySpinner = arr;
        AddOrederActivity.add_client = true;
        finish();
    }
}
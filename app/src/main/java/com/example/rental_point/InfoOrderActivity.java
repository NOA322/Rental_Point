package com.example.rental_point;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class InfoOrderActivity extends AppCompatActivity {
    static String date = "";
    static String hour = "";
    static String itog = "";
    static String name = "";
    static String[] string_ysl = new String[] {};
    static String[] string_price = new String[] {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_order);
        TextView et_Text1 = findViewById(R.id.textView3);
        TextView et_Text2 = findViewById(R.id.textView4);
        TextView et_Text3 = findViewById(R.id.textView6);
        TextView et_Text4 = findViewById(R.id.textView8);
        et_Text1.setText("Клиент: "+name);
        et_Text2.setText("Дата: "+date);
        et_Text3.setText("Продолжительность: "+hour);
        et_Text4.setText("Итог: "+itog);

        TableLayout tableLayout = (TableLayout)findViewById(R.id.tableLayout);

        // первая строка
        for(int  i = 0; i < string_ysl.length ; i++){
            TableRow tableRow1 = new TableRow(this);

            TextView textView1 = new TextView(this);
            textView1.setText(""+string_ysl[i]);
            tableRow1.addView(textView1, new TableRow.LayoutParams(
                    TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

            TextView textView2 = new TextView(this);
            textView2.setText(""+string_price[i]);

            tableRow1.addView(textView2, new TableRow.LayoutParams(
                    TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));


            tableLayout.addView(tableRow1);
        }
    }
}
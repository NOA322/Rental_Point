package com.example.rental_point;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AddOrederActivity extends AppCompatActivity {

    static boolean add_client = false;
    static String[] arraySpinner =  new String[]
    {
        "Фролов Андрей Иванович"
                , "Николаев Даниил Всеволодович"
                , "Снегирев Макар Иванович"
                , "Иванов Иван Ильич"
                , "Филиппова Анна Глебовна"
                , "Иванов Михаил Владимирович"
                , "Власов Дмитрий Александрович"
                , "Серова Екатерина Львовна"
                , "Борисова Ирина Ивановна"
                , "Зайцев Никита Артёмович"
                , "Медведев Святослав Евгеньевич"
                , "Коротков Кирилл Алексеевич"
                , "Калашникова Арина Максимовна"
                , "Минина Таисия Кирилловна"
                , "Наумов Серафим Романович"
                , "Воробьева Василиса Евгеньевна"
                , "Калинин Александр Андреевич"
                , "Кузнецова Милана Владиславовна"
                , "Фирсов Егор Романович"
                , "Зимина Агния Александровна"
                , "Титов Андрей Глебович"
                , "Орлов Николай Егорович"
                , "Кузнецова Аиша Михайловна"
                , "Куликов Никита Георгиевич"
                , "Карпова София Егоровна"
                , "Смирнова Дарья Макаровна"
                , "Абрамова Александра Мироновна"
                , "Наумов Руслан Михайлович"
                , "Бочаров Никита Матвеевич"
                , "Соловьев Давид Ильич"
                , "Васильева Валерия Дмитриевна"
                , "Макарова Василиса Андреевна"
                , "Алексеев Матвей Викторович"
                , "Никитина Полина Александровна"
                , "Окулова Олеся Алексеевна"
                , "Захарова Полина Яновна"
                , "Зайцев Владимир Давидович"
                , "Иванов Виталий Даниилович"
                , "Захаров Матвей Романович"
                , "Иванов Степан Степанович"
                , "Ткачева Милана Тимуровна"
                , "Семенов Даниил Иванович"
                , "Виноградов Вячеслав Дмитриевич"
                , "Соболева Николь Фёдоровна"
                , "Тихонова Анна Львовна"
                , "Кузнецова Ульяна Савельевна"
                , "Смирнова Анна Германовна"
                , "Черепанова Анна Давидовна"
                , "Григорьев Максим Кириллович"
                , "Голубев Даниэль Александрович"
                , "Миронов Юрий Денисович"
                , "Терехов Михаил Андреевич"
                , "Орлова Алиса Михайловна"
                , "Кулаков Константин Даниилович"
                , "Кудрявцев Максим Романович"
                , "Соболева Кира Фёдоровна"
                , "Коновалов Арсений Максимович"
                , "Гусев Михаил Дмитриевич"
                , "Суханова Варвара Матвеевна"
                , "Орлова Ясмина Васильевна"
                , "Васильева Ксения Константиновна"
                , "Борисова Тамара Данииловна"
                , "Дмитриев Мирон Ильич"
                , "Лебедева Анна Александровна"
                , "Пономарев Артём Маркович"
                , "Борисова Елена Михайловна"
                , "Моисеев Камиль Максимович"
                , "Герасимова Дарья Константиновна"
                , "Михайлова Мария Марковна"
                , "Коршунов Кирилл Максимович"
    };
    static String[] string_id =
    {   "31","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","57","88","89","90","91","92","93","94","95","96","97","98","99","123","124","125","126","127","128","129","130","131","132","336","337","338","339","340","341","342","343","344","345","353"};

    static String[] string_name =
    {   "Прокат опорного оборудования для катка","Обучение катанию на коньках","Прокат Лыж детские с 30 по 34 размер, комплект  ","Прокат Лыж пластик, комплект  ","установка креплений на лыжероллеры","установка рукояток на палки","обработка скользящей поверхности легкофтористым парафином","Тюбинг большой","Снегокат","Услуга5","Услуга10","Прокат салазок","Прокат набора защитного оборудования","Палки лыжные","демонтаж креплений с лыж","установка опорных элементов","нанесение мази держания","Сноублейд","Брюки","Услуга4","Услуга9","Прокат ледянки","Катание на  катке","Прокат детских коньков","Прокат Лыж пластик ","установка креплений на лыжи","Прокат санок","обработка скользящей поверхности базовым парафином, промывка скользящей поверхности","Прокат сноуборда","Куртка","Услуга3","Услуга8","Прокат шлема","Прокат вартушки","Катание на горках","Прокат Лыж детские с 30 по 34 размер, комплект ","Ботинки лыжные ","Прокат Лыж пластик с креплением 75 мм, комплект  ","обрезка палок","обработка новых лыж","сезонная консервация лыж","Костюм","Услуга2","Услуга7","Прокат коньков","Прокат Лыж пластик (для конькового хода) комплект ","Прокат Лыж пластик с креплением 75 мм, комплект ","Прокат Лыж пластик с креплением 75 мм, комплект  ","демонтаж креплений с лыжероллеров","циклевка скользящей поверхности, ремонт лыж","обработка скользящей поверхности высокофтористым парафином, порошком","Тюбинг маленький","Услуга1","Услуга6","Заточка коньков"};
    static String[] string_price =
    {   "500","1000","50","80","50","30","60","100","100","100","50","450","800","30","60","100","200","150","50","150","50","300","400","800","100","200","300","100","50","80","50","80","300","100","500","60","100","100","100","50","60","30","60","30","1200","200","150","50","150","80","200","700","200","100","500"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_oreder);
        EditText et = (EditText) findViewById(R.id.et_times);
        et.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "24")});
        update_spisok();
        Spinner s = (Spinner)findViewById(R.id.Spinner02);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, string_name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        // первая строка

    }

    @Override
    public void onResume() {
        super.onResume();
        update_spisok();
        if(add_client ==true){
            Spinner s = (Spinner)findViewById(R.id.Spinner01);
            s.setSelection(arraySpinner.length-1);
            add_client = false;
        }

    }
    public void update_spisok(){
        Spinner s = (Spinner)findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

    }
    public void onClick1(View v) {
        String[] arr  = new String[OrdersActivity.string_date.length+1];

        for(int i = 0; i <OrdersActivity.string_date.length; i++){
            arr[i]=OrdersActivity.string_date[i];
        }
        Date currentTime = Calendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String date = format.format(Date.parse(""+currentTime));
        arr[OrdersActivity.string_date.length] = ""+date;
        Spinner s = (Spinner)findViewById(R.id.Spinner01);
        String position = s.getSelectedItem().toString();
        OrdersActivity.string_date = arr;
        String[] arr2  = new String[OrdersActivity.string_state.length+1];
        for(int i = 0; i <OrdersActivity.string_state.length; i++){
            arr2[i]=OrdersActivity.string_state[i];
        }
        arr2[OrdersActivity.string_state.length] = ""+position;

        OrdersActivity.string_state = arr2;
        String[] arr3  = new String[OrdersActivity.string_status.length+1];
        for(int i = 0; i <OrdersActivity.string_status.length; i++){
            arr3[i]=OrdersActivity.string_status[i];
        }
        arr3[OrdersActivity.string_status.length] = "Новая";
        TextView et_Text1 = findViewById(R.id.et_times);
        TextView et_Text2 = findViewById(R.id.textView4);

        OrdersActivity.string_status = arr3;
        InfoOrderActivity.name = ""+position;
        InfoOrderActivity.date = ""+date;
        InfoOrderActivity.hour = et_Text1.getText()+" часов";
        InfoOrderActivity.itog = ""+et_Text2.getText();
        MessageBox messageBox = new MessageBox();
        messageBox.show("Система", "Заказ оформлен", this);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                finish();
            }
        }, 5000);


    }
    public void onClick2(View v) {
        Intent intent = new Intent(this, ClientAddActivity.class);
        startActivity(intent);

    }
    public void onClick3(View v) {
        EditText et_Text1 = findViewById(R.id.et_password);
        et_Text1.setTextColor(Color.GREEN);
        ImageView imageView = findViewById(R.id.img_barcode);
        imageView.setImageResource(R.drawable.order59);
    }
    Integer price =0;
    Integer dlina =0;
    String[] string_ysl_ = new String[] {};
    String[] string_price_ = new String[] {};
    public void onClick4(View v) {
        Spinner s = (Spinner)findViewById(R.id.Spinner02);
        MessageBox messageBox = new MessageBox();
        ArrayAdapter adapter = (ArrayAdapter) s.getAdapter();
        int position = adapter.getPosition( s.getSelectedItem().toString());

        TableLayout tableLayout = (TableLayout)findViewById(R.id.tableLayout);
        dlina = dlina +1;
        // первая строка
        TableRow tableRow1 = new TableRow(this);

        TextView textView1 = new TextView(this);
        textView1.setText(""+string_name[position]);
        tableRow1.addView(textView1, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

        TextView textView2 = new TextView(this);
        textView2.setText(""+string_price[position]);

        tableRow1.addView(textView2, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
        price = price+ Integer.parseInt(string_price[position]);
        Button textView3 = new Button(this);
        textView3.setText("-");
        tableRow1.addView(textView3, new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));


        tableLayout.addView(tableRow1);
        EditText et_Text1 = findViewById(R.id.et_times);
        Integer num = Integer.parseInt(et_Text1.getText().toString());
        TextView TextView = findViewById(R.id.textView4);
        TextView.setText(""+(num*price));

        String[] arr  = new String[InfoOrderActivity.string_ysl.length+1];
        for(int i = 0; i <InfoOrderActivity.string_ysl.length; i++){
            arr[i]=InfoOrderActivity.string_ysl[i];
        }
        arr[InfoOrderActivity.string_ysl.length] = ""+string_name[position];
        InfoOrderActivity.string_ysl = arr;

        String[] arr2  = new String[InfoOrderActivity.string_price.length+1];
        for(int i = 0; i <InfoOrderActivity.string_price.length; i++){
            arr2[i]=InfoOrderActivity.string_price[i];
        }
        arr2[InfoOrderActivity.string_price.length] = ""+string_price[position]+" руб.";
        InfoOrderActivity.string_price = arr2;
    }

    public void setCompany(List<String> company) {

        Spinner s = (Spinner)findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, company);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

}
package com.example.rahim.carpoolapp1;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

public class Registoractivity extends AppCompatActivity {
    protected Button registorbtn;
    protected CheckBox  cardetails;
    AlertDialog b;
    AlertDialog.Builder dialogBuilder;
    private EditText db;
    Calendar mcurrentDate;
    int day,month,year;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registoractivity);
        cardetails =(CheckBox)findViewById(R.id.carchk);
        registorbtn =(Button)findViewById(R.id.registorbtn);
        db=(EditText) findViewById(R.id.db);
        //dob=(Button) findViewById(R.id.dob);
        mcurrentDate=Calendar.getInstance();
        day=mcurrentDate.get(Calendar.DAY_OF_MONTH);
        month=mcurrentDate.get(Calendar.MONTH);
        year=mcurrentDate.get(Calendar.YEAR);
        month+=1;
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datepicker=new DatePickerDialog(Registoractivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        i1=i1+1;
                        db.setText(i2+"/"+i1+"/"+i);

                    }
                },year,month,day);
                datepicker.show();
            }
        });


        registorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        if(cardetails.isChecked()){

            Intent intent4=new Intent(Registoractivity.this,CarDetail.class);
            startActivity(intent4);

        }
        else{

            Intent intent3=new Intent(Registoractivity.this,LoginActivity.class);
            startActivity(intent3);

        }
            }
        });

    }



}

package com.example.rahim.carpoolapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Registoractivity extends AppCompatActivity {
    protected Button registorbtn;
    protected CheckBox  cardetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registoractivity);
        cardetails =(CheckBox)findViewById(R.id.carchk);
        registorbtn =(Button)findViewById(R.id.registorbtn);
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
        } }
        });

    }
}

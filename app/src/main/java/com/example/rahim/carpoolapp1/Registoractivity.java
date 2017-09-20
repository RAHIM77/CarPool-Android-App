package com.example.rahim.carpoolapp1;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;

public class Registoractivity extends AppCompatActivity {
    protected Button registorbtn;
    protected CheckBox  cardetails;
    AlertDialog b;
    AlertDialog.Builder dialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registoractivity);
        cardetails =(CheckBox)findViewById(R.id.carchk);
        registorbtn =(Button)findViewById(R.id.registorbtn);
        registorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowProgressDialog();
                HideProgressDialog();
        if(cardetails.isChecked()){

            Intent intent4=new Intent(Registoractivity.this,CarDetail.class);
            startActivity(intent4);
            HideProgressDialog();;
        }
        else{
            ShowProgressDialog();
            Intent intent3=new Intent(Registoractivity.this,LoginActivity.class);
            startActivity(intent3);
            HideProgressDialog();
        }
            }
        });

    }
    public void ShowProgressDialog() {
        dialogBuilder = new AlertDialog.Builder(Registoractivity.this);
        LayoutInflater inflater = (LayoutInflater) getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View dialogView = inflater.inflate(R.layout.activity_registoractivity, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setCancelable(false);
        b = dialogBuilder.create();
        b.show();
    }

    public void HideProgressDialog(){

        b.dismiss();
    }
}

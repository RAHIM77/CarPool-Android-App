package com.example.rahim.carpoolapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarDetail extends AppCompatActivity {
  protected Button cardetailsave ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);
        cardetailsave =(Button)findViewById(R.id.carsave);
        cardetailsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(CarDetail.this,LoginActivity.class);
                startActivity(intent5);
            }
        });
    }
}

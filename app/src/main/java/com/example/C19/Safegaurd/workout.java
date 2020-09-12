 package com.example.C19.Safegaurd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;


 public class workout extends AppCompatActivity {
     CardView w1;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_workout);
         w1=findViewById(R.id.w1);
         w1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(workout.this,pushup.class));
             }
         });
     }
 }
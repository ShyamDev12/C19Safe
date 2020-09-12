package com.example.C19.Safegaurd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class six extends AppCompatActivity {
    CardView xo;
    CardView work;
    CardView fu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        xo=findViewById(R.id.xo);
        work=findViewById(R.id.work);
        fu=findViewById(R.id.fu);

        xo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(six.this,xo.class));
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(six.this,workout.class));
            }
        });
        fu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(six.this,fu.class));
            }
        });




    }
}
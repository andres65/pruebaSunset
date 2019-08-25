package com.example.pruebasunset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Leavectivity extends AppCompatActivity {

    ImageView dl;
    ImageView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leavectivity);

        dl=  findViewById(R.id.dislike);
        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Leavectivity.this, DashBoardActivity.class));
            }
        });

        l=  findViewById(R.id.like);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Leavectivity.this, DashBoardActivity.class));
            }
        });

    }
}

package com.example.tesis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Act2;

        Act2 =(Button)findViewById(R.id.registrologin);
        Act2 .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent Act2 = new Intent(MainActivity.this, Registro.class);
                startActivity(Act2);
            }
        });

    }
}

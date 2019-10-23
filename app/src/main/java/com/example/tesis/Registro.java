package com.example.tesis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Registro extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button ToMenu;

        ToMenu =(Button) findViewById(R.id.registeer);
        ToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent ToMenu = new Intent(Registro.this, Menu.class);
                startActivity(ToMenu);
            }
        });

    }
}

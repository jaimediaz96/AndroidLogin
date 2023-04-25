package com.example.androidlogin;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    TextView name;
    TextView pass;
    TextView online;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name = findViewById(R.id.infoName);
        pass = findViewById(R.id.infoPass);
        online = findViewById(R.id.infoOnline);

        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("DatoUser");
        name.setText(info);

        info = recibeDatos.getString("DatoPass");
        pass.setText(info);

        info = recibeDatos.getString("DatoOnline");
        pass.setText(info);
    }

    public void volver(View h){
        Intent ir =  new Intent(this, MainActivity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }
}
package com.example.sharedpreference_ejemplo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Map;
import java.util.Set;

public class ConsultaPreferencias extends AppCompatActivity {
private TextView txtResulUser,txtResulPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResulUser=findViewById(R.id.txtUser);
        txtResulPass=findViewById(R.id.txtPass);

        SharedPreferences sharedPreferences= getSharedPreferences("credenciales",MainActivity.MODE_PRIVATE); {

    }



}

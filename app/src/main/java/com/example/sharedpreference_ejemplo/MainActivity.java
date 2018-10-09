package com.example.sharedpreference_ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser=findViewById(R.id.edtUser);
        edtPass=findViewById(R.id.edtPass);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btoGuardar:
                guardarPreferencias();
                break;
            case R.id.btoCargar:
                Intent intent = new Intent(this,ConsultaPreferencias.class);
                startActivity(intent);
                break;
        }
    }
    private void guardarPreferencias(){

    }
}

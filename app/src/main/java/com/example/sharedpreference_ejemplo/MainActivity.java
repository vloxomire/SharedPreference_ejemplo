package com.example.sharedpreference_ejemplo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPass;
    TextView txtUser,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser=findViewById(R.id.edtUser);
        edtPass=findViewById(R.id.edtPass);
        txtUser=findViewById(R.id.txtUser);
        txtPass=findViewById(R.id.txtPass);

        cargarPreferencias();
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
    private void cargarPreferencias() {
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String user =preferences.getString("user","No existe");
        String pass =preferences.getString("pass","No existe");
        txtUser.setText(user);
        txtPass.setText(pass);
    }
    private void guardarPreferencias(){
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario = edtUser.getText().toString();
        String pass = edtPass.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user",usuario);
        editor.putString("pass",pass);

        txtUser.setText(usuario);
        txtPass.setText(pass);
        editor.commit();

    }
}

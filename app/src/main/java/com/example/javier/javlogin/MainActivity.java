package com.example.javier.javlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.bt1);
    }

    public void login(View view){

        String correo = et1.getText().toString();
        String pass = et2.getText().toString();

        if (correo.endsWith("@catedratico.gt") && pass.equals("posgrado")){
            Intent i = new Intent(this, TeacherActivity.class);
            startActivity(i);
            //Toast notification = Toast.makeText(this,"Bienvenido catedratico",Toast.LENGTH_SHORT);
            //notification.show();
        }
        else {

            Toast notification = Toast.makeText(this,"Contraseña incorrecta",Toast.LENGTH_SHORT);
            notification.show();
        }
    }

}

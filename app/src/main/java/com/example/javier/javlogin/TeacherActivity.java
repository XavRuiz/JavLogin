package com.example.javier.javlogin;

import android.content.pm.InstrumentationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {

    private EditText et3;
    private Button bt2;
    private ListView lt1;
    private List<String> list;
    private ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        et3= (EditText) findViewById(R.id.et3);
        lt1= (ListView) findViewById(R.id.lt1);
        list = new ArrayList<>();
        list.add("pepe");
        list.add("Luis");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        lt1.setAdapter(adapter);
    }

    public void action(View view){
        String nombre = et3.getText().toString();
        list.add(nombre);
        adapter.notifyDataSetChanged();
    }
}

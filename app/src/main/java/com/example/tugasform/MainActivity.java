package com.example.tugasform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
EditText etnm;
EditText etal;
EditText etem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnm = findViewById(R.id.etnm);
        etal = findViewById(R.id.etal);
        etem = findViewById(R.id.etem);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void kirimdata(View view) {
        Intent i1 = new Intent(this,OutputActivity.class);
        i1.putExtra("nama",etnm.getText().toString());
        i1.putExtra("tempatLahir",etal.getText().toString());
        i1.putExtra("tanggalLahir",etem.getText().toString());
        startActivity(i1);
    }
}
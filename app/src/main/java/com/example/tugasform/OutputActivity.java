package com.example.tugasform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    TextView tx1,tx2,tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        tx1 = findViewById(R.id.nama);
        tx2 = findViewById(R.id.tempat);
        tx3 = findViewById(R.id.tanggal);
        String nama = getIntent().getExtras().getString("nama");
        String tempat = getIntent().getExtras().getString("tempatLahir");
        String tanggal = getIntent().getExtras().getString("tanggalLahir");

        tx1.setText("Nama : "+nama);
        tx2.setText("tempat lahir : "+tempat);
        tx3.setText("Tanggal lahir : "+tanggal);

    }
}
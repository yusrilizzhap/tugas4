package com.example.yusril;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tugas4pember.R;

public class Hasil extends Activity{
    TextView txtNama, txtNPM, txtJenisKelamin, txtJabatan, txtGaji;
    String Nama, NPM, JenisKelamin, Jabatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtNama = (TextView)findViewById(R.id.txtNama);
        txtNPM = (TextView)findViewById(R.id.txtNPM);
        txtJenisKelamin = (TextView)findViewById(R.id.txtJenisKelamin);
        txtJabatan = (TextView)findViewById(R.id.txtJabatan);
        txtGaji = (TextView)findViewById(R.id.txtGaji);

        Intent i = getIntent();
        txtNama.setText(i.getExtras().getString("Nama"));
        txtNPM.setText(i.getExtras().getString("NPM"));
        txtJenisKelamin.setText(i.getExtras().getString("JenisKelamin"));
        txtJabatan.setText(i.getExtras().getString("Jabatan"));
        txtGaji.setText(i.getExtras().getString("Gaji"));
    }

}
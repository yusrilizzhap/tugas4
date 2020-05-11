package com.example.yusril;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.tugas4pember.BuildConfig;
import com.example.tugas4pember.R;

public class MainActivity extends Activity implements OnCheckedChangeListener {
    EditText edtNama, edtNPM;
    RadioGroup radioGroup1, radioGroup2;
    RadioButton radioPria, radioWanita, direktur, menejer, programer;
    Button btnCancel, btnHitung;
    String Nama, NPM, JenisKelamin, Jabatan, Gaji;
    String JK, J, G;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText)findViewById(R.id.edtNama);
        edtNPM = (EditText)findViewById(R.id.edtNPM);
        radioPria = (RadioButton)findViewById(R.id.radioPria);
        radioPria.setOnClickListener(null);
        radioWanita = (RadioButton)findViewById(R.id.radioWanita);
        radioWanita.setOnClickListener(null);
        radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(this);
        direktur = (RadioButton)findViewById(R.id.direktur);
        direktur.setOnClickListener(null);
        menejer = (RadioButton)findViewById(R.id.menejer);
        menejer.setOnClickListener(null);
        programer = (RadioButton)findViewById(R.id.programer);
        programer.setOnClickListener(null);
        radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(this);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                edtNama.setText(" ");
                edtNPM.setText(" ");
                radioGroup1.clearCheck();
                radioGroup2.clearCheck();
            }
        });

        btnHitung = (Button)findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Nama = edtNama.getText().toString();
                NPM = edtNPM.getText().toString();
                JenisKelamin = JK.toString();
                Jabatan = J.toString();
                Gaji = G.toString();

                Intent i = new Intent(getApplicationContext(), Hasil.class);
                i.putExtra("Nama", Nama);
                i.putExtra("NPM", NPM);
                i.putExtra("JenisKelamin", JenisKelamin);
                i.putExtra("Jabatan", Jabatan);
                i.putExtra("Gaji", Gaji);
                startActivity(i);
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        // TODO Auto-generated method stub
        if (radioPria.isChecked()) {
            JK = "Pria";
        }
        if (radioWanita.isChecked()) {
            JK = "Wanita";
        }
        if (direktur.isChecked()) {
            J = "Direktur";
            G = "Rp. 20.000.000";
        }
        if (menejer.isChecked()) {
            J = "Menejer";
            G = "Rp. 10.000.000";
        }
        if (programer.isChecked()) {
            J = "Programer";
            G = "Rp. 5.000.000";
        }
    }
}
package com.example.nilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtgs,edUts,edUas,edPtgs,edPUts,edPUas,edAkhir,edHuruf,edPredikat;
    private float tgs,uts,uas,akhir,pTgs=0,pUas=0,pUts=0,nAkhir;
    private String huruf,predikat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtgs=(EditText)findViewById(R.id.editnilaiTugas);
        edPtgs=(EditText)findViewById(R.id.edittigapuluh);
        edUts=(EditText)findViewById(R.id.editnilaiUTS);
        edPUts=(EditText)findViewById(R.id.edittigalima);
        edUas=(EditText)findViewById(R.id.editnilaiUAS);
        edPUas=(EditText)findViewById(R.id.edittigalimadua);
        edAkhir=(EditText)findViewById(R.id.editnilaiAkhir);
        edHuruf=(EditText)findViewById(R.id.editnilaiHuruf);
        edPredikat=(EditText)findViewById(R.id.editPredikat);

        edtgs.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(edtgs.getText().toString().isEmpty()){
                    tgs=0;
                }else{
                    tgs=Float.parseFloat(edtgs.getText().toString());
                }
                pTgs=0.3f*tgs;
                edPtgs.setText(Float.toString(pTgs));
            }
        });
        edUas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(edUas.getText().toString().isEmpty()){
                    uas=0;
                }else{
                    uas=Float.parseFloat(edtgs.getText().toString());
                }
                pUas=0.35f*uas;
                edPUas.setText(Float.toString(pUas));
            }
        });
        edUts.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(edUts.getText().toString().isEmpty()){
                    uts=0;
                }else{
                    uts=Float.parseFloat(edtgs.getText().toString());
                }
                pUts=0.35f*uts;
                edPUts.setText(Float.toString(pUts));
            }
        });
    }

    public void Hitung(View view) {
        Nilai x = new Nilai();
        nAkhir=x.getNA(pTgs,pUts,pUas);
        edAkhir.setText(Float.toString(nAkhir));
        huruf=x.getNH(nAkhir);
        edHuruf.setText(huruf);
        predikat=x.getPredikat(huruf);
        edPredikat.setText(predikat);
    }

    public void Keluar(View view) {finish();
    }
}

package com.isneverdead.profilunisbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DaftarMataKuliahSi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataMatakuliah dataMatakuliah = new DataMatakuliah();

        setContentView(R.layout.layout_kompetensi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Intent intent = getIntent();
        TextView title = findViewById(R.id.kompetensiTitle);
        Button buttonBack = findViewById(R.id.kompetensiBtnBack);

        String getKodeMatkul = intent.getStringExtra(KompetensiSi.KODEMATKUL);


        ListView listDosen = findViewById(R.id.kompetensiList);

        title.setText("Daftar Mata Kuliah");
//        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi1);
//        listDosen.setAdapter(arrayAdapter2);

        switch (getKodeMatkul) {

            case "SI1":
                ArrayAdapter<String> arrayAdapterS1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi1);
                listDosen.setAdapter(arrayAdapterS1);
                break;
            case "SI2":
                ArrayAdapter<String> arrayAdapterS2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi2);
                listDosen.setAdapter(arrayAdapterS2);
                break;
            case "SI3":
                ArrayAdapter<String> arrayAdapterS3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi3);
                listDosen.setAdapter(arrayAdapterS3);
                break;
            case "SI4":
                ArrayAdapter<String> arrayAdapterS4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi4);
                listDosen.setAdapter(arrayAdapterS4);
                break;
            case "SI5":
                ArrayAdapter<String> arrayAdapterS5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi5);
                listDosen.setAdapter(arrayAdapterS5);
                break;
            case "SI6":
                ArrayAdapter<String> arrayAdapterS6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi6);
                listDosen.setAdapter(arrayAdapterS6);
                break;
            case "SI7":
                ArrayAdapter<String> arrayAdapterS7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi7);
                listDosen.setAdapter(arrayAdapterS7);
                break;
            case "SI8":
                ArrayAdapter<String> arrayAdapterS8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulSi8);
                listDosen.setAdapter(arrayAdapterS8);
                break;


        }


        buttonBack.setText("Kembali");
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

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

public class DaftarMataKuliahMi extends AppCompatActivity {

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

        String getKodeMatkul = intent.getStringExtra(KompetensiMi.KODEMATKUL);


        ListView listDosen = findViewById(R.id.kompetensiList);

        title.setText("Daftar Mata Kuliah");
//        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi1);
//        listDosen.setAdapter(arrayAdapter2);

        switch (getKodeMatkul) {

            case "MI1":
                ArrayAdapter<String> arrayAdapterM1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi1);
                listDosen.setAdapter(arrayAdapterM1);
                break;
             case "MI2":
                 ArrayAdapter<String> arrayAdapterM2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi2);
                 listDosen.setAdapter(arrayAdapterM2);
                break;
             case "MI3":
                 ArrayAdapter<String> arrayAdapterM3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi3);
                 listDosen.setAdapter(arrayAdapterM3);
                break;
             case "MI4":
                 ArrayAdapter<String> arrayAdapterM4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi4);
                 listDosen.setAdapter(arrayAdapterM4);
                break;
             case "MI5":
                 ArrayAdapter<String> arrayAdapterM5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi5);
                 listDosen.setAdapter(arrayAdapterM5);
                break;
             case "MI6":
                 ArrayAdapter<String> arrayAdapterM6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulMi6);
                 listDosen.setAdapter(arrayAdapterM6);
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

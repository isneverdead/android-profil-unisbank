package com.isneverdead.profilunisbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DaftarMataKuliahTi extends AppCompatActivity {

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

        String getKodeMatkul = intent.getStringExtra(KompetensiTi.KODEMATKUL);


        ListView listDosen = findViewById(R.id.kompetensiList);

        title.setText("Daftar Mata Kuliah");
//        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi1);
//        listDosen.setAdapter(arrayAdapter2);

        switch (getKodeMatkul) {
            case "TI1":
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi1);
                listDosen.setAdapter(arrayAdapter);
                break;
            case "TI2":
                ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi2);
                listDosen.setAdapter(arrayAdapter2);
                break;
            case "TI3":
                ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi3);
                listDosen.setAdapter(arrayAdapter3);
                break;
            case "TI4":
                ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi4);
                listDosen.setAdapter(arrayAdapter4);
                break;
            case "TI5":
                ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi5);
                listDosen.setAdapter(arrayAdapter5);
                break;
            case "TI6":
                ArrayAdapter<String> arrayAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi6);
                listDosen.setAdapter(arrayAdapter6);
                break;
            case "TI7":
                ArrayAdapter<String> arrayAdapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi7);
                listDosen.setAdapter(arrayAdapter7);
                break;
            case "TI8":
                ArrayAdapter<String> arrayAdapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataMatakuliah.makulTi8);
                listDosen.setAdapter(arrayAdapter8);
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

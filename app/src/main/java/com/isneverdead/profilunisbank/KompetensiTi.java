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

public class KompetensiTi extends AppCompatActivity {
    public static final String KODEMATKUL = "com.isneverdead.profilunisbank.KODEMATKUL";
    public static final String SEMESTER = "com.isneverdead.profilunisbank.SEMESTER";
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_kompetensi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView title = findViewById(R.id.kompetensiTitle);
        Button buttonBack = findViewById(R.id.kompetensiBtnBack);
        title.setText("Daftar Mata Kuliah");
        ListView listDosen = findViewById(R.id.kompetensiList);
        String semesterList[] = {
                "Semester 1\n",
                "Semester 2\n" ,
                "Semester 3\n" ,
                "Semester 4\n" ,
                "Semester 5\n" ,
                "Semester 6\n" ,
                "Semester 7\n" ,
                "Semester 8\n" ,
                };
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, semesterList);
        listDosen.setAdapter(arrayAdapter);
        listDosen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent  = new Intent(view.getContext(), DaftarMataKuliahTi.class);
                intent.putExtra(SEMESTER, i+1);

                intent.putExtra(KODEMATKUL, "TI"+(i+1));
                startActivity(intent);
            }
        });
        buttonBack.setText("Kembali");
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

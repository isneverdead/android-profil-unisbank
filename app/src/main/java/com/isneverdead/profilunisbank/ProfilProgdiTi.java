package com.isneverdead.profilunisbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilProgdiTi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_progdi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TextView title = findViewById(R.id.profilProgdiTitle);
        Button buttonVisiMisi = findViewById(R.id.profilProgdiBtnVisiMisi);
        Button buttonDaftarDosen = findViewById(R.id.profilProgdiBtnDaftarDosen);
        Button buttonKompetensi = findViewById(R.id.profilProgdiBtnKompetensi);
        Button buttonBack = findViewById(R.id.profilProgdiBtnBack);
        buttonBack.setText("Kembali");
        title.setText("Progdi TI");
        buttonVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfilTi = new Intent(ProfilProgdiTi.this, VisiMisi.class);
                startActivity(keProfilTi);
            }
        });
        buttonDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keDaftarTi = new Intent(ProfilProgdiTi.this, DaftarDosenTi.class);
                startActivity(keDaftarTi);
            }
        });
        buttonKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keKompetensiTi = new Intent(ProfilProgdiTi.this, KompetensiTi.class);
                startActivity(keKompetensiTi);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

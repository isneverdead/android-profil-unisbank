package com.isneverdead.profilunisbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilProgdiSi extends AppCompatActivity {

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
        title.setText("Progdi SI");
        buttonVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfilSi = new Intent(ProfilProgdiSi.this, VisiMisi.class);
                startActivity(keProfilSi);
            }
        });
        buttonDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keDaftarSi = new Intent(ProfilProgdiSi.this, DaftarDosenSi.class);
                startActivity(keDaftarSi);
            }
        });
        buttonKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilProgdiSi.this, KompetensiSi.class);
                startActivity(intent);
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

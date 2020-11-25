package com.isneverdead.profilunisbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ProfilDosen extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_profil_dosen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();

        ImageView fotoDosen = findViewById(R.id.profilDosenFoto);
        TextView namaDosen = findViewById(R.id.profilDosenNama);
        Button btnBack = findViewById(R.id.profilDosenBtnBack);

        String getUrlDosen = intent.getStringExtra(DaftarDosenTi.URL_FOTO_DOSEN);
        String getNamaDosen = intent.getStringExtra(DaftarDosenTi.NAMA_DOSEN);

        namaDosen.setText(getNamaDosen);
        Picasso.get().load(getUrlDosen).into(fotoDosen);
        btnBack.setText("Kembali");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

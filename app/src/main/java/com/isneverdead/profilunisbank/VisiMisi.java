package com.isneverdead.profilunisbank;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class VisiMisi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_visimisi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView title = findViewById(R.id.visiMisiTitle);
        TextView contentVisi = findViewById(R.id.visiMisiContentVisi);
        TextView contentMisi = findViewById(R.id.visiMisiContentMisi);
        Button buttonBack = findViewById(R.id.visiMisiBtnBack);

        title.setText("Visi Dan Misi");
        contentVisi.setText("Pada tahun 2020 menjadi fakultas teknologi informasi yang unggul, inovatif, adaptif dalam penerapan ilmu komputer dan informatika, berjiwa kewirausahaan dan berdaya saing nasional.");
        contentMisi.setText("1. Menyelenggarakan pendidikan akademik dan profesional untuk menghasilkan lulusan yang kompetitif berdaya saing nasional, memiliki semangat terus berkembang, bermoral dan berjiwa kewirausahaan.\n" +
                "2. Mengembangkan penelitian di bidang komputer dan informatika yang terpadu, produktif dan terukur dalam rangka menunjang pengabdian kepada masyarakat.\n" +
                "3. Menyelenggarakan layanan dan kemitraan dengan pemerintahan, dunia usaha dan menjaga hubungan dengan alumni dalam rangka penyempurnaan proses pembelajaran.");

        buttonBack.setText("Kembali");
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}

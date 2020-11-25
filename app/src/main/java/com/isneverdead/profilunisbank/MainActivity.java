package com.isneverdead.profilunisbank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TextView title = findViewById(R.id.mainTitle);
        Button buttonTi = findViewById(R.id.mainBtn1);
        Button buttonSi = findViewById(R.id.mainBtn2);
        Button buttonMi = findViewById(R.id.mainBtn3);
        Button buttonAbout = findViewById(R.id.mainBtn4);
        Button buttonKeluar = findViewById(R.id.mainBtn5);
        title.setText("Profil FTI");
        buttonTi.setText("Progdi TI");
        buttonSi.setText("Progdi SI");
        buttonMi.setText("Progdi MI");
        buttonAbout.setText("About");
        buttonKeluar.setText("Keluar");
        buttonTi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfilTi = new Intent(MainActivity.this, ProfilProgdiTi.class);
                startActivity(keProfilTi);
            }
        });
        buttonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfilSi = new Intent(MainActivity.this, ProfilProgdiSi.class);
                startActivity(keProfilSi);
            }
        });
        buttonMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfilMi = new Intent(MainActivity.this, ProfilProgdiMi.class);
                startActivity(keProfilMi);
            }
        });
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
        buttonKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}
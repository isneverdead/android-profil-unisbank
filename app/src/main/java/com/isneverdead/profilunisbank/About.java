package com.isneverdead.profilunisbank;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_about);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TextView content = findViewById(R.id.aboutContent);
        Button buttonBack = findViewById(R.id.aboutBtnBack);
        ImageView foto = findViewById(R.id.aboutFoto);
        String url = "https://i.imgur.com/A3DmshF.png";

        Picasso.get().load(url).into(foto);
        content.setText("Fariz Akbar Shalahhuddin\n" +
                "(18.01.53.0058)");
        buttonBack.setText("Kembali");
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}

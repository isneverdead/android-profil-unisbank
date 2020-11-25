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

public class DaftarDosenSi extends AppCompatActivity {
    public static final String URL_FOTO_DOSEN = "com.isneverdead.profilunisbank.URL_FOTO_DOSEN";
    public static final String NAMA_DOSEN = "com.isneverdead.profilunisbank.NAMA_DOSEN";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_dosen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TextView title = findViewById(R.id.daftarDosenTiTitle);
        Button buttonBack = findViewById(R.id.daftarDosenTiBtnBack);
        title.setText("Daftar Dosen");
        ListView listDosen = findViewById(R.id.daftarDosenTiList);
        String dosenList[] = {
                "Agus Prasetyo Utomo, S.Kom, M.M, M.Kom\n" ,
                "Arief Jananto, S.Kom, M.Cs\n" ,
                "Dr. Yohanes Suhari, MMSI\n" ,
                "Dwi Agus Diartono, S.Kom., M.Kom\n" ,
                "Dwi Budi Santoso, S.Kom., M.Kom\n" ,
                "Drs. Edy Supriyanto, M.Kom\n" ,
                "Endang Lestariningsih, S.E., M.Kom\n" ,
                "Hari Murti, S.Kom., M.Cs\n" ,
                "Herny Februariyanti, S.T., M.Cs\n" ,
                "Isworo Nugroho, S.E., A.Kp, M.Kom\n" ,
                "Kristophorus Hadiono, Ph.D\n" ,
                "Muji Sukur, S.Kom, M.Cs\n" ,
                "Novita Mariana, S.Kom, M.Kom\n" ,
                "R. Soelistijadi, S.Sos, M.Kom\n" ,
                "Rara Sri Artati Rejeki, S.E., M.Kom\n" ,
                "Sugiyamta, S.Kom, M.Kom\n" ,
                "Dra. Sulastri, M.Kom\n" ,
                "Teguh Khristianto, S.Kom, M.Kom"};
        String urlFotoDosen[] = {
                "https://ti.unisbank.ac.id/files/2013/06/BUDI-HARTONO-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/ajisup-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/ERI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/EDYWIN-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/HANDOKO-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/EDDY-NUR-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/EKA-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/FATKHUL-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/FELIX-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/heribertus-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/IMAM-HUSNI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/ZULY-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/JATI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/JEFRI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/MARDI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/RINA-CHANDRA-208x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/DEWI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/IPUNG-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/SONI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/ENI-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/RINI-225x300.jpg",
                "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_640.png",
                "https://ti.unisbank.ac.id/files/2013/06/VERO-225x300.jpg",
                "https://ti.unisbank.ac.id/files/2013/06/wwn2.jpg",
                "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_640.png"

        };
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dosenList);
        listDosen.setAdapter(arrayAdapter);
        listDosen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent  = new Intent(view.getContext(), ProfilDosen.class);
                intent.putExtra(URL_FOTO_DOSEN, "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_640.png");
                intent.putExtra(NAMA_DOSEN, dosenList[i]);
                startActivity(intent);
//
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
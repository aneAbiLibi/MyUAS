package com.example.myuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class Halamanbaru extends AppCompatActivity {

    Button OK2;

    Spinner opsii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanbaru);



        OK2 = (Button) findViewById(R.id. OK2 );
        OK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {jelajahDiklik();
            }
        });
        opsii = (Spinner) findViewById(R.id.opsii);
    }

    public void jelajahDiklik() {
        String pilihan = opsii.getSelectedItem().toString();
        if(pilihan.equals("Jelajahi")) {
            Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ump.ac.id"));
            startActivity(in);
            Toast.makeText(this, "Wait...", Toast.LENGTH_SHORT).show();
        } else if (pilihan.equals("Hubungi")) {
            Intent smsan = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto : 085724126979"));
            smsan.putExtra("sms_body", "Pesan dari Aplikasi My UAS");
            startActivity(smsan);
            Toast.makeText(this, "Berhasil Mengirim Pesan", Toast.LENGTH_SHORT).show();
        }
    }
}

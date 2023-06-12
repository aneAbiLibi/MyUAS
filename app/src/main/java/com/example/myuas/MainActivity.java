package com.example.myuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login;

    TextView user;

    TextView nim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (TextView) findViewById(R.id. user);
        nim = (TextView) findViewById(R.id. nim);

        login = (Button) findViewById(R.id. login );
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {RegisDiklik();
            }
        });
    }

        public void RegisDiklik() {
            Intent Halamandua=new Intent (getApplicationContext(), Halamanbaru.class);
            startActivity(Halamandua);

        }
}
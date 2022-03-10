package com.example.praktikum1;

import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data Text View
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel txEmaail dengan componen Textview pada layout
        txEmail = findViewById((R.id.tvEmail));

        //menghubungkan variabel txPassword dengan componen Textview pada layout
        txPassword = findViewById((R.id.tvPassword));

        //mendeklarasikan variabel bundel yang akan digunakan untuk mengambil
        //pesan yang dikirim melalui method inten
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirim dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirim dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel email kedalam txPassword
        txPassword.setText(pass);

    }
}

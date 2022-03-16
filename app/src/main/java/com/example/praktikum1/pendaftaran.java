package com.example.praktikum1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class pendaftaran extends AppCompatActivity
{
    //Deklarasi variabel dengan tipe data editText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    //deklarasi variabel dengan tipe data floating action button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran);

    //membuat method untuk event dari floating button
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //membuat kondisi untuk mengecek apakah editText kosong atau tidak
            if (edtNama.getText().toString().isEmpty() ||
                    edtAlamat.getText().toString().isEmpty() ||
                    edtPassword.getText().toString().isEmpty() ||
                    edtrepass.getText().toString().isEmpty()) {
                //menmpilkan pesan notifikasi jika seluruh edit text wajib diisi
                Snackbar.make(view, "wajib isi seluruh data!!!", Snackbar.LENGTH_LONG).show();
            } else {
                //membuat kondisi untuk mengecek apakah isi dari editText password dan EditText repassword
                //sama atau tidak
                if (edtPassword.getText().toString().equals(edtrepass.getText().toString())) {
                    //menampilkan pesan notifikasi jika pendaftaran berhasil
                    Toast.makeText(getApplicationContext(), "Pendaftaran berhasil...", Toast.LENGTH_SHORT).show();

                    //method untuk kembali ke activity Main
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                } else {
                    //menampilkan pesan bahwa isi dari EditText password dan edittext repassword
                    //tidak sama
                    Snackbar.make(view, "password dan repassword harus sama!!!", Snackbar.LENGTH_LONG).show();
                }
            }
        }
    });
    };
};

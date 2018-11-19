package com.example.windows7.retrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//Deklarasi ID
        TextView txtJudul = findViewById(R.id.Title);
        TextView txtSub = findViewById(R.id.Subtext);
        TextView txtRating = findViewById(R.id.Rating);

        TextView txtSummary = findViewById(R.id.Deskripsi);
//
        Intent i = getIntent();

        String judul = i.getStringExtra("judul");
        String sub = "Release Date: "+i.getStringExtra("tanggal");
        String rating = "Rating: "+i.getStringExtra("rating");
        String summary= i.getStringExtra("deskripsi");

        txtJudul.setText(judul);
        txtSub.setText(sub);
        txtRating.setText(rating);
        txtSummary.setText(summary);
    }
}

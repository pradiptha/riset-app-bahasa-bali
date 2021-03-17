package com.example.pembelajaranbasabali;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.example.pembelajaranbasabali.kamus.KamusActivity;
import com.example.pembelajaranbasabali.kuis.KuisActivity;
import com.example.pembelajaranbasabali.materi.MateriActivity;
import com.example.pembelajaranbasabali.penerjemah.PenerjemahActivity;

public class MainActivity extends com.example.pembelajaranbasabali.BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onClickMateri(View view) {
        Intent intent =
                new Intent(MainActivity.this, MateriActivity.class);
        startActivity(intent);
    }

    public void onClickKuis(View view) {
        Intent intent =
                new Intent(MainActivity.this, KuisActivity.class);
        startActivity(intent);
    }

    public void onClickKamus(View view) {
        Intent intent =
                new Intent(MainActivity.this, KamusActivity.class);
        startActivity(intent);
    }

    public void onClickPenerjemah(View view) {
        Intent intent =
                new Intent(MainActivity.this, PenerjemahActivity.class);
        startActivity(intent);
    }


}
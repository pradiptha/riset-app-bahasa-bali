package com.example.pembelajaranbasabali;

import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

public class MateriActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
package com.example.pembelajaranbasabali.kuis;

import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

import com.example.pembelajaranbasabali.BaseActivity;
import com.example.pembelajaranbasabali.R;

public class KuisActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
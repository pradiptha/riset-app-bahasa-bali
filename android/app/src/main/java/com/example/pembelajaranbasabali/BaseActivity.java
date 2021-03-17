package com.example.pembelajaranbasabali;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pembelajaranbasabali.kamus.KamusActivity;
import com.example.pembelajaranbasabali.kuis.KuisActivity;
import com.example.pembelajaranbasabali.materi.MateriActivity;
import com.example.pembelajaranbasabali.penerjemah.PenerjemahActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_materi:
                displayToast(getString(R.string.pilih_materi));
                Intent intent1 = new Intent(BaseActivity.this, MateriActivity.class);
                startActivity(intent1);
                return true;
            case R.id.action_kuis:
                displayToast(getString(R.string.pilih_kuis));
                Intent intent2 = new Intent(BaseActivity.this, KuisActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_kamus:
                displayToast(getString(R.string.pilih_kamus));
                Intent intent3 = new Intent(BaseActivity.this, KamusActivity.class);
                startActivity(intent3);
                return true;
            case R.id.action_penerjemah:
                displayToast(getString(R.string.pilih_penerjemah));
                Intent intent4 = new Intent(BaseActivity.this, PenerjemahActivity.class);
                startActivity(intent4);
                return true;
            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }
}
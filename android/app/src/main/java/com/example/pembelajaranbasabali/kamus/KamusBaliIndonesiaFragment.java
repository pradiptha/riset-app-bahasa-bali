package com.example.pembelajaranbasabali.kamus;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pembelajaranbasabali.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class KamusBaliIndonesiaFragment extends Fragment {
    View fragmentView;
    private String kataIndonesia;
    private String krunaAndap;
    private  String krunaAso;
    private String krunaAsi;

    private boolean found;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment

        fragmentView = inflater.inflate(R.layout.fragment_kamus_bali_indonesia, container, false);

        Button btnTranslate = fragmentView.findViewById(R.id.btnTranslate2);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputKataIndonesia = fragmentView.findViewById(R.id.inputKataBali);
                String searchedWord=inputKataIndonesia.getText().toString().toLowerCase();

                TextView viewIndonesia = fragmentView.findViewById(R.id.viewIndonesia);
                TextView viewAndap2 = fragmentView.findViewById(R.id.viewAndap2);
                TextView viewAso2 = fragmentView.findViewById(R.id.viewAso2);
                TextView viewAsi2 = fragmentView.findViewById(R.id.viewAsi2);
                TextView viewMider2 = fragmentView.findViewById(R.id.viewMider2);
                TextView viewAlusMider2 = fragmentView.findViewById(R.id.viewAlusMider2);
                TextView viewAlusMadya2 = fragmentView.findViewById(R.id.viewAlusMadya2);

                kataIndonesia="NULL";
                krunaAndap="NULL";
                krunaAso="NULL";
                krunaAsi="NULL";
                found=false;
                String katakataIndonesia="";
                String katakataAndap="";
                String katakataAso="";
                String katakataAsi="";

                readKamusBasaBaliDataAndap();
                for (DataKamusBasaBali dKamus : dataKamusBaliAndap) {
                    if (found) break;
                    if (dKamus.getAndap().equals(searchedWord)) {
                        kataIndonesia=dKamus.getIndonesia();
                        krunaAndap=dKamus.getAndap();
                        krunaAso=dKamus.getAso();
                        krunaAsi=dKamus.getAsi();
                        found=true;
                    }
                }

                if (!found){
                    readKamusBasaBaliDataAso();
                    for (DataKamusBasaBali dKamus : dataKamusBaliAso) {
                        if (found) break;
                        if (dKamus.getAso().equals(searchedWord)) {
                            kataIndonesia=dKamus.getIndonesia();
                            krunaAndap=dKamus.getAndap();
                            krunaAso=dKamus.getAso();
                            krunaAsi=dKamus.getAsi();
                            found=true;
                        }
                    }
                }

                if (!found){
                    readKamusBasaBaliDataAsi();
                    for (DataKamusBasaBali dKamus : dataKamusBaliAsi) {
                        if (found) break;
                        if (dKamus.getAsi().equals(searchedWord)) {
                            kataIndonesia=dKamus.getIndonesia();
                            krunaAndap=dKamus.getAndap();
                            krunaAso=dKamus.getAso();
                            krunaAsi=dKamus.getAsi();
                            found=true;
                        }
                    }
                }

                String[] tokensIndoneia = kataIndonesia.split("_");
                if (tokensIndoneia.length>1) {
                    for (int i=0; i< (tokensIndoneia.length-1); i++){
                        katakataIndonesia=katakataIndonesia+tokensIndoneia[i]+", ";
                    }
                    katakataIndonesia=katakataIndonesia+tokensIndoneia[tokensIndoneia.length-1];
                }
                else if (tokensIndoneia.length==1){
                    katakataIndonesia=tokensIndoneia[0];
                }

                String[] tokensAndap = krunaAndap.split("_");
                if (tokensAndap.length>1) {
                    for (int i=0; i< (tokensAndap.length-1); i++){
                        katakataAndap=katakataAndap+tokensAndap[i]+", ";
                    }
                    katakataAndap=katakataAndap+tokensAndap[tokensAndap.length-1];
                }
                else if (tokensAndap.length==1){
                    katakataAndap=tokensAndap[0];
                }

                String[] tokensAso = krunaAso.split("_");
                if (tokensAso.length>1) {
                    for (int i=0; i< (tokensAso.length-1); i++){
                        katakataAso=katakataAso+tokensAso[i]+", ";
                    }
                    katakataAso=katakataAso+tokensAso[tokensAso.length-1];
                }
                else if (tokensAso.length==1){
                    katakataAso=tokensAso[0];
                }

                String[] tokensAsi = krunaAsi.split("_");
                if (tokensAsi.length>1) {
                    for (int i=0; i< (tokensAsi.length-1); i++){
                        katakataAsi=katakataAsi+tokensAsi[i]+", ";
                    }
                    katakataAsi=katakataAsi+tokensAsi[tokensAndap.length-1];
                }
                else if (tokensAsi.length==1){
                    katakataAsi=tokensAsi[0];
                }

                viewIndonesia.setText("Kata Indonesia: "+katakataIndonesia);
                viewAndap2.setText("Kruna Andap: "+katakataAndap);
                viewAso2.setText("Kruna Alus Sor: "+katakataAso);
                viewAsi2.setText("Kruna Alus Singgih: "+katakataAsi);
            }// end onClick
        });

        return fragmentView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.kamusIndonesia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(KamusBaliIndonesiaFragment.this)
                        .navigate(R.id.action_BaliIndonesiaFragment_to_IndonesiaBaliFragment_Kamus);
            }
        });

        view.findViewById(R.id.kamusBali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(KamusBaliIndonesiaFragment.this)
                        .navigate(R.id.action_RepeatBali_Kamus);
            }
        });

    }

    private List<DataKamusBasaBali> dataKamusBaliAndap = new ArrayList<>();
    private List<DataKamusBasaBali> dataKamusBaliAso = new ArrayList<>();
    private List<DataKamusBasaBali> dataKamusBaliAsi = new ArrayList<>();

    private void readKamusBasaBaliDataAndap(){
        InputStream is =  getResources().openRawResource(R.raw.kamus_bali);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );

        String line="";
        try {
            while ((line=reader.readLine()) != null){
                //Split by ","
                String[] tokens = line.split(",");

                //Read the data m
                String[] tokensAndap = tokens[1].split("_");

                for (String kAndap:tokensAndap) {
                    DataKamusBasaBali dataKamus = new DataKamusBasaBali();
                    dataKamus.setIndonesia(tokens[0].toLowerCase());
                    dataKamus.setAndap(kAndap.toLowerCase());
                    dataKamus.setAso(tokens[2].toLowerCase());
                    dataKamus.setAsi(tokens[3].toLowerCase());
                    dataKamusBaliAndap.add(dataKamus);
                    Log.d("MyActivity", "Just created "+dataKamus);
                }
            }
        }
        catch (IOException e){
            Log.wtf("MyActivity", "Error reading data file on line "+line, e);
            e.printStackTrace();
        }
    }

    private void readKamusBasaBaliDataAso(){
        InputStream is =  getResources().openRawResource(R.raw.kamus_bali);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );

        String line="";
        try {
            while ((line=reader.readLine()) != null){
                //Split by ","
                String[] tokens = line.split(",");

                //Read the data m
                String[] tokensAso = tokens[2].split("_");

                for (String kAso:tokensAso) {
                    DataKamusBasaBali dataKamus = new DataKamusBasaBali();
                    dataKamus.setIndonesia(tokens[0].toLowerCase());
                    dataKamus.setAndap(tokens[1].toLowerCase());
                    dataKamus.setAso(kAso.toLowerCase());
                    dataKamus.setAsi(tokens[3].toLowerCase());
                    dataKamusBaliAso.add(dataKamus);
                    Log.d("MyActivity", "Just created "+dataKamus);
                }
            }
        }
        catch (IOException e){
            Log.wtf("MyActivity", "Error reading data file on line "+line, e);
            e.printStackTrace();
        }
    }

    private void readKamusBasaBaliDataAsi(){
        InputStream is =  getResources().openRawResource(R.raw.kamus_bali);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );

        String line="";
        try {
            while ((line=reader.readLine()) != null){
                //Split by ","
                String[] tokens = line.split(",");

                //Read the data m
                String[] tokensAsi = tokens[3].split("_");

                for (String kAsi:tokensAsi) {
                    DataKamusBasaBali dataKamus = new DataKamusBasaBali();
                    dataKamus.setIndonesia(tokens[0].toLowerCase());
                    dataKamus.setAndap(tokens[1].toLowerCase());
                    dataKamus.setAso(tokens[2].toLowerCase());
                    dataKamus.setAsi(kAsi.toLowerCase());
                    dataKamusBaliAsi.add(dataKamus);
                    Log.d("MyActivity", "Just created "+dataKamus);
                }

            }
        }
        catch (IOException e){
            Log.wtf("MyActivity", "Error reading data file on line "+line, e);
            e.printStackTrace();
        }
    }
}
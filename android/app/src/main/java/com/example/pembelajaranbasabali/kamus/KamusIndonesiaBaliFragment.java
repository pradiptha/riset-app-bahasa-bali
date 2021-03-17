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


public class KamusIndonesiaBaliFragment extends Fragment {
    View fragmentView;
    private String krunaAndap;
    private String krunaAso;
    private String krunaAsi;

    private boolean found;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment

        fragmentView = inflater.inflate(R.layout.fragment_kamus_indonesia_bali, container, false);

        Button btnTranslate = fragmentView.findViewById(R.id.btnTranslate);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputKataIndonesia = fragmentView.findViewById(R.id.inputKataIndonesia);
                String searchedWord=inputKataIndonesia.getText().toString().toLowerCase();

                TextView viewAndap1 = fragmentView.findViewById(R.id.viewAndap1);
                TextView viewAso1 = fragmentView.findViewById(R.id.viewAso1);
                TextView viewAsi1 = fragmentView.findViewById(R.id.viewAsi1);
                TextView viewMider1 = fragmentView.findViewById(R.id.viewMider1);
                TextView viewAlusMider1 = fragmentView.findViewById(R.id.viewAlusMider1);
                TextView viewAlusMadya1 = fragmentView.findViewById(R.id.viewAlusMadya1);

                krunaAndap="NULL";
                krunaAso="NULL";
                krunaAsi="NULL";
                found=false;
                String katakataAndap="";
                String katakataAso="";
                String katakataAsi="";

                readKamusBasaBaliDataIndoneia();

                for (DataKamusBasaBali dKamus : dataKamusBali) {
                    if (found) break;
                    if (dKamus.getIndonesia().equals(searchedWord)) {
                        krunaAndap=dKamus.getAndap();
                        krunaAso=dKamus.getAso();
                        krunaAsi=dKamus.getAsi();
                        found=true;
                    }
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

                viewAndap1.setText("Kruna Andap: "+katakataAndap);
                viewAso1.setText("Kruna Alus Sor: "+katakataAso);
                viewAsi1.setText("Kruna Alus Singgih: "+katakataAsi);
            }// end onClick
        });

        return fragmentView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.kamusBali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(KamusIndonesiaBaliFragment.this)
                        .navigate(R.id.action_IndonesiaBaliFragment_to_BaliIndonesiaFragment_Kamus);
            }
        });

        view.findViewById(R.id.kamusIndonesia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(KamusIndonesiaBaliFragment.this)
                        .navigate(R.id.action_RepeatIndonesia_Kamus);
            }
        });

    }

    private List<DataKamusBasaBali> dataKamusBali = new ArrayList<>();

    private void readKamusBasaBaliDataIndoneia(){
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
                String[] tokensIndonesia = tokens[0].split("_");

                for (String kataIndonesia:tokensIndonesia) {
                    DataKamusBasaBali dataKamus = new DataKamusBasaBali();
                    dataKamus.setIndonesia(kataIndonesia.toLowerCase());
                    dataKamus.setAndap(tokens[1].toLowerCase());
                    dataKamus.setAso(tokens[2].toLowerCase());
                    dataKamus.setAsi(tokens[3].toLowerCase());
                    dataKamusBali.add(dataKamus);
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
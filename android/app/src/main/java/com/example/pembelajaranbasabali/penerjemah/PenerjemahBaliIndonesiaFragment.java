package com.example.pembelajaranbasabali.penerjemah;

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
import com.example.pembelajaranbasabali.kamus.DataKamusBasaBali;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class PenerjemahBaliIndonesiaFragment extends Fragment {

    View fragmentView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment

        fragmentView = inflater.inflate(R.layout.fragment_penerjemah_bali_indonesia, container, false);

        Button btnTranslate = fragmentView.findViewById(R.id.btnTranslatePenerjemah);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputKalimatBali = fragmentView.findViewById(R.id.inputKalimatBali);

                String[] searchedWords=inputKalimatBali.getText().toString().toLowerCase().split(" +");

                TextView viewIndonesiaP = fragmentView.findViewById(R.id.viewIndonesiaP);
                TextView viewAndapP2 = fragmentView.findViewById(R.id.viewAndapP2);
                TextView viewAsoP2 = fragmentView.findViewById(R.id.viewAsoP2);
                TextView viewAsiP2 = fragmentView.findViewById(R.id.viewAsiP2);
                // TextView viewAlusMiderP1 = fragmentView.findViewById(R.id.viewAlusMiderP1);
                //TextView viewAlusMadyaP1 = fragmentView.findViewById(R.id.viewAlusMadyaP1);

                String kalimatIndonesia = "";
                String lengkaraAndap = "";
                String lengkaraAso = "";
                String lengkaraAsi = "";

                // String tandaBaca=searchedWords[searchedWords.length-1];

                List<DataKamusBasaBali> resultWords = new ArrayList<>();

                for (int i = 0; i < searchedWords.length; i++) {

                    boolean found = false;
                    String kataIndonesia="NULL";
                    String krunaAndap = "NULL";
                    String krunaAso = "NULL";
                    String krunaAsi = "NULL";

                    readKamusBasaBaliDataAndap();
                    for (DataKamusBasaBali dKamus : dataKamusBaliAndap) {
                        if (found) break;
                        if (dKamus.getAndap().equals(searchedWords[i])) {
                            kataIndonesia = dKamus.getIndonesia();
                            krunaAndap = dKamus.getAndap();
                            krunaAso = dKamus.getAso();
                            krunaAsi = dKamus.getAsi();
                            found = true;
                        }
                    }

                    if (!found) {
                        readKamusBasaBaliDataAso();
                        for (DataKamusBasaBali dKamus : dataKamusBaliAso) {
                            if (found) break;
                            if (dKamus.getAso().equals(searchedWords[i])) {
                                kataIndonesia = dKamus.getIndonesia();
                                krunaAndap = dKamus.getAndap();
                                krunaAso = dKamus.getAso();
                                krunaAsi = dKamus.getAsi();
                                found = true;
                            }
                        }
                    }

                    if (!found) {
                        readKamusBasaBaliDataAsi();
                        for (DataKamusBasaBali dKamus : dataKamusBaliAsi) {
                            if (found) break;
                            if (dKamus.getAsi().equals(searchedWords[i])) {
                                kataIndonesia = dKamus.getIndonesia();
                                krunaAndap = dKamus.getAndap();
                                krunaAso = dKamus.getAso();
                                krunaAsi = dKamus.getAsi();
                                found = true;
                            }
                        }
                    }


                    Log.d("MyActivity", "Just translated " + searchedWords[i] + "= " + krunaAndap);

                    String[] tokensIndonesia = kataIndonesia.split("_");
                    String[] tokensAndap = krunaAndap.split("_");
                    String[] tokensAso = krunaAso.split("_");
                    String[] tokensAsi = krunaAsi.split("_");

                    DataKamusBasaBali dataWord = new DataKamusBasaBali();
                    dataWord.setIndonesia(tokensIndonesia[0]);
                    dataWord.setAndap(tokensAndap[0]);
                    dataWord.setAso(tokensAso[0]);
                    dataWord.setAsi(tokensAsi[0]);
                    resultWords.add(dataWord);

                    kalimatIndonesia = kalimatIndonesia + tokensIndonesia[0] + " ";
                    lengkaraAndap = lengkaraAndap + tokensAndap[0] + " ";
                    lengkaraAso = lengkaraAso + tokensAso[0] + " ";
                    lengkaraAsi = lengkaraAsi + tokensAsi[0] + " ";

                }


                // lengkaraAndap=lengkaraAndap+tandaBaca;
                // lengkaraAso=lengkaraAso+tandaBaca;
                //  lengkaraAsi=lengkaraAsi+tandaBaca;

                viewIndonesiaP.setText("kalimat Indonesia: \n"+kalimatIndonesia);
                viewAndapP2.setText("Lengkara Andap: \n"+lengkaraAndap);
                viewAsoP2.setText("Lengkara Alus Sor: \n"+lengkaraAso);
                viewAsiP2.setText("Lengkara Alus Singgih: \n"+lengkaraAsi);
            }// end onClick
        });

        return fragmentView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.penerjemahIndonesia2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PenerjemahBaliIndonesiaFragment.this)
                        .navigate(R.id.action_BaliIndonesiaFragment_to_IndonesiaBaliFragment_Penerjemah);
            }
        });

        view.findViewById(R.id.penerjemahBali2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PenerjemahBaliIndonesiaFragment.this)
                        .navigate(R.id.action_RepeatBali_Penerjemah);
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
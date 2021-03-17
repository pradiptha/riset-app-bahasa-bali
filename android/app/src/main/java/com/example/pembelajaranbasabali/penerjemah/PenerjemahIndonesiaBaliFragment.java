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


public class PenerjemahIndonesiaBaliFragment extends Fragment {
    View fragmentView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment

        fragmentView = inflater.inflate(R.layout.fragment_penerjemah_indonesia_bali, container, false);

        Button btnTranslate = fragmentView.findViewById(R.id.btnTranslatePenerjemah);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText inputKalimatIndonesia = fragmentView.findViewById(R.id.inputKalimatIndonesia);

                String[] searchedWords=inputKalimatIndonesia.getText().toString().toLowerCase().split(" +");


                TextView viewAndapP1 = fragmentView.findViewById(R.id.viewAndapP1);
                TextView viewAsoP1 = fragmentView.findViewById(R.id.viewAsoP1);
                TextView viewAsiP1 = fragmentView.findViewById(R.id.viewAsiP1);
               // TextView viewAlusMiderP1 = fragmentView.findViewById(R.id.viewAlusMiderP1);
                //TextView viewAlusMadyaP1 = fragmentView.findViewById(R.id.viewAlusMadyaP1);

                String lengkaraAndap="";
                String lengkaraAso="";
                String lengkaraAsi="";

               // String tandaBaca=searchedWords[searchedWords.length-1];

                readKamusBasaBaliDataIndoneia();
                List<DataKamusBasaBali> resultWords = new ArrayList<>();

                for (int i=0; i<searchedWords.length; i++) {
                    boolean found=false;
                    String krunaAndap="NULL";
                    String krunaAso="NULL";
                    String krunaAsi="NULL";

                    for (DataKamusBasaBali dKamus : dataKamusBali) {
                        if (found) break;
                        if (dKamus.getIndonesia().equals(searchedWords[i])) {
                            krunaAndap = dKamus.getAndap();
                            krunaAso = dKamus.getAso();
                            krunaAsi = dKamus.getAsi();
                            found = true;
                        }


                    }

                    Log.d("MyActivity", "Just translated "+searchedWords[i]+"= "+krunaAndap);

                    String[] tokensAndap = krunaAndap.split("_");
                    String[] tokensAso = krunaAso.split("_");
                    String[] tokensAsi = krunaAsi.split("_");

                    DataKamusBasaBali dataWord = new DataKamusBasaBali();
                    dataWord.setIndonesia(searchedWords[i]);
                    dataWord.setAndap(tokensAndap[0]);
                    dataWord.setAso(tokensAso[0]);
                    dataWord.setAsi(tokensAsi[0]);
                    resultWords.add(dataWord);

                    lengkaraAndap=lengkaraAndap+tokensAndap[0]+" ";
                    lengkaraAso=lengkaraAso+tokensAso[0]+" ";
                    lengkaraAsi=lengkaraAsi+tokensAsi[0]+" ";

                }

               // lengkaraAndap=lengkaraAndap+tandaBaca;
               // lengkaraAso=lengkaraAso+tandaBaca;
              //  lengkaraAsi=lengkaraAsi+tandaBaca;

                viewAndapP1.setText("Lengkara Andap: \n"+lengkaraAndap);
                viewAsoP1.setText("Lengkara Alus Sor: \n"+lengkaraAso);
                viewAsiP1.setText("Lengkara Alus Singgih: \n"+lengkaraAsi);
            }// end onClick
        });

        return fragmentView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.penerjemahBali1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PenerjemahIndonesiaBaliFragment.this)
                        .navigate(R.id.action_IndonesiaBaliFragment_to_BaliIndonesiaFragment_Penerjemah);
            }
        });

        view.findViewById(R.id.penerjemahIndonesia1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PenerjemahIndonesiaBaliFragment.this)
                        .navigate(R.id.action_RepeatIndonesia_Penerjemah);
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
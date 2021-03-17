package com.example.pembelajaranbasabali.kuis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pembelajaranbasabali.R;

public class EighthKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab81 = 0;
    int repeatjawab82 = 0;
    int repeatjawab83 = 0;
    int repeatjawab84 = 0;
    int repeatjawab85 = 0;
    int repeatjawab86 = 0;
    int repeatjawab87 = 0;
    int repeatjawab88 = 0;
    int repeatjawab89 = 0;
    int repeatjawab810 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_eighth_kuis, container, false);

        RadioGroup jawab81 = myView .findViewById(R.id.jawab81);
        RadioGroup jawab82 = myView .findViewById(R.id.jawab82);
        RadioGroup jawab83 = myView .findViewById(R.id.jawab83);
        RadioGroup jawab84 = myView .findViewById(R.id.jawab84);
        RadioGroup jawab85 = myView .findViewById(R.id.jawab85);
        RadioGroup jawab86 = myView .findViewById(R.id.jawab86);
        RadioGroup jawab87 = myView .findViewById(R.id.jawab87);
        RadioGroup jawab88 = myView .findViewById(R.id.jawab88);
        RadioGroup jawab89 = myView .findViewById(R.id.jawab89);
        RadioGroup jawab810 = myView .findViewById(R.id.jawab810);

        jawab81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab81) {
                repeatjawab81++;
                if (repeatjawab81==1) {
                    if (checkedjawab81 == R.id.jawab81b) trueAnswer++;
                    else if (checkedjawab81 != R.id.jawab81b) wrongAnswer++;
                }

            }
        });

        jawab82.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab82) {
                repeatjawab82++;
                if (repeatjawab82==1) {
                    if (checkedjawab82 == R.id.jawab82a) trueAnswer++;
                    else if (checkedjawab82 != R.id.jawab82a) wrongAnswer++;
                }
            }
        });

        jawab83.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab83) {
                repeatjawab83++;
                if (repeatjawab83==1) {
                    if (checkedjawab83 == R.id.jawab83c) trueAnswer++;
                    else if (checkedjawab83 != R.id.jawab83c) wrongAnswer++;
                }
            }
        });

        jawab84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab84) {
                repeatjawab84++;
                if (repeatjawab84==1) {
                    if (checkedjawab84 == R.id.jawab84d) trueAnswer++;
                    else if (checkedjawab84 != R.id.jawab84d) wrongAnswer++;
                }
            }
        });

        jawab85.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab85) {
                repeatjawab85++;
                if (repeatjawab85==1) {
                    if (checkedjawab85 == R.id.jawab85a) trueAnswer++;
                    else if (checkedjawab85 != R.id.jawab85a) wrongAnswer++;
                }
            }
        });

        jawab86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab86) {
                repeatjawab86++;
                if (repeatjawab86==1) {
                    if (checkedjawab86 == R.id.jawab86a) trueAnswer++;
                    else if (checkedjawab86 != R.id.jawab86a) wrongAnswer++;
                }
            }
        });

        jawab87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab87) {
                repeatjawab87++;
                if (repeatjawab87==1) {
                    if (checkedjawab87 == R.id.jawab87b) trueAnswer++;
                    else if (checkedjawab87 != R.id.jawab87b) wrongAnswer++;
                }
            }
        });

        jawab88.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab88) {
                repeatjawab88++;
                if (repeatjawab88==1) {
                    if (checkedjawab88 == R.id.jawab88c) trueAnswer++;
                    else if (checkedjawab88 != R.id.jawab88c) wrongAnswer++;
                }
            }
        });

        jawab89.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab89) {
                repeatjawab89++;
                if (repeatjawab89==1) {
                    if (checkedjawab89 == R.id.jawab89d) trueAnswer++;
                    else if (checkedjawab89 != R.id.jawab89d) wrongAnswer++;
                }
            }
        });

        jawab810.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab810) {
                repeatjawab810++;
                if (repeatjawab810==1) {
                    if (checkedjawab810 == R.id.jawab810a) trueAnswer++;
                    else if (checkedjawab810 != R.id.jawab810a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_eighth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri8);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_eighth_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EighthKuisFragment.this)
                        .navigate(R.id.action_EighthFragment_to_SeventhFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_eighth_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EighthKuisFragment.this)
                        .navigate(R.id.action_EighthFragment_to_StartFragment_Kuis);
            }
        });

    }
}
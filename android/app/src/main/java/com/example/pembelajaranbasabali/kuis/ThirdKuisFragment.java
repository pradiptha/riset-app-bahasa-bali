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

public class ThirdKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab31 = 0;
    int repeatjawab32 = 0;
    int repeatjawab33 = 0;
    int repeatjawab34 = 0;
    int repeatjawab35 = 0;
    int repeatjawab36 = 0;
    int repeatjawab37 = 0;
    int repeatjawab38 = 0;
    int repeatjawab39 = 0;
    int repeatjawab310 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_third_kuis, container, false);

        RadioGroup jawab31 = myView .findViewById(R.id.jawab31);
        RadioGroup jawab32 = myView .findViewById(R.id.jawab32);
        RadioGroup jawab33 = myView .findViewById(R.id.jawab33);
        RadioGroup jawab34 = myView .findViewById(R.id.jawab34);
        RadioGroup jawab35 = myView .findViewById(R.id.jawab35);
        RadioGroup jawab36 = myView .findViewById(R.id.jawab36);
        RadioGroup jawab37 = myView .findViewById(R.id.jawab37);
        RadioGroup jawab38 = myView .findViewById(R.id.jawab38);
        RadioGroup jawab39 = myView .findViewById(R.id.jawab39);
        RadioGroup jawab310 = myView .findViewById(R.id.jawab310);

        jawab31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab31) {
                repeatjawab31++;
                if (repeatjawab31==1) {
                    if (checkedjawab31 == R.id.jawab31b) trueAnswer++;
                    else if (checkedjawab31 != R.id.jawab31b) wrongAnswer++;
                }

            }
        });

        jawab32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab32) {
                repeatjawab32++;
                if (repeatjawab32==1) {
                    if (checkedjawab32 == R.id.jawab32a) trueAnswer++;
                    else if (checkedjawab32 != R.id.jawab32a) wrongAnswer++;
                }
            }
        });

        jawab33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab33) {
                repeatjawab33++;
                if (repeatjawab33==1) {
                    if (checkedjawab33 == R.id.jawab33c) trueAnswer++;
                    else if (checkedjawab33 != R.id.jawab33c) wrongAnswer++;
                }
            }
        });

        jawab34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab34) {
                repeatjawab34++;
                if (repeatjawab34==1) {
                    if (checkedjawab34 == R.id.jawab34d) trueAnswer++;
                    else if (checkedjawab34 != R.id.jawab34d) wrongAnswer++;
                }
            }
        });

        jawab35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab35) {
                repeatjawab35++;
                if (repeatjawab35==1) {
                    if (checkedjawab35 == R.id.jawab35a) trueAnswer++;
                    else if (checkedjawab35 != R.id.jawab35a) wrongAnswer++;
                }
            }
        });

        jawab36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab36) {
                repeatjawab36++;
                if (repeatjawab36==1) {
                    if (checkedjawab36 == R.id.jawab36a) trueAnswer++;
                    else if (checkedjawab36 != R.id.jawab36a) wrongAnswer++;
                }
            }
        });

        jawab37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab37) {
                repeatjawab37++;
                if (repeatjawab37==1) {
                    if (checkedjawab37 == R.id.jawab37b) trueAnswer++;
                    else if (checkedjawab37 != R.id.jawab37b) wrongAnswer++;
                }
            }
        });

        jawab38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab38) {
                repeatjawab38++;
                if (repeatjawab38==1) {
                    if (checkedjawab38 == R.id.jawab38c) trueAnswer++;
                    else if (checkedjawab38 != R.id.jawab38c) wrongAnswer++;
                }
            }
        });

        jawab39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab39) {
                repeatjawab39++;
                if (repeatjawab39==1) {
                    if (checkedjawab39 == R.id.jawab39d) trueAnswer++;
                    else if (checkedjawab39 != R.id.jawab39d) wrongAnswer++;
                }
            }
        });

        jawab310.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab310) {
                repeatjawab310++;
                if (repeatjawab310==1) {
                    if (checkedjawab310 == R.id.jawab310a) trueAnswer++;
                    else if (checkedjawab310 != R.id.jawab310a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri3);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_third1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdKuisFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_SecondFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_third2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdKuisFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FourthFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_third_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdKuisFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_StartFragment_Kuis);
            }
        });

    }
}
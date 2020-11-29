package com.example.pembelajaranbasabali;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SeventhKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab71 = 0;
    int repeatjawab72 = 0;
    int repeatjawab73 = 0;
    int repeatjawab74 = 0;
    int repeatjawab75 = 0;
    int repeatjawab76 = 0;
    int repeatjawab77 = 0;
    int repeatjawab78 = 0;
    int repeatjawab79 = 0;
    int repeatjawab710 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_seventh_kuis, container, false);

        RadioGroup jawab71 = myView .findViewById(R.id.jawab71);
        RadioGroup jawab72 = myView .findViewById(R.id.jawab72);
        RadioGroup jawab73 = myView .findViewById(R.id.jawab73);
        RadioGroup jawab74 = myView .findViewById(R.id.jawab74);
        RadioGroup jawab75 = myView .findViewById(R.id.jawab75);
        RadioGroup jawab76 = myView .findViewById(R.id.jawab76);
        RadioGroup jawab77 = myView .findViewById(R.id.jawab77);
        RadioGroup jawab78 = myView .findViewById(R.id.jawab78);
        RadioGroup jawab79 = myView .findViewById(R.id.jawab79);
        RadioGroup jawab710 = myView .findViewById(R.id.jawab710);

        jawab71.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab71) {
                repeatjawab71++;
                if (repeatjawab71==1) {
                    if (checkedjawab71 == R.id.jawab71b) trueAnswer++;
                    else if (checkedjawab71 != R.id.jawab71b) wrongAnswer++;
                }

            }
        });

        jawab72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab72) {
                repeatjawab72++;
                if (repeatjawab72==1) {
                    if (checkedjawab72 == R.id.jawab72a) trueAnswer++;
                    else if (checkedjawab72 != R.id.jawab72a) wrongAnswer++;
                }
            }
        });

        jawab73.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab73) {
                repeatjawab73++;
                if (repeatjawab73==1) {
                    if (checkedjawab73 == R.id.jawab73c) trueAnswer++;
                    else if (checkedjawab73 != R.id.jawab73c) wrongAnswer++;
                }
            }
        });

        jawab74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab74) {
                repeatjawab74++;
                if (repeatjawab74==1) {
                    if (checkedjawab74 == R.id.jawab74d) trueAnswer++;
                    else if (checkedjawab74 != R.id.jawab74d) wrongAnswer++;
                }
            }
        });

        jawab75.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab75) {
                repeatjawab75++;
                if (repeatjawab75==1) {
                    if (checkedjawab75 == R.id.jawab75a) trueAnswer++;
                    else if (checkedjawab75 != R.id.jawab75a) wrongAnswer++;
                }
            }
        });

        jawab76.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab76) {
                repeatjawab76++;
                if (repeatjawab76==1) {
                    if (checkedjawab76 == R.id.jawab76a) trueAnswer++;
                    else if (checkedjawab76 != R.id.jawab76a) wrongAnswer++;
                }
            }
        });

        jawab77.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab77) {
                repeatjawab77++;
                if (repeatjawab77==1) {
                    if (checkedjawab77 == R.id.jawab77b) trueAnswer++;
                    else if (checkedjawab77 != R.id.jawab77b) wrongAnswer++;
                }
            }
        });

        jawab78.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab78) {
                repeatjawab78++;
                if (repeatjawab78==1) {
                    if (checkedjawab78 == R.id.jawab78c) trueAnswer++;
                    else if (checkedjawab78 != R.id.jawab78c) wrongAnswer++;
                }
            }
        });

        jawab79.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab79) {
                repeatjawab79++;
                if (repeatjawab79==1) {
                    if (checkedjawab79 == R.id.jawab79d) trueAnswer++;
                    else if (checkedjawab79 != R.id.jawab79d) wrongAnswer++;
                }
            }
        });

        jawab710.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab710) {
                repeatjawab710++;
                if (repeatjawab710==1) {
                    if (checkedjawab710 == R.id.jawab710a) trueAnswer++;
                    else if (checkedjawab710 != R.id.jawab710a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_seventh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri7);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_seventh1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SeventhKuisFragment.this)
                        .navigate(R.id.action_SeventhFragment_to_SixthFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_seventh2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SeventhKuisFragment.this)
                        .navigate(R.id.action_SeventhFragment_to_EighthFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_seventh_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SeventhKuisFragment.this)
                        .navigate(R.id.action_SeventhFragment_to_StartFragment_Kuis);
            }
        });

    }
}
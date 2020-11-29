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

public class FourthKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab41 = 0;
    int repeatjawab42 = 0;
    int repeatjawab43 = 0;
    int repeatjawab44 = 0;
    int repeatjawab45 = 0;
    int repeatjawab46 = 0;
    int repeatjawab47 = 0;
    int repeatjawab48 = 0;
    int repeatjawab49 = 0;
    int repeatjawab410 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_fourth_kuis, container, false);

        RadioGroup jawab41 = myView .findViewById(R.id.jawab41);
        RadioGroup jawab42 = myView .findViewById(R.id.jawab42);
        RadioGroup jawab43 = myView .findViewById(R.id.jawab43);
        RadioGroup jawab44 = myView .findViewById(R.id.jawab44);
        RadioGroup jawab45 = myView .findViewById(R.id.jawab45);
        RadioGroup jawab46 = myView .findViewById(R.id.jawab46);
        RadioGroup jawab47 = myView .findViewById(R.id.jawab47);
        RadioGroup jawab48 = myView .findViewById(R.id.jawab48);
        RadioGroup jawab49 = myView .findViewById(R.id.jawab49);
        RadioGroup jawab410 = myView .findViewById(R.id.jawab410);

        jawab41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab41) {
                repeatjawab41++;
                if (repeatjawab41==1) {
                    if (checkedjawab41 == R.id.jawab41b) trueAnswer++;
                    else if (checkedjawab41 != R.id.jawab41b) wrongAnswer++;
                }

            }
        });

        jawab42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab42) {
                repeatjawab42++;
                if (repeatjawab42==1) {
                    if (checkedjawab42 == R.id.jawab42a) trueAnswer++;
                    else if (checkedjawab42 != R.id.jawab42a) wrongAnswer++;
                }
            }
        });

        jawab43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab43) {
                repeatjawab43++;
                if (repeatjawab43==1) {
                    if (checkedjawab43 == R.id.jawab43c) trueAnswer++;
                    else if (checkedjawab43 != R.id.jawab43c) wrongAnswer++;
                }
            }
        });

        jawab44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab44) {
                repeatjawab44++;
                if (repeatjawab44==1) {
                    if (checkedjawab44 == R.id.jawab44d) trueAnswer++;
                    else if (checkedjawab44 != R.id.jawab44d) wrongAnswer++;
                }
            }
        });

        jawab45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab45) {
                repeatjawab45++;
                if (repeatjawab45==1) {
                    if (checkedjawab45 == R.id.jawab45a) trueAnswer++;
                    else if (checkedjawab45 != R.id.jawab45a) wrongAnswer++;
                }
            }
        });

        jawab46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab46) {
                repeatjawab46++;
                if (repeatjawab46==1) {
                    if (checkedjawab46 == R.id.jawab46a) trueAnswer++;
                    else if (checkedjawab46 != R.id.jawab46a) wrongAnswer++;
                }
            }
        });

        jawab47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab47) {
                repeatjawab47++;
                if (repeatjawab47==1) {
                    if (checkedjawab47 == R.id.jawab47b) trueAnswer++;
                    else if (checkedjawab47 != R.id.jawab47b) wrongAnswer++;
                }
            }
        });

        jawab48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab48) {
                repeatjawab48++;
                if (repeatjawab48==1) {
                    if (checkedjawab48 == R.id.jawab48c) trueAnswer++;
                    else if (checkedjawab48 != R.id.jawab48c) wrongAnswer++;
                }
            }
        });

        jawab49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab49) {
                repeatjawab49++;
                if (repeatjawab49==1) {
                    if (checkedjawab49 == R.id.jawab49d) trueAnswer++;
                    else if (checkedjawab49 != R.id.jawab49d) wrongAnswer++;
                }
            }
        });

        jawab410.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab410) {
                repeatjawab410++;
                if (repeatjawab410==1) {
                    if (checkedjawab410 == R.id.jawab410a) trueAnswer++;
                    else if (checkedjawab410 != R.id.jawab410a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_fourth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri4);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_fourth1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourthKuisFragment.this)
                        .navigate(R.id.action_FourthFragment_to_ThirdFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_fourth2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourthKuisFragment.this)
                        .navigate(R.id.action_FourthFragment_to_FifthFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_fourth_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourthKuisFragment.this)
                        .navigate(R.id.action_FourthFragment_to_StartFragment_Kuis);
            }
        });

    }
}
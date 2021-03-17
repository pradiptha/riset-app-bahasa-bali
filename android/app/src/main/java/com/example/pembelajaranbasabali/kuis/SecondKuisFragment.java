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

public class SecondKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab21 = 0;
    int repeatjawab22 = 0;
    int repeatjawab23 = 0;
    int repeatjawab24 = 0;
    int repeatjawab25 = 0;
    int repeatjawab26 = 0;
    int repeatjawab27 = 0;
    int repeatjawab28 = 0;
    int repeatjawab29 = 0;
    int repeatjawab210 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_second_kuis, container, false);

        RadioGroup jawab21 = myView .findViewById(R.id.jawab21);
        RadioGroup jawab22 = myView .findViewById(R.id.jawab22);
        RadioGroup jawab23 = myView .findViewById(R.id.jawab23);
        RadioGroup jawab24 = myView .findViewById(R.id.jawab24);
        RadioGroup jawab25 = myView .findViewById(R.id.jawab25);
        RadioGroup jawab26 = myView .findViewById(R.id.jawab26);
        RadioGroup jawab27 = myView .findViewById(R.id.jawab27);
        RadioGroup jawab28 = myView .findViewById(R.id.jawab28);
        RadioGroup jawab29 = myView .findViewById(R.id.jawab29);
        RadioGroup jawab210 = myView .findViewById(R.id.jawab210);

        jawab21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab21) {
                repeatjawab21++;
                if (repeatjawab21==1) {
                    if (checkedjawab21 == R.id.jawab21b) trueAnswer++;
                    else if (checkedjawab21 != R.id.jawab21b) wrongAnswer++;
                }

            }
        });

        jawab22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab22) {
                repeatjawab22++;
                if (repeatjawab22==1) {
                    if (checkedjawab22 == R.id.jawab22a) trueAnswer++;
                    else if (checkedjawab22 != R.id.jawab22a) wrongAnswer++;
                }
            }
        });

        jawab23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab23) {
                repeatjawab23++;
                if (repeatjawab23==1) {
                    if (checkedjawab23 == R.id.jawab23c) trueAnswer++;
                    else if (checkedjawab23 != R.id.jawab23c) wrongAnswer++;
                }
            }
        });

        jawab24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab24) {
                repeatjawab24++;
                if (repeatjawab24==1) {
                    if (checkedjawab24 == R.id.jawab24d) trueAnswer++;
                    else if (checkedjawab24 != R.id.jawab24d) wrongAnswer++;
                }
            }
        });

        jawab25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab25) {
                repeatjawab25++;
                if (repeatjawab25==1) {
                    if (checkedjawab25 == R.id.jawab25a) trueAnswer++;
                    else if (checkedjawab25 != R.id.jawab25a) wrongAnswer++;
                }
            }
        });

        jawab26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab26) {
                repeatjawab26++;
                if (repeatjawab26==1) {
                    if (checkedjawab26 == R.id.jawab26a) trueAnswer++;
                    else if (checkedjawab26 != R.id.jawab26a) wrongAnswer++;
                }
            }
        });

        jawab27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab27) {
                repeatjawab27++;
                if (repeatjawab27==1) {
                    if (checkedjawab27 == R.id.jawab27b) trueAnswer++;
                    else if (checkedjawab27 != R.id.jawab27b) wrongAnswer++;
                }
            }
        });

        jawab28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab28) {
                repeatjawab28++;
                if (repeatjawab28==1) {
                    if (checkedjawab28 == R.id.jawab28c) trueAnswer++;
                    else if (checkedjawab28 != R.id.jawab28c) wrongAnswer++;
                }
            }
        });

        jawab29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab29) {
                repeatjawab29++;
                if (repeatjawab29==1) {
                    if (checkedjawab29 == R.id.jawab29d) trueAnswer++;
                    else if (checkedjawab29 != R.id.jawab29d) wrongAnswer++;
                }
            }
        });

        jawab210.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab210) {
                repeatjawab210++;
                if (repeatjawab210==1) {
                    if (checkedjawab210 == R.id.jawab210a) trueAnswer++;
                    else if (checkedjawab210 != R.id.jawab210a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri2);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondKuisFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_second2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondKuisFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ThirdFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_second_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondKuisFragment.this)
                        .navigate(R.id.action_SecondFragment_to_StartFragment_Kuis);
            }
        });

    }
}
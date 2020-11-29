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

public class FirstKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatJawab11 = 0;
    int repeatJawab12 = 0;
    int repeatJawab13 = 0;
    int repeatJawab14 = 0;
    int repeatJawab15 = 0;
    int repeatJawab16 = 0;
    int repeatJawab17 = 0;
    int repeatJawab18 = 0;
    int repeatJawab19 = 0;
    int repeatJawab110 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_first_kuis, container, false);
        RadioGroup jawab11 = myView .findViewById(R.id.jawab11);
        RadioGroup jawab12 = myView .findViewById(R.id.jawab12);
        RadioGroup jawab13 = myView .findViewById(R.id.jawab13);
        RadioGroup jawab14 = myView .findViewById(R.id.jawab14);
        RadioGroup jawab15 = myView .findViewById(R.id.jawab15);
        RadioGroup jawab16 = myView .findViewById(R.id.jawab16);
        RadioGroup jawab17 = myView .findViewById(R.id.jawab17);
        RadioGroup jawab18 = myView .findViewById(R.id.jawab18);
        RadioGroup jawab19 = myView .findViewById(R.id.jawab19);
        RadioGroup jawab110 = myView .findViewById(R.id.jawab110);

        jawab11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedJawab11) {
                repeatJawab11++;
                if (repeatJawab11==1) {
                    if (checkedJawab11 == R.id.jawab11b) trueAnswer++;
                    else if (checkedJawab11 != R.id.jawab11b) wrongAnswer++;
                }

            }
        });

        jawab12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab12) {
                repeatJawab12++;
                if (repeatJawab12==1) {
                    if (checkedJawab12 == R.id.jawab12a) trueAnswer++;
                    else if (checkedJawab12 != R.id.jawab12a) wrongAnswer++;
                }
            }
        });

        jawab13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab13) {
                repeatJawab13++;
                if (repeatJawab13==1) {
                    if (checkedJawab13 == R.id.jawab13c) trueAnswer++;
                    else if (checkedJawab13 != R.id.jawab13c) wrongAnswer++;
                }
            }
        });

        jawab14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab14) {
                repeatJawab14++;
                if (repeatJawab14==1) {
                    if (checkedJawab14 == R.id.jawab14d) trueAnswer++;
                    else if (checkedJawab14 != R.id.jawab14d) wrongAnswer++;
                }
            }
        });

        jawab15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab15) {
                repeatJawab15++;
                if (repeatJawab15==1) {
                    if (checkedJawab15 == R.id.jawab15a) trueAnswer++;
                    else if (checkedJawab15 != R.id.jawab15a) wrongAnswer++;
                }
            }
        });

        jawab16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab16) {
                repeatJawab16++;
                if (repeatJawab16==1) {
                    if (checkedJawab16 == R.id.jawab16a) trueAnswer++;
                    else if (checkedJawab16 != R.id.jawab16a) wrongAnswer++;
                }
            }
        });

        jawab17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab17) {
                repeatJawab17++;
                if (repeatJawab17==1) {
                    if (checkedJawab17 == R.id.jawab17b) trueAnswer++;
                    else if (checkedJawab17 != R.id.jawab17b) wrongAnswer++;
                }
            }
        });

        jawab18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab18) {
                repeatJawab18++;
                if (repeatJawab18==1) {
                    if (checkedJawab18 == R.id.jawab18c) trueAnswer++;
                    else if (checkedJawab18 != R.id.jawab18c) wrongAnswer++;
                }
            }
        });

        jawab19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab19) {
                repeatJawab19++;
                if (repeatJawab19==1) {
                    if (checkedJawab19 == R.id.jawab19d) trueAnswer++;
                    else if (checkedJawab19 != R.id.jawab19d) wrongAnswer++;
                }
            }
        });

        jawab110.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedJawab110) {
                repeatJawab110++;
                if (repeatJawab110==1) {
                    if (checkedJawab110 == R.id.jawab110a) trueAnswer++;
                    else if (checkedJawab110 != R.id.jawab110a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri1);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstKuisFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_first_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstKuisFragment.this)
                        .navigate(R.id.action_FirstFragment_to_StartFragment_Kuis);
            }
        });

    }
}
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

public class FifthKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab51 = 0;
    int repeatjawab52 = 0;
    int repeatjawab53 = 0;
    int repeatjawab54 = 0;
    int repeatjawab55 = 0;
    int repeatjawab56 = 0;
    int repeatjawab57 = 0;
    int repeatjawab58 = 0;
    int repeatjawab59 = 0;
    int repeatjawab510 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_fifth_kuis, container, false);

        RadioGroup jawab51 = myView .findViewById(R.id.jawab51);
        RadioGroup jawab52 = myView .findViewById(R.id.jawab52);
        RadioGroup jawab53 = myView .findViewById(R.id.jawab53);
        RadioGroup jawab54 = myView .findViewById(R.id.jawab54);
        RadioGroup jawab55 = myView .findViewById(R.id.jawab55);
        RadioGroup jawab56 = myView .findViewById(R.id.jawab56);
        RadioGroup jawab57 = myView .findViewById(R.id.jawab57);
        RadioGroup jawab58 = myView .findViewById(R.id.jawab58);
        RadioGroup jawab59 = myView .findViewById(R.id.jawab59);
        RadioGroup jawab510 = myView .findViewById(R.id.jawab510);

        jawab51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab51) {
                repeatjawab51++;
                if (repeatjawab51==1) {
                    if (checkedjawab51 == R.id.jawab51b) trueAnswer++;
                    else if (checkedjawab51 != R.id.jawab51b) wrongAnswer++;
                }

            }
        });

        jawab52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab52) {
                repeatjawab52++;
                if (repeatjawab52==1) {
                    if (checkedjawab52 == R.id.jawab52a) trueAnswer++;
                    else if (checkedjawab52 != R.id.jawab52a) wrongAnswer++;
                }
            }
        });

        jawab53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab53) {
                repeatjawab53++;
                if (repeatjawab53==1) {
                    if (checkedjawab53 == R.id.jawab53c) trueAnswer++;
                    else if (checkedjawab53 != R.id.jawab53c) wrongAnswer++;
                }
            }
        });

        jawab54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab54) {
                repeatjawab54++;
                if (repeatjawab54==1) {
                    if (checkedjawab54 == R.id.jawab54d) trueAnswer++;
                    else if (checkedjawab54 != R.id.jawab54d) wrongAnswer++;
                }
            }
        });

        jawab55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab55) {
                repeatjawab55++;
                if (repeatjawab55==1) {
                    if (checkedjawab55 == R.id.jawab55a) trueAnswer++;
                    else if (checkedjawab55 != R.id.jawab55a) wrongAnswer++;
                }
            }
        });

        jawab56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab56) {
                repeatjawab56++;
                if (repeatjawab56==1) {
                    if (checkedjawab56 == R.id.jawab56a) trueAnswer++;
                    else if (checkedjawab56 != R.id.jawab56a) wrongAnswer++;
                }
            }
        });

        jawab57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab57) {
                repeatjawab57++;
                if (repeatjawab57==1) {
                    if (checkedjawab57 == R.id.jawab57b) trueAnswer++;
                    else if (checkedjawab57 != R.id.jawab57b) wrongAnswer++;
                }
            }
        });

        jawab58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab58) {
                repeatjawab58++;
                if (repeatjawab58==1) {
                    if (checkedjawab58 == R.id.jawab58c) trueAnswer++;
                    else if (checkedjawab58 != R.id.jawab58c) wrongAnswer++;
                }
            }
        });

        jawab59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab59) {
                repeatjawab59++;
                if (repeatjawab59==1) {
                    if (checkedjawab59 == R.id.jawab59d) trueAnswer++;
                    else if (checkedjawab59 != R.id.jawab59d) wrongAnswer++;
                }
            }
        });

        jawab510.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab510) {
                repeatjawab510++;
                if (repeatjawab510==1) {
                    if (checkedjawab510 == R.id.jawab510a) trueAnswer++;
                    else if (checkedjawab510 != R.id.jawab510a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_fifth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri5);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_fifth1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FifthKuisFragment.this)
                        .navigate(R.id.action_FifthFragment_to_FourthFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_fifth2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FifthKuisFragment.this)
                        .navigate(R.id.action_FifthFragment_to_SixthFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_fifth_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FifthKuisFragment.this)
                        .navigate(R.id.action_FifthFragment_to_StartFragment_Kuis);
            }
        });

    }
}
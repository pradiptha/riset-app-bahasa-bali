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

public class SixthKuisFragment extends Fragment {

    View myView;

    int trueAnswer = 0;
    int totAnswer = 0;
    int wrongAnswer = 0;
    int repeatjawab61 = 0;
    int repeatjawab62 = 0;
    int repeatjawab63 = 0;
    int repeatjawab64 = 0;
    int repeatjawab65 = 0;
    int repeatjawab66 = 0;
    int repeatjawab67 = 0;
    int repeatjawab68 = 0;
    int repeatjawab69 = 0;
    int repeatjawab610 = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.fragment_sixth_kuis, container, false);

        RadioGroup jawab61 = myView .findViewById(R.id.jawab61);
        RadioGroup jawab62 = myView .findViewById(R.id.jawab62);
        RadioGroup jawab63 = myView .findViewById(R.id.jawab63);
        RadioGroup jawab64 = myView .findViewById(R.id.jawab64);
        RadioGroup jawab65 = myView .findViewById(R.id.jawab65);
        RadioGroup jawab66 = myView .findViewById(R.id.jawab66);
        RadioGroup jawab67 = myView .findViewById(R.id.jawab67);
        RadioGroup jawab68 = myView .findViewById(R.id.jawab68);
        RadioGroup jawab69 = myView .findViewById(R.id.jawab69);
        RadioGroup jawab610 = myView .findViewById(R.id.jawab610);

        jawab61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            public void onCheckedChanged(RadioGroup group, int checkedjawab61) {
                repeatjawab61++;
                if (repeatjawab61==1) {
                    if (checkedjawab61 == R.id.jawab61b) trueAnswer++;
                    else if (checkedjawab61 != R.id.jawab61b) wrongAnswer++;
                }

            }
        });

        jawab62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab62) {
                repeatjawab62++;
                if (repeatjawab62==1) {
                    if (checkedjawab62 == R.id.jawab62a) trueAnswer++;
                    else if (checkedjawab62 != R.id.jawab62a) wrongAnswer++;
                }
            }
        });

        jawab63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab63) {
                repeatjawab63++;
                if (repeatjawab63==1) {
                    if (checkedjawab63 == R.id.jawab63c) trueAnswer++;
                    else if (checkedjawab63 != R.id.jawab63c) wrongAnswer++;
                }
            }
        });

        jawab64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab64) {
                repeatjawab64++;
                if (repeatjawab64==1) {
                    if (checkedjawab64 == R.id.jawab64d) trueAnswer++;
                    else if (checkedjawab64 != R.id.jawab64d) wrongAnswer++;
                }
            }
        });

        jawab65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab65) {
                repeatjawab65++;
                if (repeatjawab65==1) {
                    if (checkedjawab65 == R.id.jawab65a) trueAnswer++;
                    else if (checkedjawab65 != R.id.jawab65a) wrongAnswer++;
                }
            }
        });

        jawab66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab66) {
                repeatjawab66++;
                if (repeatjawab66==1) {
                    if (checkedjawab66 == R.id.jawab66a) trueAnswer++;
                    else if (checkedjawab66 != R.id.jawab66a) wrongAnswer++;
                }
            }
        });

        jawab67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab67) {
                repeatjawab67++;
                if (repeatjawab67==1) {
                    if (checkedjawab67 == R.id.jawab67b) trueAnswer++;
                    else if (checkedjawab67 != R.id.jawab67b) wrongAnswer++;
                }
            }
        });

        jawab68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab68) {
                repeatjawab68++;
                if (repeatjawab68==1) {
                    if (checkedjawab68 == R.id.jawab68c) trueAnswer++;
                    else if (checkedjawab68 != R.id.jawab68c) wrongAnswer++;
                }
            }
        });

        jawab69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab69) {
                repeatjawab69++;
                if (repeatjawab69==1) {
                    if (checkedjawab69 == R.id.jawab69d) trueAnswer++;
                    else if (checkedjawab69 != R.id.jawab69d) wrongAnswer++;
                }
            }
        });

        jawab610.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedjawab610) {
                repeatjawab610++;
                if (repeatjawab610==1) {
                    if (checkedjawab610 == R.id.jawab610a) trueAnswer++;
                    else if (checkedjawab610 != R.id.jawab610a) wrongAnswer++;
                }
            }
        });



        myView.findViewById(R.id.submit_sixth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                totAnswer = trueAnswer + wrongAnswer;

                TextView result = myView.findViewById(R.id.viewResultMateri6);
                result.setText("HASIL KUIS ADALAH "+trueAnswer+" JAWABAN BENAR DARI TOTAL "+totAnswer+" SOAL YANG DIJAWAB.");

            }
        });

        return myView;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_sixth1_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthKuisFragment.this)
                        .navigate(R.id.action_SixthFragment_to_FifthFragment_Kuis);
            }
        });

        view.findViewById(R.id.button_sixth2_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthKuisFragment.this)
                        .navigate(R.id.action_SixthFragment_to_SeventhFragment_Kuis);
            }
        });

        view.findViewById(R.id.daftar_isi_sixth_kuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthKuisFragment.this)
                        .navigate(R.id.action_SixthFragment_to_StartFragment_Kuis);
            }
        });

    }
}
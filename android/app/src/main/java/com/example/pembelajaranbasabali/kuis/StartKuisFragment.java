package com.example.pembelajaranbasabali.kuis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pembelajaranbasabali.R;

public class StartKuisFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_start_kuis, container, false);
        return fragmentView;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.judul11ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_FirstFragment_Kuis);
            }
        });


        view.findViewById(R.id.judul12ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_SecondFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul13ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_ThirdFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul14ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_FourthFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul21ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_FifthFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul22ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_SixthFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul23ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_SeventhFragment_Kuis);
            }
        });

        view.findViewById(R.id.judul24ButtonKuis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StartKuisFragment.this)
                        .navigate(R.id.action_StartFragment_to_EighthFragment_Kuis);
            }
        });

    }
}
package com.example.pembelajaranbasabali.materi;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pembelajaranbasabali.R;

public class EighthFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment

        View fragmentView = inflater.inflate(R.layout.fragment_eighth, container, false);

        TextView tv = fragmentView.findViewById(R.id.viewContoh);
        tv.setMovementMethod((new ScrollingMovementMethod()));
        return fragmentView;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_eighth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EighthFragment.this)
                        .navigate(R.id.action_EighthFragment_to_SeventhFragment);
            }
        });

        view.findViewById(R.id.daftar_isi_eighth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(EighthFragment.this)
                        .navigate(R.id.action_EighthFragment_to_StartFragment);
            }
        });

    }
}
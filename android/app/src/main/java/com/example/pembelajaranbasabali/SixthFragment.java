package com.example.pembelajaranbasabali;

        import android.os.Bundle;
        import android.text.method.ScrollingMovementMethod;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.fragment.app.Fragment;
        import androidx.navigation.fragment.NavHostFragment;

public class SixthFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_sixth, container, false);
        TextView tv = fragmentView.findViewById(R.id.viewTingkatan);
        tv.setMovementMethod((new ScrollingMovementMethod()));
        return fragmentView;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_sixth1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthFragment.this)
                        .navigate(R.id.action_SixthFragment_to_FifthFragment);
            }
        });

        view.findViewById(R.id.button_sixth2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthFragment.this)
                        .navigate(R.id.action_SixthFragment_to_SeventhFragment);
            }
        });

        view.findViewById(R.id.daftar_isi_sixth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SixthFragment.this)
                        .navigate(R.id.action_SixthFragment_to_StartFragment);
            }
        });

    }
}
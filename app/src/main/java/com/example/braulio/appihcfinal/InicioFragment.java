package com.example.braulio.appihcfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InicioFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        Button btn = view.findViewById(R.id.increpeli);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apq =  new Intent(getActivity(),IncrePeli.class);
                //apq.putExtra("some","somedata");
                startActivity(apq);

            }
        });

        Button btn1 = view.findViewById(R.id.monjapeli);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apq =  new Intent(getActivity(),MonjaPeli.class);
                //apq.putExtra("some","somedata");
                startActivity(apq);

            }
        });

        Button btn2 = view.findViewById(R.id.radierpeli);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apq =  new Intent(getActivity(),RaiderPeli.class);
                //apq.putExtra("some","somedata");
                startActivity(apq);

            }
        });


        return view;
    }
}

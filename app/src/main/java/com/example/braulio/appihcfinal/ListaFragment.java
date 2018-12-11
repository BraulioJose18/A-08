package com.example.braulio.appihcfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_lista, container, false);
        Button btn = view.findViewById(R.id.botonanabelle);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apq =  new Intent(getActivity(),AnabellePeli.class);
                //apq.putExtra("some","somedata");
                startActivity(apq);

            }
        });

        return view;



    }
}

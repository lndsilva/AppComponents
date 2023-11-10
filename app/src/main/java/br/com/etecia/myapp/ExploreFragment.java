package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ExploreFragment extends Fragment {
    List<Explore> listaExlore;

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        recyclerView = view.findViewById(R.id.idRVExplore);

        listaExlore = new ArrayList<>();

        listaExlore.add(
                new Explore(
                        "Terra",
                        "15156",
                        "45815"
                )
        );
        listaExlore.add(
                new Explore(
                        "Marte",
                        "15156",
                        "45815"
                )
        );
        listaExlore.add(
                new Explore(
                        "Plutão",
                        "15156",
                        "45815"
                )
        );
        listaExlore.add(
                new Explore(
                        "Sol",
                        "15156",
                        "45815"
                )
        );
        listaExlore.add(
                new Explore(
                        "Lua",
                        "15156",
                        "45815"
                )
        );

        ExploreAdapter adapter = new ExploreAdapter(getContext(), listaExlore);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true));

        recyclerView.hasFixedSize();

        recyclerView.setAdapter(adapter);

        return view;
    }
}
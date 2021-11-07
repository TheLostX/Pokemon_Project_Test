package com.lost.pokemonprojecttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.lost.pokemonprojecttest.adapter.CustomAdapter;
import com.lost.pokemonprojecttest.databinding.ActivityMainBinding;
import com.lost.pokemonprojecttest.model.Pokemon;
import com.lost.pokemonprojecttest.presenter.MainPresenter;
import com.lost.pokemonprojecttest.view.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    ActivityMainBinding binding;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        presenter = new MainPresenter(this);

        setAdapter();

        setContentView(binding.getRoot());

    }

    private void setAdapter() {

        binding.rvList.setLayoutManager(new LinearLayoutManager(this));
        binding.rvList.setAdapter(new CustomAdapter(this));
    }


    @Override
    public void changeActivity(int position) {
        Intent intent = presenter.pasarBundle(new Intent(this, PokemonTrivia.class), position);
        startActivity(intent);
    }


}
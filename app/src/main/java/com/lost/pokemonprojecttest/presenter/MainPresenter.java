package com.lost.pokemonprojecttest.presenter;

import android.content.Intent;

import com.lost.pokemonprojecttest.PokemonTrivia;
import com.lost.pokemonprojecttest.model.PokemonList;
import com.lost.pokemonprojecttest.view.IMainActivity;

public class MainPresenter implements IMainPresenter{

    private IMainActivity view;
    public MainPresenter(IMainActivity view){
        this.view = view;
    }

    @Override
    public Intent pasarBundle(Intent intent, int pokeNumero) {

        intent.putExtra("pokemon", PokemonList.getPokemonList().get(pokeNumero));

        return intent;
    }
}

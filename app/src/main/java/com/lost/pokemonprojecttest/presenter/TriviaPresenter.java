package com.lost.pokemonprojecttest.presenter;

import android.content.Intent;

import com.lost.pokemonprojecttest.model.Pokemon;
import com.lost.pokemonprojecttest.model.PokemonList;
import com.lost.pokemonprojecttest.view.ITriviaView;
import java.io.Serializable;

public class TriviaPresenter implements IPresenterTrivia{

    ITriviaView view;

    public TriviaPresenter(ITriviaView view){
        this.view = view;
    }

    public void changeRes(){
        view.showImageView();
    }

    @Override
    public void checkAnswer(String pokemonType) {

        if(view.isFuegoSelected() && pokemonType.equals("fuego")){
            view.showWinMessage();
        }

        else if(view.isHierbaSelected() && pokemonType.equals("hierba")){
            view.showWinMessage();
        }

        else if(view.isAguaSelected() && pokemonType.equals("agua")){
            view.showWinMessage();
        }

        else if(view.isOtroSelected() && !pokemonType.equals("hierba") && !pokemonType.equals("fuego")
        && !pokemonType.equals("agua")){
            view.showWinMessage();
        }
        else{
            view.showLoseMessage();
        }
    }

    @Override
    public Pokemon getPoke(Intent intent) {

        Pokemon pokemon = (Pokemon) intent.getSerializableExtra("pokemon");

        return pokemon;
    }
}

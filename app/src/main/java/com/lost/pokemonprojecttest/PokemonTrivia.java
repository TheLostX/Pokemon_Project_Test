package com.lost.pokemonprojecttest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.lost.pokemonprojecttest.databinding.ActivityPokemonTriviaBinding;
import com.lost.pokemonprojecttest.presenter.TriviaPresenter;
import com.lost.pokemonprojecttest.view.ITriviaView;

public class PokemonTrivia extends AppCompatActivity implements ITriviaView{

    private ActivityPokemonTriviaBinding binding;
    private TriviaPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPokemonTriviaBinding.inflate(getLayoutInflater());
        presenter = new TriviaPresenter(this);
        presenter.changeRes();

        binding.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                presenter.checkAnswer(presenter.getPoke(getIntent()).getType());
            }
        });


        setContentView(binding.getRoot());
    }


    @Override
    public boolean isFuegoSelected() {
        return binding.rbAlt1.isChecked();
    }

    @Override
    public boolean isHierbaSelected() {
        return binding.rbAlt2.isChecked();
    }

    @Override
    public boolean isAguaSelected() {
        return binding.rbAlt3.isChecked();
    }

    @Override
    public boolean isOtroSelected() {
        return binding.rbAlt4.isChecked();
    }

    @Override
    public void showWinMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("GANASTE");
        builder.setMessage("Eres un gran conocedor");
        builder.create();
        builder.show();
    }

    @Override
    public void showLoseMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("PERDISTE :(");
        builder.setMessage("Eres patetico");
        builder.create();
        builder.show();
    }

    @Override
    public void showImageView() {
        Glide.with(this).load(presenter.getPoke(getIntent()).getImgURL()).into(binding.imageView);
    }
}
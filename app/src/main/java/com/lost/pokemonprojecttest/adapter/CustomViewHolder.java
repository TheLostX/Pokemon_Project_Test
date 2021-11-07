package com.lost.pokemonprojecttest.adapter;

import android.graphics.Color;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lost.pokemonprojecttest.databinding.ItemLayoutBinding;
import com.lost.pokemonprojecttest.model.Pokemon;


public class CustomViewHolder extends RecyclerView.ViewHolder {

    ItemLayoutBinding binding;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        binding = ItemLayoutBinding.bind(itemView);

    }

    public void bindData(Pokemon pokemon){

        binding.tvNombre.setText(pokemon.getName());
        binding.tvDescripcion.setText(pokemon.getDescription());
        Glide.with(binding.getRoot()).load(pokemon.getImgURL()).into(binding.imgPoke);

    }

    public void setBackgroundColor(String pokemonType){

        switch (pokemonType){

            case "fuego":
                binding.cardView.setCardBackgroundColor(Color.RED);
                break;

            case "hierba":
                binding.cardView.setCardBackgroundColor(Color.GREEN);
                break;

            case "volador":
                binding.cardView.setCardBackgroundColor(Color.GRAY);
                break;

            case "bicho":
                binding.cardView.setCardBackgroundColor(Color.CYAN);
                break;

            case "electrico":
                binding.cardView.setCardBackgroundColor(Color.YELLOW);
                break;

            case "agua":
                binding.cardView.setCardBackgroundColor(Color.BLUE);
                break;
        }
    }
}

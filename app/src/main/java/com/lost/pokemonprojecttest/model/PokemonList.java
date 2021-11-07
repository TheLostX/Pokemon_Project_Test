package com.lost.pokemonprojecttest.model;

import java.util.ArrayList;

public class PokemonList {

    public static ArrayList<Pokemon> getPokemonList(){

        ArrayList<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon("Charmander", "Este es un pokemon de fuego", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png", "fuego"));
        pokemonList.add(new Pokemon("Bulbasaur", "Este es un pokemon de hierba", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png", "hierba"));
        pokemonList.add(new Pokemon("Squirtle", "Este es un pokemon de agua", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png", "agua"));
        pokemonList.add(new Pokemon("Caterpie", "Este es un pokemon tipo bicho", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png", "bicho"));
        pokemonList.add(new Pokemon("Beedrill", "Este es un pokemon de bicho", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/015.png", "bicho"));
        pokemonList.add(new Pokemon("Pidgey", "Este es un pokemon de tipo normal volador", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/016.png", "volador"));
        pokemonList.add(new Pokemon("Pikachu", "Este es un pokemon electrico", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png", "electrico"));

        return pokemonList;
    }
}

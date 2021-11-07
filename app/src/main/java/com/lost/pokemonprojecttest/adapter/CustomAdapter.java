package com.lost.pokemonprojecttest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lost.pokemonprojecttest.MainActivity;
import com.lost.pokemonprojecttest.R;

import com.lost.pokemonprojecttest.model.PokemonList;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private MainActivity activity;

    public CustomAdapter(MainActivity activity){
        this.activity = activity;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.bindData(PokemonList.getPokemonList().get(position));
        holder.setBackgroundColor(PokemonList.getPokemonList().get(position).getType());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                activity.changeActivity(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return PokemonList.getPokemonList().size();
    }
}

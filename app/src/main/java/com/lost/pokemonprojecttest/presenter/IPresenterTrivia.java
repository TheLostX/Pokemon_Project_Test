package com.lost.pokemonprojecttest.presenter;

import android.content.Intent;

import java.io.Serializable;

public interface IPresenterTrivia {

    void checkAnswer(String type);
    Serializable getPoke(Intent intent);
}

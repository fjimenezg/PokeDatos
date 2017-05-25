package com.example.frank.pokedatos.api;

import com.example.frank.pokedatos.models.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by frank on 25/05/17.
 */

public interface ApiService {

    @GET("pokemon/{id}/")
    Call<Pokemon> obtenerDatosPokemon(@Path("id") int id);
}

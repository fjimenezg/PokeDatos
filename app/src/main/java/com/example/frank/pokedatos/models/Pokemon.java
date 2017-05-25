package com.example.frank.pokedatos.models;

import java.util.ArrayList;

/**
 * Created by frank on 25/05/17.
 */

public class Pokemon {

    private String name;
    private String weight;
    private String height;

    private ArrayList<Types> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public ArrayList<Types> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Types> types) {
        this.types = types;
    }
}

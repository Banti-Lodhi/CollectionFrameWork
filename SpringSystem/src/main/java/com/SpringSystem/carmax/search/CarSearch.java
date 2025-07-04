package com.SpringSystem.carmax.search;


public class CarSearch implements Searchable {
    private String modelName;

    public CarSearch(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean matches(String keyword) {
        return modelName.toLowerCase().contains(keyword.toLowerCase());
    }
}


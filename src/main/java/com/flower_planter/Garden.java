package com.flower_planter;

import com.flower_planter.converter.Converter;

public class Garden {

    private final char[][] garden;

    public Garden(String garden) {
        this.garden = Converter.gardenConvert(garden);
    }

    public char[][] getGarden() {
        return garden;
    }

    public String getStringGarden() {

        return Converter.gardenConvert(garden);

    }

}

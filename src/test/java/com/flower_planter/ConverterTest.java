package com.flower_planter;

import com.flower_planter.converter.Converter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ConverterTest {

    private final static String GARDEN =
                    "XXX\n" +
                    "XbX\n" +
                    "XXX";

    private final static char[][] GARDEN_GRID = new char[][]{
            {'X', 'X', 'X'},
            {'X', 'b', 'X'},
            {'X', 'X', 'X'},
    };


    @Test
    public void convertStringGardenToCharArray(){

        assertThat(Converter.gardenConvert(GARDEN)).isEqualTo(GARDEN_GRID);
    }


    @Test
    public void convertCharArrayGardenToString(){

        assertThat(Converter.gardenConvert(GARDEN_GRID)).isEqualTo(GARDEN);
    }
}

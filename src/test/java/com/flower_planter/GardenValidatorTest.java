package com.flower_planter;

import com.flower_planter.converter.Converter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class GardenValidatorTest {

    @Test
    public void canPlantTest(){

        String initialGarden =
                "XXXX\n" +
                "X aX\n" +
                "X bX\n" +
                "X  X\n" +
                "XXXX";

        char [][] garden = Converter.gardenConvert(initialGarden);

        assertThat(GardenValidator.canPlant(garden, 1, 1, 'a', 1)).isTrue();
        assertThat(GardenValidator.canPlant(garden, 0, 0, 'a', 1)).isFalse();
        assertThat(GardenValidator.canPlant(garden, 1, 1, 'b', 2)).isTrue();
        assertThat(GardenValidator.canPlant(garden, 2, 1, 'a', 2)).isTrue();
        assertThat(GardenValidator.canPlant(garden, 3, 1, 'b', 2)).isTrue();
        assertThat(GardenValidator.canPlant(garden, 10, 10, 'b', 2)).isFalse();
    }
}

package com.flower_planter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FlowerStockTest {

    private static final String flowers = "a,2,1\n" +
                                          "b,1,2";

    private FlowerStock flowerStock;

    @BeforeEach
    public void initEach(){
        flowerStock = new FlowerStock(flowers);
    }

    @Test
    public void shouldNotRemoveFlowerFromStockTest(){

       assertThat(flowerStock.getFlowerFromStock()).isEqualTo(new FlowerStock.Flower('b', 2));
       assertThat(flowerStock.getFlowerFromStock()).isEqualTo(new FlowerStock.Flower('b', 2));
    }

    @Test
    public void shouldRemoveFlowerFromStockTest(){

        assertThat(flowerStock.getAndRemoveFlowerFromStock()).isEqualTo(new FlowerStock.Flower('b', 2));
        assertThat(flowerStock.getFlowerFromStock()).isEqualTo(new FlowerStock.Flower('a', 1));
    }

    @Test
    public void shouldReturnFlowerToStockTest(){

        assertThat(flowerStock.getAndRemoveFlowerFromStock()).isEqualTo(new FlowerStock.Flower('b', 2));
        flowerStock.returnFlowerToStock(new FlowerStock.Flower('b', 2));
        assertThat(flowerStock.getFlowerFromStock()).isEqualTo(new FlowerStock.Flower('b', 2));
    }
}

package com.flower_planter;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GardenerTest {

    @ParameterizedTest(name = "Test: {0}")
    @MethodSource("provideTestArgumentsAndExceptedSolution")
    public void runAllTests(String name, String flowers, String initialGarden, String expectedGarden) {

        Garden garden = new Garden(initialGarden);
        FlowerStock flowerStock = new FlowerStock(flowers);

        Gardener.plantFlowers(garden, flowerStock);

        AssertionsForClassTypes.assertThat(expectedGarden).isEqualTo(garden.getStringGarden());

    }

    private static Stream<Arguments> provideTestArgumentsAndExceptedSolution() {
        return Stream.of(
                Arguments.of(
                                "simple 4by4",

                                "a,2,1\n" +
                                "b,2,2",

                                "XXXX\n" +
                                "X  X\n" +
                                "X  X\n" +
                                "XXXX",

                                "XXXX\n" +
                                "XbaX\n" +
                                "XabX\n" +
                                "XXXX"
                ),

                Arguments.of(
                               "example",

                               "a,3,1\n" +
                                "b,2,2\n" +
                                "c,2,2\n" +
                                "d,2,5",

                                "XXXXXXXXXX\n" +
                                "X      XXX\n" +
                                "X X   XXXX\n" +
                                "X     XXXX\n" +
                                "X     XX X\n" +
                                "XXXXXXXXXX\n",

                                "XXXXXXXXXX\n" +
                                "XdcbcbdXXX\n" +
                                "XaXaa XXXX\n" +
                                "X     XXXX\n" +
                                "X     XX X\n" +
                                "XXXXXXXXXX"
                ),

                Arguments.of(
                                "test1",

                                "a,2,1\n" +
                                "i,1,1",

                                "XXXXXX\n" +
                                "X    X\n" +
                                "XXXXXX",

                                "XXXXXX\n" +
                                "Xiaa X\n" +
                                "XXXXXX"
                ),

                Arguments.of(
                                "test2",

                                "i,3,2\n" +
                                "a,5,1",

                                "XXXXXXXXXX\n" +
                                "X        X\n" +
                                "XXXXXX   X\n" +
                                "XXXXXXXXXX",


                                "XXXXXXXXXX\n" +
                                "Xaaaaai iX\n" +
                                "XXXXXX i X\n" +
                                "XXXXXXXXXX"
                ),

                Arguments.of(
                                "test3",

                                "i,12,2\n" +
                                "c,44,1\n" +
                                "d,9,4\n" +
                                "w,12,1",

                                "XXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                "X              XXXXXXXXXXX\n" +
                                "XXXXXX          XXXXXXXXXX\n" +
                                "XXXXXX           XXXXXXXXX\n" +
                                "XXXXXX                   X\n" +
                                "XXXXXX                   X\n" +
                                "XXXXXX      XXXXX        X\n" +
                                "XXXXXXXXXXXXXXXXXXXXXXXXXX",


                                "XXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                                "XwwwwwwwwwwwwdcXXXXXXXXXXX\n" +
                                "XXXXXXdcccdcccccXXXXXXXXXX\n" +
                                "XXXXXXcccccccccdcXXXXXXXXX\n" +
                                "XXXXXXccdcccdcccccdcccdccX\n" +
                                "XXXXXXcccccccccci i i i iX\n" +
                                "XXXXXXdi i iXXXXXi i i i X\n" +
                                "XXXXXXXXXXXXXXXXXXXXXXXXXX"
                ),

                Arguments.of(
                               "test4",

                                "a,3,1\n" +
                                "b,2,2\n" +
                                "c,2,2\n" +
                                "d,2,5",

                                "XXXXXXXXXX\n" +
                                "X      XXX\n" +
                                "X X   XXXX\n" +
                                "X     XXXX\n" +
                                "X     XX X\n" +
                                "XXXXXXXXXX",


                                "XXXXXXXXXX\n" +
                                "XdcbcbdXXX\n" +
                                "XaXaa XXXX\n" +
                                "X     XXXX\n" +
                                "X     XX X\n" +
                                "XXXXXXXXXX"
                )
        );
    }
}



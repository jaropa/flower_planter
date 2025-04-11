package com.flower_planter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Run {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("There should be only two arguments. First one, the file path to the garden file, the second file path to flowers file.");
            return;
        }

        String gardenStr = new String(Files.readAllBytes(Paths.get(args[0]))).replace("\r", "");
        String flowersStr = new String(Files.readAllBytes(Paths.get(args[1]))).replace("\r", "");

        Garden garden = new Garden(gardenStr);
        FlowerStock flowerStock = new FlowerStock(flowersStr);

        Gardener.plantFlowers(garden, flowerStock);

        System.out.println(garden.getStringGarden());
    }
}

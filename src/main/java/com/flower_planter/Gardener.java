package com.flower_planter;

final class Gardener {

    static boolean plantFlowers(Garden garden, FlowerStock flowerStock) {

        for (int x = 0; x < garden.getGarden().length; x++) {
            for (int y = 0; y < garden.getGarden()[0].length; y++) {

                if (flowerStock.allFlowersPlanted()) {
                    return true;
                }

                FlowerStock.Flower flower = flowerStock.getFlowerFromStock();

                if (GardenValidator.canPlant(garden.getGarden(), x, y, flower.getType(), flower.getDistance())) {
                    garden.getGarden()[x][y] = flower.getType();
                    flowerStock.getAndRemoveFlowerFromStock();
                    boolean success = plantFlowers(garden, flowerStock);
                    if (success) {
                        return true;
                    } else {
                        garden.getGarden()[x][y] = Constants.SPACE;
                        flowerStock.returnFlowerToStock(flower);
                    }
                }
            }
        }
        return false;
    }

    private Gardener() {
    }
}

package com.flower_planter;

final class GardenValidator {

    static boolean canPlant(char[][] garden, int x, int y, char flowerType, int distance) {

        if(x >= garden.length || y >= garden[0].length){
            return false;
        }

        if(garden[x][y] != Constants.SPACE ){
            return false;
        }

        for (int i = Math.max(x - distance, 0); i < Math.min(x + distance, garden.length); i++) {
            for (int j = Math.max(y - distance, 0); j < Math.min(y + distance, garden[0].length); j++) {
                if(garden[i][j] == flowerType){
                    int currentDistance = Math.abs(x - i) + Math.abs(y - j);
                    if(currentDistance < distance) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private GardenValidator(){

    }
}

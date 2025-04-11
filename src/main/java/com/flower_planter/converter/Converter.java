package com.flower_planter.converter;

public final class Converter {

    public static char[][] gardenConvert(String garden) {
        String[] rows = garden.split("\n");
        char[][] gardenChar = new char[rows.length][rows[0].length()];
        for (int x = 0; x < rows.length; x++) {
            for (int y = 0; y < rows[0].length(); y++) {
                gardenChar[x][y] = rows[x].charAt(y);
            }
        }
        return gardenChar;
    }

    public static String gardenConvert(char[][] garden) {

        StringBuilder gardenStr = new StringBuilder();
        for (char[] row : garden) {
            for (char element : row) {
                gardenStr.append(element);
            }
            gardenStr.append("\n");
        }
        return gardenStr.substring(0, gardenStr.length() - 1);
    }

    private Converter() {
    }

}



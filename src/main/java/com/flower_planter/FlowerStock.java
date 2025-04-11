package com.flower_planter;

import java.util.Objects;
import java.util.Stack;

class FlowerStock {

    private final Stack<Flower> flowers = new Stack<>();

    public static class Flower {

        private final char type;
        private final Integer distance;

        Flower(char type, Integer distance) {
            this.type = type;
            this.distance = distance;
        }

        char getType() {
            return type;
        }

        Integer getDistance() {
            return distance;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Flower flower = (Flower) o;
            return type == flower.type &&
                    Objects.equals(distance, flower.distance);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, distance);
        }
    }

    FlowerStock(String flowers) {

        String[] rows = flowers.split("\n");
        for (String row : rows) {
            add(row);
        }
    }

    private void add(String flowerTypeRow) {
        String[] spec = flowerTypeRow.split(",");
        for (int i = 0; i < Integer.parseInt(spec[1]); i++) {
            flowers.push(new Flower(spec[0].charAt(0), Integer.parseInt(spec[2])));
        }
    }

    Flower getFlowerFromStock() {
        return flowers.peek();
    }

    Flower getAndRemoveFlowerFromStock() {
        return flowers.pop();
    }

    void returnFlowerToStock(Flower flower) {
        flowers.push(flower);
    }

    boolean allFlowersPlanted() {
        return flowers.empty();
    }
}



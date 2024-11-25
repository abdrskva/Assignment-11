package com.example.assignment11;

import java.util.Random;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube() {
        this.side = 1 + new Random().nextDouble() * 9; // Random side length between 1 and 10
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube [Side=%.2f]", side);
    }
}

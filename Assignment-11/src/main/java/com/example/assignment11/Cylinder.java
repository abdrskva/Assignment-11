package com.example.assignment11;

import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder() {
        Random random = new Random();
        this.radius = 1 + random.nextDouble() * 9; // Random radius between 1 and 10
        this.height = 5 + random.nextDouble() * 15; // Random height between 5 and 20
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [Radius=%.2f, Height=%.2f]", radius, height);
    }
}


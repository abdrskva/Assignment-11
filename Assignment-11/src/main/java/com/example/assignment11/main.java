package com.example.assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();
        Random random = new Random();

        // Generate 10 random shapes
        for (int i = 0; i < 10; i++) {
            int choice = random.nextInt(3); // Randomly choose a shape type: 0 (Sphere), 1 (Cylinder), 2 (Cube)
            switch (choice) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());
            }
        }

        // Output the details of each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println("-----------------------");
        }
    }
}

package com.driver;

public class Main {

    // Task 1: Create Product class inside Main class
    static class Product {

        // Task 3: Method to calculate the product of two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method to calculate the product of three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method to calculate the product of two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product class
        Product p = new Product();

        // Task 3: Call the method product(int, int)
        int result1 = p.product(2, 3);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call the method product(int, int, int)
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call the method product(double, double)
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + result3);
    }
}

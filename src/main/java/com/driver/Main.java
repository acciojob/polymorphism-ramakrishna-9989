package com.driver;

public class Main {
    static class Product {
        public int product(int x, int y) {return 0;}
        public int product(int x, int y, int z) {return 0;}
        public double product(double x, double y) {return 0.0;}
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.product(2,3);
        p.product(2,3,5);
        p.product(2.5,7.2);

    }
}
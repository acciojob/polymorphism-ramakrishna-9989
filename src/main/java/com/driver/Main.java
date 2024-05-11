package com.driver;
//final ans
public class Main {
    public static class Product {
        public int product(int x, int y) {
            int pro = x * y;
            return pro;
        }

        public int product(int x, int y, int z) {
            int pro = x * y * z;
            return pro;
        }

        public double product(double x, double y) {
            double pro = x * y;
            return pro;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(2, 2));
        System.out.println(p.product(2, 2, 2));
        System.out.println(p.product(2.0, 2.0));
    }
}
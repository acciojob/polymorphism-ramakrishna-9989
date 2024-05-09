Assignment to understand polymorphism.

STEPS:

/*
 * Task 1:
 * create a class Product inside Main class
 *
 * Task 2:
 * create object of Product in Main function called p
 *
 * Task 3:
 * create a method of following defination
 * public int product(int x, int y) {}
 *
 * call this method from Main using Product class object p
 *
 * Task 4:
 * create a Overloaded method product of following defination
 * public int product(int x, int y, int z) {}
 *
 * call this method also from Main using Product class object p
 *
 * Task 5:
 * create a Overloaded method product of following defination
 * public double product(double x, double y) {}
 *
 * call this method also from Main using Product class object p
 *
 * Observations:
 * This class contains 3 classes with same name, but it complie & run successfully
 *
 */


 import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
 static  class Product{
       public int product(int x, int y) {return x+y;}
       public int product(int x, int y, int z) {return x+y+z;}
       public double product(double x, double y) {return x+y;}
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Product p=new Product();
        System.out.println(p.product(5,6));
        System.out.println(p.product(5,6,7));
       System.out.println(p.product(5,6.7));
	}
}

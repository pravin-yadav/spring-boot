package com.pravin.SpringProject.Polymorphism;

/**
 * Method overloading increases the readability of the program.
 *
 * <p>There are two ways to overload the method in java
 *
 * <p>1. By changing number of arguments 2. By changing the data type
 *
 * <p>we made it static so that we don't have to create an instance of the class
 */

/** By changing the number of arguments */
public class OverloadingExample {
  public static int add(int a, int b) {
    return a + b;
  }

  //
  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  /** By changing the data type */
  public static int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public static double add(double a, double b, double c, double d, double e) {
    return a + b + c + d + e;
  }
}

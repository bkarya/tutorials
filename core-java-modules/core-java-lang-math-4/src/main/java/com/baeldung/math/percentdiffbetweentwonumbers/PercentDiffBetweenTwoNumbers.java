package com.baeldung.math.percentdiffbetweentwonumbers;

public class PercentDiffBetweenTwoNumbers {
  public static double calculatePercentageDifference(double v1, double V2) {
    double average = (v1 + V2) / 2;
    if (average == 0) {
      throw new IllegalArgumentException("The average of V1 and V2 cannot be zero.");
    }
    return Math.abs((v1 - V2) / average) * 100;
  }
}

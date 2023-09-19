package com.trybe.java.regraprogressao;

import java.util.Map;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    ActivitiesRegister.register();
    int[] weightings = ActivitiesRegister.activitiesWeights;
    int[] grades = ActivitiesRegister.activitiesGrades;
    System.out.println(evaluateResults(weightings, grades));
  }

  static String evaluateResults(int[] weightings, int[] grades) {
    int dividend = 0;
    int divisor = 0;
    for (int i = 0; i < weightings.length; i++) {
      dividend += (weightings[i] * grades[i]);
      divisor += weightings[i];
    }
    int result = dividend / divisor;
    if (result >= 85) {
      return "Parabéns! Você alcançou"
          + result + ".0%"
          + "! E temos o prazer de informar que você obteve aprovação!";
    } else {
      return "Lamentamos informar que, com base na sua pontuação alcançada neste período,"
          + result + ".0%"
          + ", você não atingiu a pontuação mínima necessária para sua aprovação.";
    }
  }
}
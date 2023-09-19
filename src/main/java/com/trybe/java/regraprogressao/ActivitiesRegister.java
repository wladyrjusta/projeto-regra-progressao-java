package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class ActivitiesRegister {

  public static String[] activitiesNames;
  public static int[] activitiesWeights;
  public static int[] activitiesGrades;

  /**
   * Este método permite ao usuário cadastrar atividades avaliativas para o período atual. Cada
   * atividade deve ter um nome descritivo e um peso atribuído a ela. O método solicitará a
   * quantidade de atividades a serem cadastradas e, em seguida, coletará os nomes, pesos
   * e notas de cada atividade.
   */
  public static void register() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int totalActivities = Integer.parseInt(scanner.nextLine());
    activitiesNames = new String[totalActivities];
    activitiesWeights = new int[totalActivities];
    activitiesGrades = new  int[totalActivities];
    int remainingWeighting = 100;
    for (int i = 0; i < totalActivities; i++) {
      if (remainingWeighting <= 100 && remainingWeighting > 0) {
        System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
        String activityName = scanner.nextLine();
        System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
        int activityWeighting = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a nota obtida para " + activityName + ": ");
        int activityGrade = Integer.parseInt(scanner.nextLine());
        activitiesNames[i] = activityName;
        activitiesWeights[i] = activityWeighting;
        activitiesGrades[i] = activityGrade;
        remainingWeighting -= activityWeighting;
      } else {
        System.out.println("Peso de todas as atividades devem ter somatória máxima igual a 100.\n"
            + "Realize o cadastro novamente.");
        activitiesNames[i - 1] = null;
        activitiesWeights[i - 1] = 0;
        activitiesGrades[i - 1] = 0;
      }
    }
    if (remainingWeighting > 0) {
      System.out.println("Peso de todas as atividades devem ter somatória máxima igual a 100.\n"
          + "Realize o cadastro novamente.");
      for (int i = 0; i < activitiesNames.length; i++) {
        activitiesNames[i] = null;
        activitiesWeights[i] = 0;
        activitiesGrades[i] = 0;
      }
    }
    scanner.close();
  }
}

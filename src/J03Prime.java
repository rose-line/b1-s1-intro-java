/*
Les commerciaux reçoivent un salaire de base de 400 € par semaine. Ceux qui font au moins 10 ventes sur la semaine ont une prime de 250 €.
Écrire un programme qui demande à l’utilisateur le nombre de ventes qu’il a conclues cette semaine et qui affiche son salaire total (salaire de base + prime éventuelle).
*/

import java.util.Scanner;

public class J03Prime {

  public static void main(String[] args) {

    // 1. Initialisation des variables

    int salaire = 400;
    int prime = 250;
    int quota = 10;

    // 2. Récupérer le nombre de ventes

    Scanner clavier = new Scanner(System.in);
    System.out.print("Combien de ventes avez-vous conclues cette semaine ? ");
    int nbVentes = clavier.nextInt();
    clavier.close();

    // 3. Ajouter éventuellement la prime

    // On teste si le nombre de ventes est suffisant
    if (nbVentes >= quota) {
      salaire = salaire + prime; // cette ligne n'est exécutée que si la condition est vraie
    }

    // 4. Afficher le résultat

    // Concaténation directement dans le println
    System.out.println("Votre salaire est de : " + salaire + " €");
  }
}
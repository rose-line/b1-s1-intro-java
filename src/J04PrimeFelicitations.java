/*
Reprise de l'exercice précédent, mais les commerciaux reçoivent un message de félicitations s'ils ont rempli le quota de 10 ventes minimum sur la semaine ; sinon, ils sont informés du nombre de ventes qu'il manquait pour atteindre le quota.
*/

import java.util.Scanner;

public class J04PrimeFelicitations {

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

    // 3. Si le quota est atteint, ajouter la prime et féliciter le commercial ;
    // sinon, indiquer le nombre de ventes manquantes

    // On teste si le nombre de ventes est suffisant
    if (nbVentes >= quota) {
      salaire = salaire + prime;
      // On félicite le commercial
      System.out.println("Félicitations ! Vous avez atteint le quota de ventes.");
    } else {
      // Sinon, on calcule et on affiche le nombre de ventes manquantes
      int ventesManquantes = quota - nbVentes;
      System.out.println("Il vous manquait " + ventesManquantes + " vente(s) pour atteindre le quota.");
    }

    // 4. Afficher le résultat

    // Concaténation directement dans le println
    System.out.println("Votre salaire est de : " + salaire + " €");
  }
}
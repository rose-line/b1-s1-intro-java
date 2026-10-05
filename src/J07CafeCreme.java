/*
  Écrire un programme qui annonce si on n’a pas assez, juste assez, ou plus qu’il ne faut pour se payer un café-crème à 1 € :

  - demande combien on a de « pièces jaunes » de chaque type (1, 5, 10, 20, 50)
  - affichage en fonction du total calculé (3 types de messages possibles) :
    - "Il vous manque 25 cents pour prendre un café."
    - "Vous avez exactement de quoi vous payer le café !"
    - "Il vous restera 15 cents après avoir pris votre café !"
*/

import java.util.Scanner;

public class J07CafeCreme {

  public static void main(String[] args) {

    // 1. Message de bienvenue

    System.out.println(
        "Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :\n");

    // 2. Récupération des entrées (nombre de pièces de chaque type)

    Scanner clavier = new Scanner(System.in);
    System.out.print("pièces de 1 cent ? ");
    int nb1Cent = clavier.nextInt();
    System.out.print("pièces de 5 cents ? ");
    int nb5Cents = clavier.nextInt();
    System.out.print("pièces de 10 cents ? ");
    int nb10Cents = clavier.nextInt();
    System.out.print("pièces de 20 cents ? ");
    int nb20Cents = clavier.nextInt();
    System.out.print("pièces de 50 cents ? ");
    int nb50Cents = clavier.nextInt();
    clavier.close();

    // 3. Calcul de l'argent total

    // On compte en centimes, ça permet de travailler avec des entiers uniquement
    // On n'oublie pas de multiplier chaque nombre par la valeur correspondante
    int total = nb1Cent * 1 + nb5Cents * 5 + nb10Cents * 10 + nb20Cents * 20 + nb50Cents * 50;

    // 4. Vérification du total et affichage du résultat

    int unEuro = 100; // pour éviter le "nombre magique"
    if (total < unEuro) {
      int manque = unEuro - total;
      System.out.println("Il vous manque " + manque + " cents pour prendre un café.");
    } else if (total > unEuro) {
      int enTrop = total - unEuro;
      System.out.println("Il vous restera " + enTrop + " cents après avoir pris votre café !");
    } else {
      System.out.println("Vous avez exactement de quoi vous payer le café !");
    }
  }
}

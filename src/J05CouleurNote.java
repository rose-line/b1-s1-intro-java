/*
 Afficher la couleur correspondante à un élève en fonction de la note d'une évaluation

- "rouge" entre 0 et 5
- "jaune" entre 6 et 10
- "vert" entre 11 et 15
- "vert+" entre 16 et 20

*/

import java.util.Scanner;

public class J05CouleurNote {

  public static void main(String[] args) {

    // 1. Récupérer la note de l'élève

    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre note sur 20 : ");
    int note = clavier.nextInt();
    clavier.close();

    // 2. Déterminer la couleur correspondante à la note

    // On déclare une variable intermédiaire qui va retenir la couleur
    String couleur;
    // Test : dans quelle fenêtre sommes-nous ?
    if (note < 6) { // 0-5
      couleur = "rouge";
    } else if (note < 11) { // 6-10
      couleur = "jaune";
    } else if (note < 16) { // 11-15
      couleur = "vert";
    } else { // 16-20
      couleur = "vert+";
    }

    // La variable "couleur" est maintenant correctement initialisée
    System.out.println("Votre couleur : " + couleur);
  }
}
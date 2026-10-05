/*
  Même exercice que précédemment, mais cette fois-ci on va utiliser une boucle do-while pour valider l'entrée.

  Cela se justifie car l'opération de "demander le nombre d'heures travaillées" doit être faite au moins une fois.
*/

import java.util.Scanner;

public class J09ValidationEntreeDoWhile {

  public static void main(String[] args) {

    // 1. Initialisation des variables

    int tauxHoraire = 15;
    int heuresMax = 42;
    int heuresTravaillees;
    Scanner clavier = new Scanner(System.in);

    // 2. Récupérer le nombre d'heures travaillées

    do {
      System.out
          .print("Combien d'heures travaillées cette semaine (entre 0 et " + heuresMax + ") ? ");
      heuresTravaillees = clavier.nextInt();
    } while (heuresTravaillees < 0 || heuresTravaillees > heuresMax);
    clavier.close();

    // 3. Calcul du salaire brut

    int salaireBrut = tauxHoraire * heuresTravaillees;

    // 4. Affichage

    System.out.println("Salaire brut : " + salaireBrut + " €");
  }
}

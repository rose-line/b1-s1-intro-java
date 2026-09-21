/*
Écrire un programme qui calcule le salaire brut d’un employé à partir du nombre d’heures travaillées et du taux horaire.
*/

import java.util.Scanner;

public class J01CalculSalaireBrut {
  public static void main(String[] args) throws Exception {
    System.out.println("Calcul de salaire brut");

    // 1. Récupérer le nombre d’heures travaillées

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez le nombre d'heures travaillées : ");
    int heuresTravaillees = clavier.nextInt(); // nextInt attend une entrée au clavier

    // 2. Récupérer le taux horaire - 'double' car peut contenir des décimales

    System.out.print("Entrez le taux horaire : ");
    double tauxHoraire = clavier.nextDouble();

    // On "ferme" la ressource clavier (bonne pratique)
    clavier.close();

    // 3. Calculer le salaire brut à partir des entrées récupérees

    // On multiplier le nombre d’heures par le taux horaire
    double salaireBrut = heuresTravaillees * tauxHoraire; // résultat récupéré dans une variable

    // 4. Afficher le résultat

    // Utilisation de la concaténation pour "coller" texte et valeur de la variable
    System.out.println("Le salaire brut est de : " + salaireBrut);
  }
}

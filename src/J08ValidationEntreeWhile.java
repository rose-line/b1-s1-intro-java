/*
  Un employé gagne 15 € de l’heure. Demander le nombre d’heures travaillées dans la semaine et afficher son salaire. La valeur entrée doit être entre 0 et 42 (redemander autant de fois que nécessaire).

  La boucle while va nous permettre de répéter l'opération "demander le nombre d'heures travaillées" tant que l'entrée est invalide.
*/

import java.util.Scanner;

public class J08ValidationEntreeWhile {

  public static void main(String[] args) {

    // 1. Initialisation des variables

    int tauxHoraire = 15;
    int heuresMax = 42;

    // 2. Récupérer le nombre d'heures travaillées

    System.out.print("Combien d'heures travaillées cette semaine ? ");
    Scanner clavier = new Scanner(System.in);
    int heuresTravaillees = clavier.nextInt();

    // 3. Validation de l'entrée

    // On continue de demander TANT QUE l'entrée est invalide
    // On pourrait aussi indiquer l'inverse d'une entrée valide avec ! :
    // while (!(heuresTravaillees >= 0 && heuresTravaillees <= heuresMax)) {
    while (heuresTravaillees < 0 || heuresTravaillees > heuresMax) {
      System.out
          .print("Nombre d'heures invalide. Entrez un nombre entre 0 et " + heuresMax + ": ");
      heuresTravaillees = clavier.nextInt();
    }
    clavier.close();

    // 4. Calcul du salaire brut

    // À ce stade, on est sûr que l'entrée est valide
    // (0 <= heuresTravaillees <= 42)
    // Donc on peut faire le traitement sans risque
    int salaireBrut = tauxHoraire * heuresTravaillees;

    // 5. Affichage

    System.out.println("Salaire brut : " + salaireBrut + " €");
  }
}

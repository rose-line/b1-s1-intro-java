/*
  Pour obtenir un prêt, on doit gagner plus de 30000 € par an et travailler depuis au moins deux ans.
*/

import java.util.Scanner;

public class J06AccordDePret {

  public static void main(String[] args) {

    // 1. Récupérer le salaire annuel
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre salaire annuel : ");
    int salaire = clavier.nextInt();

    // 2. Récupérer le nombre d'années d'emploi
    System.out.print("Entrez le nombre d'années d'emploi : ");
    int anneesEmploi = clavier.nextInt();
    clavier.close();

    // 3. Vérifier si le prêt est accepté ou refusé

    // La condition du IF contient deux choses à évaluer
    // Les deux doivent être vraies pour que la condition soit vraie
    // Il faut donc un ET (&& en Java)
    if (salaire > 30000 && anneesEmploi >= 2) {
      System.out.println("Le prêt est accepté.");
    } else {
      System.out.println("Le prêt est refusé.");
    }
  }
}

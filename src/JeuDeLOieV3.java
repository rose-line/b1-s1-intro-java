import java.util.Random;

public class JeuDeLOieV3 {
  public static void main(String[] args) {
    int caseObjectif = 20;
    Random generateur = new Random();
    int caseCourante = 0;
    int compteurLancers = 0;
    boolean gagne = false;

    // Le booléen 'gagne' permet de savoir si on a gagné ou pas
    // On continue de lancer le dé TANT QUE 'gagne' est faux
    while (!gagne) {
      // Lancer le dé
      int lancer = generateur.nextInt(6) + 1;
      compteurLancers++;
      // Avancer le pion
      caseCourante = caseCourante + lancer;
      // Si on dépasse, on "rebondit"
      if (caseCourante > caseObjectif) {
        int depassement = caseCourante - caseObjectif;
        caseCourante = caseObjectif - depassement;
      }
      System.out.print(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d.",
          compteurLancers, lancer, caseCourante));
      // On n'affiche le nombre de cases restantes que si on n'a pas gagné
      if (caseCourante == caseObjectif) {
        System.out.println("Vous avez gagné !");
        System.out.println("Il aura fallu " + compteurLancers + " lancers de dé pour gagner.");
        // On n'oublie pas de mettre 'gagne' à true pour sortir de la boucle
        gagne = true;
      } else {
        System.out.println("Il vous reste " + (caseObjectif - caseCourante) + " cases.");
      }
    }
  }
}

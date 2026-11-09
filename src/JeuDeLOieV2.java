import java.util.Random;

public class JeuDeLOieV2 {
  public static void main(String[] args) {
    int caseObjectif = 20;
    int nbLancers = 5;
    Random generateur = new Random();

    boolean gagne = false;
    int compteurSimulations = 0;

    while (!gagne) {
      compteurSimulations++;
      int caseCourante = 0;
      for (int i = 1; i <= nbLancers; i++) {
        int lancer = generateur.nextInt(6) + 1;
        caseCourante = caseCourante + lancer;
        System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d.",
            i, lancer, caseCourante));
      }

      if (caseCourante == caseObjectif) {
        System.out.println("Vous avez gagné !");
        System.out.println("Il aura fallu " + compteurSimulations + " simulations pour gagner.");
        gagne = true;
      } else if (caseCourante > caseObjectif) {
        System.out.println("Vous dépassez, vous avez perdu !");
      } else {
        System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
      }
    }
  }
}

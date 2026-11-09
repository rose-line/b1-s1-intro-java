import java.util.Random;

public class JeuDeLOieV1 {
  public static void main(String[] args) {
    int caseObjectif = 20;
    int caseCourante = 0; // la case "départ" est la case 0
    int nbLancers = 5;
    Random generateur = new Random();

    System.out.println("Bienvenue ! Commençons...");

    for (int i = 1; i <= nbLancers; i++) {
      int lancer = generateur.nextInt(6) + 1;
      caseCourante = caseCourante + lancer;
      System.out.println(String.format("Lancer %d : vous avez fait %d. Vous êtes sur la case %d.", i,
          lancer, caseCourante));
    }

    // Dans cette solution, lors d'une partie perdante,
    // on indique au joueur s'il a dépassé ou s'il en manque
    if (caseCourante == caseObjectif) {
      System.out.println("Vous avez gagné !");
    } else if (caseCourante > caseObjectif) {
      System.out.print("Vous dépassez, vous avez perdu !");
    } else {
      System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
    }
  }
}

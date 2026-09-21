/*
- Écrire un programme qui permet d’afficher la phrase suivante une fois que l’utilisateur a entré des valeurs pour un *premier nom commun*, un *nombre*, un *deuxième nom commun* et un *adjectif* :

```text
Il était une fois un NOM1 qui avait NOMBRE NOM2. Cela le rendait très ADJECTIF.
```

- Bien sûr, les mots ici en majuscules seront remplacés par les entrées utilisateur
- Le programme doit indiquer clairement ce que l’utilisateur est censé faire : ça s’appelle avoir une bonne *expérience utilisateur* (UX)
- Pour récupérer des strings en entrée au clavier, on utilisera la méthode `next()` du `Scanner` (plutôt que `nextInt()` ou `nextDouble()`)
*/

import java.util.Scanner;

public class J02TexteATrous {
  public static void main(String[] args) throws Exception {
    System.out.println("Texte à trous");

    // 1. Récupérer les entrées utilisateur

    Scanner clavier = new Scanner(System.in);

    System.out.print("Entrez un nom commun : ");
    String nomCommun1 = clavier.next();
    System.out.print("Entrez un nombre : ");
    int nombre = clavier.nextInt();
    System.out.print("Entrez un deuxième nom commun : ");
    String nomCommun2 = clavier.next();
    System.out.print("Entrez un adjectif : ");
    String adjectif = clavier.next();

    clavier.close();

    // 2. Construire le texte à trous complété
    // (on peut aussi le faire directement dans le println)

    String texteAAfficher = "Il était une fois un " + nomCommun1 + " qui avait " + nombre + " " + nomCommun2
        + ". Cela le rendait très " + adjectif + ".";

    // 3. Afficher le texte à trous complété

    System.out.println(texteAAfficher);
  }
}

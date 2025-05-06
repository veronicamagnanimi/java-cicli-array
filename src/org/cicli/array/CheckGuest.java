package org.cicli.array;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // array + ciclo dove stampo ogni elemento
        String[] friends = { "Luca", "Valentina", "Sara", "Francesca", "Chiara", "Claudia" };

        // chiedo all'utente il nome e chiudo l'input
        System.out.println("Come ti chiami?");
        String userName = input.nextLine();
        input.close();

        // controllo se c'è nell'array
        boolean isPresent = false;
        String friendName = "";
        for (int i = 0; i < friends.length; i++) {
            String curItem = friends[i].toLowerCase();
            if (curItem.equals(userName.toLowerCase())) {
                isPresent = true;
                friendName = friends[i];
                break; // esco dal ciclo trovata la corrispondenza
            }
        }

        // stampo il risultato 
        if (isPresent) {
            System.out.println("Ciao " + friendName + ", sei nella lista!");
        } else {
            System.out.println("Non sei stato invitato");
        }
    }
}

package org.generation.italy;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        // Lista dei buoni propositi
        ArrayList<String> propositi = new ArrayList<>();
        propositi.add("Fare più attività fisica");
        propositi.add("Esercitarsi sulla OOP");
        propositi.add("Leggere più libri");
        propositi.add("Mangiare più sano");
        propositi.add("Risparmiare denaro");

        // Scanner per leggere l'input dell'utente
        Scanner sc = new Scanner(System.in);

        do {
            // Visualizza l'elenco dei propositi
            System.out.println("Ecco i tuoi buoni propositi:");
            for (int i = 0; i < propositi.size(); i++) {
                System.out.println("("+(i + 1) + ") " + propositi.get(i));
            }

            // Chiede all'utente quale proposito ha conseguito
            System.out.println("Inserisci il numero del proposito che hai conseguito:");
            int scelta = sc.nextInt();
            sc.nextLine();

            // Controlla se l'indice è valido
            if (scelta > 0 && scelta <= propositi.size()) {
                // Rimuove il proposito dalla lista
                propositi.remove(scelta-1);
                System.out.println("Ben fatto! Proposito conseguito rimosso dalla lista.");
            } else {
                System.out.println("Numero non valido. Riprova.");
            }
        }while (!propositi.isEmpty());

        // Tutti i propositi sono stati conseguiti
        System.out.println("Complimenti! Hai conseguito tutti i tuoi buoni propositi.");
        sc.close();
	}

}

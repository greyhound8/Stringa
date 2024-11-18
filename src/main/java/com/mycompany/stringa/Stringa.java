/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringa;

/**
 *
 * @author asocc
 */
import java.util.Scanner;

public class Stringa {
    //crea una variabile privata chiamata scrittura 
    private String scrittura;
    // Metodo getter per la variabile scrittura
    public String getScrittura() {
      //fa ritornare la variabile scrittura allo stato iniziale
        return scrittura;
    }
 
// Metodo che legge una parola dall'input dell'utente
   public void Lettore() {
       // Metodo che legge una parola dall'input dell'utente
        Scanner lettore = new Scanner(System.in);
        // Chiede all'utente di scrivere una parola
        System.out.print("Scrivi una parola: ");
        //visualizza la risposta dell'utente
        System.out.println("Hai scritto: ");
        //la memorizza nella variabile scrittura
        scrittura = lettore.nextLine();
    }
   }

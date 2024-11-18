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
    private String scrittura;
    public String getScrittura() {
        return scrittura;
    }
 

   public void Lettore() {
        Scanner lettore = new Scanner(System.in);
        System.out.print("Scrivi una parola: ");
        String parola = lettore.nextLine();
        System.out.println("Hai scritto: " + parola);
    }
   }
   

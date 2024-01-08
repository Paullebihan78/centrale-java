package org.centrale.cli;

import org.centrale.domain.Ciseaux;
import org.centrale.domain.Feuille;
import org.centrale.domain.Hand;
import org.centrale.domain.Pierre;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("welcome to the app");

        Scanner sc = new Scanner(System.in);

        Hand hand1;
        Hand hand2;

        System.out.println("Veuillez saisir votre choix (1, 2 ou 3) ");
        int choix1 = sc.nextInt();
        Random random = new Random();
        int choix2;
        choix2 = random.nextInt(3) + 1;

        if (choix1 == 1) {
            hand1 = new Pierre();
        } else if (choix1 == 2) {
            hand1 = new Feuille();
        } else {
            hand1 = new Ciseaux();
        }

        if (choix2 == 1) {
            hand2 = new Pierre();
        } else if (choix2 == 2) {
            hand2 = new Feuille();
        } else {
            hand2 = new Ciseaux();
        }

        int resultat = hand2.playWith(hand1);

        System.out.println(resultat);

    }

}

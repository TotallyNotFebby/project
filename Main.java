package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seznam seznam = new Seznam();
        boolean pokracovat = true;
        String volba;

        do {
            seznam.uvodniZprava();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Pridat noveho pojistneho");
            System.out.println("2 - Vypsat vsechny pojistene");
            System.out.println("3 - Vyhledat pojisteneho");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();


            switch (volba) {
                case "1":
                    seznam.pridejPojisteneho();
                    break;
                case "2":
                    seznam.vypisVsechny();
                    break;
                case "3":
                    seznam.vyhledejPojisteneho();
                    break;
                case "4":
                    pokracovat = false;
                    System.out.println("Pokračujte libovolnou klávesou...");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        } while (pokracovat);
    }
}

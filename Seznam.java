package Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Seznam {

    Scanner scanner = new Scanner(System.in);
    List<Pojisteny> pojistenec = new ArrayList<>();

    //přidá nového pojištěného a zařadí ho do arraylistu
    public void pridejPojisteneho() {
        Pojisteny pojisteny = new Pojisteny();
        System.out.println("Zadejte jmeno: ");
        pojisteny.jmeno = scanner.nextLine();
        System.out.println("Zadejte prijmeni: ");
        pojisteny.prijmeni = scanner.nextLine();
        System.out.println("Zadejte vek: ");
        pojisteny.vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonni cislo: ");
        pojisteny.telefonniCislo = Integer.parseInt(scanner.next());

        pojistenec.add(pojisteny);
        System.out.println();
        System.out.println("Data byla ulozena.");
        System.out.println();
        scanner.nextLine();
    }

    //vypíše všechny pojištěné v databázi
    public void vypisVsechny() {
        for (int j = 0; j < pojistenec.size(); j++) {
                System.out.println(pojistenec.get(j));
        }
        System.out.println();
    }

    //vypíše všechny nalezené pojištěné na základě zadaného jména a příjmení
    public void vyhledejPojisteneho() {
        System.out.println("Zadej jmeno: ");
        String zadaneJmeno=scanner.nextLine();
        System.out.println("Zadej prijmeni: ");
        String zadanePrijmeni=scanner.nextLine();
        int nalezeno = 0;
        for (int k = 0; k < pojistenec.size(); k++) {
            if (pojistenec.get(k).getJmeno().equals(zadaneJmeno) && pojistenec.get(k).getPrijmeni().equals(zadanePrijmeni)) {
                System.out.println(pojistenec.get(k));
                nalezeno++;
            }
        }
        if (nalezeno == 0) System.out.println("Neni evidovan zadny pojistenec pod timto jmenem!");
    }

    //vypíše úvodní zprávu
    public void uvodniZprava() {
        System.out.println("------------------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("------------------------------");
    }
}

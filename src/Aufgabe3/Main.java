package Aufgabe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Auto audi = new Auto((short) 4, "blau", (short) 300, (short) 5, false, (short) 4);
        Auto bmw = new Auto((short) 4, "gelb", (short) 50, (short) 3, false, (short) 8);
        Auto audi2 = new Auto((short) 4, "orange", (short) 70, (short) 5, false, (short) 4);
        Auto audi3 = new Auto((short) 4, "rot", (short) 250, (short) 5, false, (short) 8);
        Auto audi4 = new Auto((short) 4, "schwarz", (short) 30, (short) 5, false, (short) 4);

        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);

        for (Auto ausgabe : liste) {
            System.out.println(ausgabe.getPs());
        }
    }
}


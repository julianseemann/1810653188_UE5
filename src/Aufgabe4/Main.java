package Aufgabe4;

import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Geben sie etwas ein");
        String b = JOptionPane.showInputDialog("Geben sie etwas ein");
        String c = JOptionPane.showInputDialog("Geben sie etwas ein");


        if (a.equals(b)) //mit .equals vergleicht man Strings (nicht mit ==)
        {
            System.out.println("Inhalt 1 und Inhalt 2 sind identisch");
        }

        else if (a.equals(c))
        {
            System.out.println("Inhalt 1 und Inhalt 3 sind identisch");
        }

        else if (b.equals(c))
        {
            System.out.println("Inhalt 2 und Inhalt 3 sind identisch");
        }

        else
        {
            System.out.println("Alle Inhalte sind unterschiedlich");
        }
    }
}

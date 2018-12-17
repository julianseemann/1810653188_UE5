package Aufgabe2;

public class Aufruf
{
    public static void main(String[] args)
    {
        Mensch a = new Mensch ("Julian", "Seemann", 18);
        a.Status();

        Student b = new Student ("Julian", "Seemann", 18, 1810653188, "Web Business & Technology");
        b.Status();

    }
}

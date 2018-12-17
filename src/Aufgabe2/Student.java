package Aufgabe2;

public class Student extends Mensch
{
    //attribute
    private int matrikelnummer;
    private String studiengang;

    //erweitern des konstruktors
    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang)
    {
       super(vorname, nachname, alter);
       this.matrikelnummer=matrikelnummer;
       this.studiengang=studiengang;
    }

    //überschreiben der Status Methode
    @Override
    public void Status()
    {
        System.out.println("Es handelt sich um einen Student, der " + getVorname() + " " + getNachname() + " heißt und " + getAlter() + " Jahre alt ist. " +
                "Er studiert " + getStudienggang() + " und hat die Matrikelnummer: " + getMatrikelnummer());
    }

    //getter setter
    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }
    public void setMartrikelnummer(int martrikelnummer)
    {
        this.matrikelnummer = martrikelnummer;
    }

    public String getStudienggang()
    {
        return studiengang;
    }
    public void setStudienggang(String studienggang)
    {
        this.studiengang = studienggang;
    }
}


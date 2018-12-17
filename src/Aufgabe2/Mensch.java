package Aufgabe2;

public class Mensch
{
    //attribute
    private String vorname;
    private String nachname;
    private int alter;

    //konstruktor
    public Mensch(String vorname, String nachname, int alter)
    {
        this.vorname=vorname;
        this.nachname=nachname;
        this.alter=alter;
    }

    //methode
    public void Status()
    {
        System.out.println( "Es handelt sich um einen Menschen, der " + getVorname() + " " + getNachname() + " heißt und " + getAlter() + " Jahre alt ist");
    }

    //getter setter
    public String getVorname()
    {
        return vorname;
    }
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public String getNachname()
    {
        return nachname;
    }
    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public int getAlter()
    {
        return alter;
    }
    public void setAlter(int alter)
    {
        this.alter = alter;
    }
}

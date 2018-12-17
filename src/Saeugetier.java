public abstract class Saeugetier //mit abstract lassen sich keine Objekte erzeugen, es können Methoden ohne Rumpf erstellt werden
{
    private String name;
    private int alter;
    private String geschlecht;


    //Konstruktor
    public Saeugetier(String name, int alter, String geschlecht)
    {
        this.name=name; //this greift auf das Attribut zu
        this.alter=alter;
        this.geschlecht=geschlecht;
    }


    public abstract String printAll(); //abstrakte Methode,die nicht implementiert werden kann


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public String getGeschlecht()
    {
        return geschlecht;
    }
    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
}

public class Mensch extends Saeugetier
{
    public Mensch(String name, int alter, String geschlecht)
    {
        super(name, alter, geschlecht);
    }

    @Override //überschreibt abstrakte Klasse
    public String printAll()
    {
        return String.format (getName() + "#" + getAlter() + "#" + getGeschlecht() + "#");
    }
    //.format gibt eine formatierte Zeichenfolge wieder

}

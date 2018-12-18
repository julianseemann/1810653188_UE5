package Aufgabe3;

public class Auto extends Fahrzeug implements Comparable<Auto>
{
    public Auto(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit)
    {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
    }

        @Override
        public int compareTo(Auto m)
        {
            if (m.getPs() > this.getPs())
            {
                return +1;
            }
            else if (m.getPs() < this.getPs())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
}
package JavaBuch.OOPUebunge.Aufgabe0813;

public class Fahrzeug
{
    private String name;
    private int anzahlReifen;
    private Reifen reifenArt;
    private boolean faehrt;

    public Fahrzeug(String name, int anzahlReifen, Reifen druck)
    {
        this.name = name;
        this.anzahlReifen = anzahlReifen;
        this.reifenArt = druck;
        this.faehrt = false;
    }

    public void fahreLos()
    {
        this.faehrt = true;
    }

    public void halteAn()
    {
        this.faehrt = false;
    }

    @Override
    public String toString()
    {
        return "Fahrzeug{" + "name='" + name + '\'' + ", anzahlReifen=" + anzahlReifen +
                ", reifenArt=" + reifenArt.aktuellerDruck() + ", faehrt=" + faehrt + '}';
    }
}

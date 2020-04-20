package dhbw.freiheit.Kapitel08.Studenten;

public class Student
{
    private String geschlecht;
    private String name;
    private int nummer;
    private int fach;


    public static final int MATHEMATIK = 1;
    public static final int INFORMATIK = 2;
    public static final int ARCHITEKTUR = 3;
    public static final int WIRTSCHAFT = 4;
    public static final int BIOLOGIE = 5;
    public static final int GESCHICHTE = 6;
    public static final int GERMANISTIK = 7;
    public static final int POLITIK = 8;
    public static final int PHYSIK = 9;

    public int getFach()
    {
        return fach;
    }

    public void setFach(int fach)
    {
        this.fach = fach;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int n)
    {
        int alteNummer = this.nummer;
        this.nummer = n;

        if (!validateNummer())
        {
            nummer = alteNummer;
        }

    }

    public boolean validateNummer()
    {
        if(!(this.nummer >= 100000 &&  this.nummer <= 999999))
        {
            System.out.println("Zahl ist zu klein oder zu groß");
        }
        if(this.nummer % 2 == 0)
        {
            System.out.println("Zahl ist gerade");
        }
        return (this.nummer >= 100000 && this.nummer <= 999999 && this.nummer % 2 != 0);
    }

    public Student(String name, int nummer)
    {
        setName(name);
        setNummer(nummer);
    }
    public void print()
    {
        System.out.println(this.name);
        System.out.println(this.nummer);
    }
}

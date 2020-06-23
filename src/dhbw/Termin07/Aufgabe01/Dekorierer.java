package dhbw.Termin07.Aufgabe01;

import java.io.*;

public class Dekorierer extends BufferedReader
{
    File file = new File("/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe01/text.txt");

    /**
     * Creates a buffering character-input stream that uses a default-sized
     * input buffer.
     *
     * @param in A Reader
     */
    public Dekorierer(Reader in)
    {
        super(in);
    }

    public static void leseTextDatei(File file) throws IOException
    {
        try(Dekorierer reader = new Dekorierer(new FileReader(file)))
        {
            String zeile;
            while((zeile = reader.readLine()) != null)
            {
                System.out.println(zeile);
            }
        }
    }


    public String readLine() throws IOException
    {
        return super.readLine().toLowerCase();
    }

    public static void main(String[] args) throws IOException
    {
        File file = new File("/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe01/text.txt");
        System.out.println(file.exists());

        leseTextDatei(file);
    }
}

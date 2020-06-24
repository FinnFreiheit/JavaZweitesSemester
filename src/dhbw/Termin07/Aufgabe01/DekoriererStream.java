package dhbw.Termin07.Aufgabe01;

import java.io.*;

public class DekoriererStream extends FilterInputStream
{
    File file = new File("/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe01/text.txt");

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected DekoriererStream(InputStream in)
    {
        super(in);
    }

    /**
     * Reads the next byte of data from this input stream. The value
     * byte is returned as an {@code int} in the range
     * {@code 0} to {@code 255}. If no byte is available
     * because the end of the stream has been reached, the value
     * {@code -1} is returned. This method blocks until input data
     * is available, the end of the stream is detected, or an exception
     * is thrown.
     * <p>
     * This method
     * simply performs {@code in.read()} and returns the result.
     *
     * @return the next byte of data, or {@code -1} if the end of the
     * stream is reached.
     * @throws IOException if an I/O error occurs.
     * @see FilterInputStream#in
     */
    @Override
    public int read() throws IOException
    {
        int i = 0;
        i =  super.read();

        if (i >= 65 && i <= 90)
        {
            return i + 32;
        }
        else return i;
    }


    public static void leseTextDateiStream(File file) throws IOException
    {
        try(DekoriererStream readerStream = new DekoriererStream(new FileInputStream(file)))
        {

            int buchstabe = 0;
            while((buchstabe = readerStream.read()) != -1)
            {
                System.out.print((char)buchstabe);
            }
        }
    }




    public static void main(String[] args) throws IOException
    {
        File file = new File("/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe01/text.txt");
        //System.out.println(file.exists());

        leseTextDateiStream(file);
    }
}


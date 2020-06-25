package dhbw.Termin07.Aufgabe03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader in;
    private String verzeichnis;

    private int port;



    public Server(int port, String verzeichnis)
    {
        this.port = port;
        this.verzeichnis = verzeichnis;
    }

    public void start() throws IOException
    {
        serverSocket = new ServerSocket(this.port);
        clientSocket = serverSocket.accept();
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String gesamt =  in.readLine();
        String[] split = gesamt.split("0");

        createFileAndWrite(split);
        System.out.println(split.length);



    }



/*    //todo Funktioniert außer Zeilenumbruch !!
    public void schreibeFile(String file,String text) throws IOException
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(text);
        }
    }*/

    public void createFileAndWrite(String[] strings) throws IOException
    {
       try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.verzeichnis + strings[0])))
       {
           for(int i = 1 ; i < strings.length; i++)
           {
               writer.write(strings[i]);
               writer.write("\n");
           }
       }

    }

    public void stop() throws IOException
    {
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws IOException
    {
        Server server = new Server(6666,"/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe03/Datei/");
        server.start();
    }
}

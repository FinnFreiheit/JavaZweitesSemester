package dhbw.Termin07.Aufgabe03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client
{
    private int port;
    private File verzeichnis = new File("/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe03/Client.txt");
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private String hostname;
    private String dateiName;


    public Client(int port, String hostname, String dateiName)
    {
        this.port = port;
        this.hostname = hostname;
        if (dateiNameZulaessig(dateiName))
        {
            this.dateiName = dateiName;
        }
        else
        {
            System.out.println("Dateiname nicht zulässig");
            System.exit(-1);
        }
    }

    public void startConnection() throws IOException
    {
        if (portZulaessig(this.port))
        {
            clientSocket = new Socket(this.hostname, this.port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        else
        {
            System.out.println("unzulässiger Port");
        }
    }


    public void sendMessage(String msg) throws IOException
    {
        out.println(msg);
        //String resp = in.readLine();
        //return resp;
    }


    public String leseDateiUndSpeicherInhalt() throws IOException
    {
        String fileName = "/Users/Finn/IdeaProjects/JavaZweitesSemester/src/dhbw/Termin07/Aufgabe03/" + this.dateiName;

        File file = new File(fileName);
        StringBuilder inhalt = new StringBuilder();
        inhalt.append(this.dateiName);
        inhalt.append(0);
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String zeile;
            while((zeile = reader.readLine()) != null)
            {
                inhalt.append(zeile);
                inhalt.append(0);
            }
        }
        return inhalt.toString();
    }

    public void stopConnection() throws IOException
    {
        in.close();
        out.close();
        clientSocket.close();

    }

    public boolean portZulaessig(int port)
    {
        return port > 1024 && port < 65535;
    }


    public String getdateiName()
    {
        return this.dateiName;
    }

    public boolean dateiNameZulaessig(String dateiName)
    {
        return (dateiName.getBytes().length < 255);
    }

    public static void main(String[] args) throws IOException
    {
        Client client = new Client(6666,"localhost","Client.txt");
        client.startConnection();
        //System.out.println(client.sendMessage("hello server"));
        client.sendMessage(client.leseDateiUndSpeicherInhalt());
        //client.leseDateiUndSpeicherInhalt();
    }
}

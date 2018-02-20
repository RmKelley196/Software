import java.io.*;
import java.net.*;

public class Recieve 
{

    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(4444);
        System.out.println("Server Up");
        Socket s = ss.accept();
        System.out.println("Client Connected");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while(true)
        {
        	int i = 0;
        	String message = dis.readUTF();
            System.out.println("Recieved message: " + message);
            dos.writeUTF("Receive Confirmed" + i);
            i++;
        }
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main (String[] args){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Waiting for the client");
            Socket server = ss.accept();
            System.out.println("The server is connected");

            BufferedReader input = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintWriter output = new PrintWriter(server.getOutputStream(),true);

            String message;

            while ((message = input.readLine()) != null) {
                System.out.println("Received message from client: " + message);
                String response = message.toUpperCase();
                output.println(response);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

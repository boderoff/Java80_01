package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public class EchoClient {
    public static void main(String[] args) {
        String address = "localhost";
        int port = 6000;
        try (
                Socket socket = new Socket(address,port);
                BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(),true)
        ){
            System.out.println("Connect to "+address+" : "+port);
            System.out.println("Type message (exit for quit)");
            String userLine;
            while (true){
                userLine = userIn.readLine();
                out.println(userLine);

                String response = in.readLine();
                System.out.println("Response: "+response);
                if(Objects.equals(userLine, "exit")){
                    break;
                }
            }

        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HTTPClient {
    public static void main(String[] args) {
        String host = "example.com";
        int port = 80;
        try (
                Socket socket = new Socket(host,port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
                ) {
            System.out.println("Connected to: " + host);
            out.println("GET / HTTP/1.1\r\nHost: " + host + "\r\n\r\n");
            out.flush();
            System.out.println("HTTP Req was send");
            System.out.println("--HTTP Response--");
            String line;
            int lineCount = 0;
            while ((line = in.readLine()) != null && lineCount <= 10) {
                lineCount++;
                System.out.println(line);
            }
        }
         catch (IOException e) {
                System.out.println("I/O error: " + e.getMessage());

        }
    }
}

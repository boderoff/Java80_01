package lesson15;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EchoServer {
    private static AtomicInteger clientCounter = new AtomicInteger(0);
    public static void main(String[] args) throws IOException {
//        Socket client;
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        try ( ServerSocket server = new ServerSocket(6000)){
            System.out.println("Server started");
            while (true) {
                Socket client = server.accept();
                threadPool.execute(new ClientHandler(client));
                System.out.println("Client connected");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class ClientHandler implements Runnable {
        private Socket client;
        private int clientId;
        private String clientAddress;

        public ClientHandler(Socket client) {
            this.client = client;
            this.clientId = clientCounter.incrementAndGet();
            this.clientAddress = client.getInetAddress().getHostAddress() + ":" + client.getPort();
        }
    public void run() {
        try
                (BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                 PrintWriter out = new PrintWriter(client.getOutputStream(), true);) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.equals("exit")) {
                    System.out.println("Close connection");
                    out.println("Connection Closed");
                    break;
                }
                System.out.println("Received from client: " + line);
                out.println("Echo: " + line);
            }
        } catch (IOException e) {
            System.out.println("Client handling error: " + e.getMessage());
        } finally {
            try {
                client.close();
                System.out.println("Connection closed.");
            } catch (IOException e) {
                System.out.println("Error close connection" + e.getMessage());
            }
        }
    }




    }
}

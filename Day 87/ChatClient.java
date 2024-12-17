import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String serverMessage, clientMessage;

            while (true) {
                System.out.print("Enter message for server: ");
                clientMessage = userInput.readLine();
                output.println(clientMessage);

                serverMessage = input.readLine();
                if (serverMessage == null || clientMessage.equalsIgnoreCase("bye")) break;

                System.out.println("Server says: " + serverMessage);
            }

            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

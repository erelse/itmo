package client.sender;

import common.Connection;
import common.Message;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Connector {
    private Connection<Message> connection;
    private final String ip;
    private final int port;
    public Connector(String ip, int port){
        this.ip=ip;
        this.port=port;
        try {
            connection= new Connection<>(new Socket(ip, port));

        } catch (IIOException  e){
            System.out.println("Failed to connect with client process");
        }catch (Exception e){
            System.out.println("Server is unavailable, try later");
            throw new RuntimeException("Server not found");
        }
    }
    public void sendNewMessage(String clientName, String messageText){
        try {
            Message message = new Message(clientName,messageText);
            connection.sendMessage(message);
        } catch (IOException e) {
            System.out.println("Connection error: can't send the message");
        }
    }
    public Message receiveMessage(){
        try {
            return connection.readMessage();
        } catch (IIOException | ClassNotFoundException e) {
            System.out.println("Error: can't read the message");
        } catch (Exception e) {
            System.out.println("Error: can't read the message");
        }
        return null;
    }
    public static void readWithScanner(String filename) throws IOException {
        try (Scanner scanner = new Scanner(new File(filename), StandardCharsets.UTF_8)) {
            String line = null;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
            if (scanner.ioException() != null) {
                throw scanner.ioException();
            }
        }
    }

    public void sendFile() {

    }

    public void readFile(){

    }

    @Override
    public String toString() {
        return "Connector{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}

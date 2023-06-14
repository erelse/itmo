package client.threads;

import client.sender.Connector;

import java.io.IOException;
import java.util.Scanner;

public class SendThread extends Thread {
    private Scanner scanner;
    private Connector connector;
    private String clientName;

    public SendThread(Scanner scanner, Connector connector, String clientName) {
        this.connector = connector;
        this.scanner = scanner;
        this.clientName = clientName;
    }

    @Override
    public void run() {
        String text;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Enter a message or '/sendFile' to send your file or '/exit' for exit");
            text = scanner.nextLine();
            if (text.equalsIgnoreCase("/exit")) {
                Thread.currentThread().interrupt();
            }

            if (text.equals("/sendFile")) {
                System.out.println("Upload your file");
                try {
                    connector.readWithScanner("server/file.txt");
                    connector.sendFile();
                } catch (IOException e) {
                    System.out.println("Error: can't read from the file");
                    e.printStackTrace();
                }
                System.out.println("File sent");

            }

            if (text.equals("/readFile")) {
                System.out.println("Select file from the list:");
                connector.readFile();
            }

            connector.sendNewMessage(clientName, text);
            System.out.println("Message sent");


        }
    }
}
package client;

import client.sender.Connector;
import client.threads.ReceiveThread;
import client.threads.SendThread;
import java.util.Scanner;

public class Client {
    private final String ip;
    private final int port = 1024;
    private final String clientName;
    private Connector connector;



    public Client() {
        String [] clientNames = new  String[] {"Lisa", "John", "Kate","Tom"};
        clientName = clientNames[(int)(Math.random()*3)];
        this.ip="0.0.0.0";
    }



    public void startClientWork(){
        connector = new Connector(ip,port);
        System.out.println(connector);
        Scanner scanner = new Scanner(System.in);
        SendThread sendThread = new SendThread(scanner,connector,clientName);
        ReceiveThread receiveThread = new ReceiveThread(connector);
        sendThread.start();
        receiveThread.start();
        try {
            sendThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Client().startClientWork();
    }

}


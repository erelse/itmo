package client.threads;

import client.sender.Connector;

public class ReceiveThread extends Thread{
    private final Connector connector;
    public ReceiveThread(Connector connector){
        this.connector=connector;
    }
    @Override
    public void run(){
        while (true){
            System.out.println(connector.receiveMessage().getText());
        }
    }
}

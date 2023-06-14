package server;

import common.Connection;
import common.Message;
import server.threads.ReadThread;
import server.threads.SendingStream;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server {
    private int port = 1024;
    private CopyOnWriteArrayList<Connection> connectionsCollect = new CopyOnWriteArrayList();
    private ArrayBlockingQueue<server.MessageFromClient> messages = new ArrayBlockingQueue(10, true);


    public Server() {
        this.port = port;
    }

    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running " + serverSocket);
            new SendingStream(messages, connectionsCollect).start();
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Setup client connection");
                Connection<Message> connection = new Connection<>(socket);
                connectionsCollect.add(connection);
                new ReadThread(messages, connection).start();
            }
        } catch (IOException e) {
            System.out.println("IOException & ClassNotFoundException");
        }
    }
}



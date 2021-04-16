package me.willyan;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3309);
            if(socket.isConnected()){
                System.out.println("Conectado ao servidor.");
                socket.close();
            }
            if(socket.isClosed()){
                System.out.println("Desconectado do servidor.");
            }
        } catch (IOException e) {
            System.out.println("Não foi possivel conectar ao servidor.");
        }
    }
}

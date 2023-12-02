package org.example;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args) throws AlreadyBoundException, RemoteException {

        ServerApp.start();
    }
}
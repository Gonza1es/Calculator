package org.example;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerApp {

    public static final String OBJECT_NAME = "calculatorImpl";
    public static final int PORT = 1099;

    public static void start() throws RemoteException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(PORT);
        Calculator service = new CalculatorImpl();

        registry.bind(OBJECT_NAME, service);
        System.out.println("Server started");
    }

}

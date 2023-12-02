package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    int multiply(int x, int y) throws RemoteException;

    int division(int x, int y) throws RemoteException;

    int sum(int x, int y) throws RemoteException;

    int subtraction(int x, int y) throws RemoteException;
}

package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int multiply(int x, int y) throws RemoteException {
        return x*y;
    }

    @Override
    public int division(int x, int y) throws RemoteException {
        return x/y;
    }

    @Override
    public int sum(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int subtraction(int x, int y) throws RemoteException {
        return x-y;
    }
}

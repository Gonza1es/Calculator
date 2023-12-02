package org.example;

import java.rmi.Remote;

public interface Calculator extends Remote {

    int multiply(int x, int y);

    int division(int x, int y);

    int sum(int x, int y);

    int subtraction(int x, int y);
}

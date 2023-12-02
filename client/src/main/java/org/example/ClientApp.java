package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientApp {

    public static final String ADDRESS =
            "rmi://localhost:1099/calculatorImpl";

    public static void start() throws MalformedURLException, NotBoundException, RemoteException {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = (Calculator) Naming.lookup(ADDRESS);

        while(true) {
            System.out.println("Введите выражение (разделяя числа и знак операции пробелами)\n" +
                    "Введите 0, чтобы закрыть программу");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("Программа завершена");
                break;
            }
            String[] values = input.split(" ");

            int result = 0 ;
            try {
                switch (values[1]) {
                    case "+" -> result = calculator.sum(Integer.parseInt(values[0]), Integer.parseInt(values[2]));
                    case "-" -> result = calculator.subtraction(Integer.parseInt(values[0]), Integer.parseInt(values[2]));
                    case "*" -> result = calculator.multiply(Integer.parseInt(values[0]), Integer.parseInt(values[2]));
                    case "/" -> result = calculator.division(Integer.parseInt(values[0]), Integer.parseInt(values[2]));
                    default -> System.out.println("Неподдерживаемая операция");
                }
                System.out.println("Результат = " + result);
            } catch (NumberFormatException e) {
                System.out.println("Введите целые числа");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введите выражение");
            }
        }
    }
}

package ua.epam;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.print ("Введите число с ненулевой дробной частью: ");

        double n = in.nextDouble();

        double a = Math.round(n);

        System.out.println("Округление числа до целого: " + a);
    }
}

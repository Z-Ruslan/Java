package epam.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Четные числа должны делиться на 2, при других условиях - это нечетные
    // Если остаток от деления равен нулю, то число четное

        int n;
        System.out.print("Введите число: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if ( n%2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}
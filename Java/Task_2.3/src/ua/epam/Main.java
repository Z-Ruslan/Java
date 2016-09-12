package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Введите двузначное целое число: ");

        int a = in.nextInt();

        int f = a/10 + a%10;

        System.out.println("Сумма цифр заданного числа: " + f);
    }
}

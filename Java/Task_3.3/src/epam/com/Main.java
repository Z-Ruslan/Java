package epam.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Вывод наибольшего символа в трехзначном числе

        int n;
        System.out.print("Введите любое трехзначное число: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        if(a >= b & a > c|| a > b & a >= c){
            System.out.println("В числе "+n+" наибольшая цифра " +a);
        }
        else {
            if (b > a & b >= c) {
                System.out.println("В числе "+n+" наибольшая цифра " +b);
            }
            else {
                System.out.println("В числе "+n+" наибольшая цифра " +c);
            }
        }
    }
}
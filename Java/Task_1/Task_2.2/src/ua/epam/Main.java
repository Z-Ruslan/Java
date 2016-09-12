package ua.epam;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 345;
        // 100 <= n < 1000
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;

        System.out.println(a + b + c);
    }
}
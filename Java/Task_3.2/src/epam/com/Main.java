package epam.com;

public class Main {

    public static void main(String[] args) {
    //Сравнение дробных чисел, ближайших к 10

        double n = 8.5;
        double m = 11.45;
        int a = 10;
        double b = Math.abs(a-n);
        double c = Math.abs(a-m);
        if (b == c){
            System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Число "+m+" ближе к "+a);
        }
        if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }
    }

}
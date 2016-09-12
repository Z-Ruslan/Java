package epam.com;

public class Main {

    public static void main(String[] args) {
	// Выстроить числа по возрастанию

        int a = 7;
        int b = 0;
        int c = -5;

        System.out.println("Числа в переменных a, b и c: "+a+" "+b+" "+c);
        if(a < b & a < c){
            if( b < c)System.out.println("Возрастающая последовательность "+a+" "+b+" "+c);
            else System.out.println("Возрастающая последовательность "+a+" "+c+" "+b);
        }
        if(b < a & b < c){
            if(a < c)System.out.println("Возрастающая последовательность "+b+" "+a+" "+c);
            else System.out.println("Возрастающая последовательность "+b+" "+c+" "+a);
        }
        if(c < a & c < b){
            if(a < b)System.out.println("Возрастающая последовательность "+c+" "+a+" "+b);
            else System.out.println("Возрастающая последовательность "+c+" "+b+" "+a);
        }
    }
}
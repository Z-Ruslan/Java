package epam.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int q = 21;
        int w = 8;

        int f = q/w;
        int f1 = q - f*w;

        String s = (f + " and " + f1 + " (remainder)");

        System.out.println(f);
        System.out.println(f1);
        System.out.println(s);
    }
}

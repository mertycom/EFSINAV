package org.example.soru5;

public class Main {
    public static void main(String[] args) {
        // ax^2+bx+c

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a:");
        int a = kb.nextInt();

        System.out.print("Enter b:");
        int b = kb.nextInt();

        System.out.print("Enter c:");
        int c = kb.nextInt();

        int base1 = (-b + root(pow(b,2) -(4*a*c))/(2*a));
        System.out.println(base1+" "+(0-base1));
    }

    private static int root(int i) {
        //do this algorithm
        return i;
    }

    public static int pow(int a, int b) {
        int result = 1;

        while (b-- > 0) {
            result *= a;
        }

        return result;
    }
}

package org.example.soru10;

public class Main {
    /* Soru 10
    *  Exponential sayısını bulan algoritmayı yazınız. (𝑒^x)
    */

    public static void main(String[] args) {
        double e;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number:");
        int x = kb.nextInt();
        e=Math.exp(x);
        System.out.println("e= "+e);
        double total=1;
        for(long i=1;i<30;i++) {
            total += Math.pow(x, i) / faktorial(i);
        }
        System.out.println("e= "+total);
    }

    private static long faktorial(long number) {
        int result = 1;
        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
}

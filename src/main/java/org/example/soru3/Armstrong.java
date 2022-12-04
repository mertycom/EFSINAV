package org.example.soru3;


import org.w3c.dom.ls.LSOutput;

public class Armstrong {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter a number:");
        int number = kb.nextInt();

        for (int i =faktorial(number); ;i++){
            if(isArmstrong(i)){
                System.out.println(i);
                break;
            }
        }

    }

    private static boolean isArmstrong(int i) {
        return i == getDigitsPowSum(i) && i > 0;
    }

    public static int getDigitsPowSum(int a) { // --
        int digits = countDigits(a);
        int result = 0;

        while (a != 0) {
            result += pow(a % 10, digits);
            a /= 10;
        }

        return result;
    }

    public static int pow(int a, int b) {
        int result = 1;

        while (b-- > 0) {
            result *= a;
        }

        return result;
    }

    public static int countDigits(int a) {
        int count = 0;

        do {
            count++;
            a /= 10;
        } while (a != 0);

        return count;
    }

    private static int faktorial(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }


}

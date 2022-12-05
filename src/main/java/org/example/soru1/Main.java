package org.example.soru1;

public class Main {
    public static void main(String[] args) {
        long count,number,reverse,total;

        for(int i=10;i<=100;i++){
            count=0;
            number=i;
            total=number;
            while (true) {
                reverse=reverseNumber(total);
                //System.out.println(total+"..."+reverse);
                if (total == reverse) {
                    writeNumber(count,number);
                    break;
                }
                count++;
                total += reverse;
            }
        }
    }

    private static long reverseNumber(long number) {
        long reverse=0;
        while(number != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }
        return reverse;
    }

    private static void writeNumber(long count, long number) {
        System.out.println(number + " number "+ count+" times is not a palydrome");
    }
}

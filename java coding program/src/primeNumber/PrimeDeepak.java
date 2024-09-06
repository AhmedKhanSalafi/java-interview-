package primeNumber;

import java.util.Scanner;

public class PrimeDeepak {


    public static void main(String[] args) {


        int n;
        int temp = 0;

        System.out.println("enter number");

        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (int i = 2; i <= n-1; i++) {

            if (n % i == 0) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("not prime number");
        } else {
            System.out.println("prime number");
        }
    }}



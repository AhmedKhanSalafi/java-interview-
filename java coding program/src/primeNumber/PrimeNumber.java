package primeNumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        int n; int count =0;

        System.out.println("enter number");

        Scanner r = new Scanner(System.in);
        n= r.nextInt();

        for (int i=1; i<=n; i++){

            if(n%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }

        else {
            System.out.println(" not prime number");
        }

    }
}

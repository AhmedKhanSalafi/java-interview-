package armstrong;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        int n; int arm=0; int rem; int c;
        System.out.println("enter your number");

        Scanner r = new Scanner(System.in);

        n=r.nextInt();
        c=n;

        while (n>0){

            rem = n%10;
            arm = (rem*rem*rem)+ arm;
            n=n/10;

        }
        if (c==arm){
            System.out.println("armstrong number");

        }else {

            System.out.println("not armstrong number");
        }
    }
}

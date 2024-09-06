package collection;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        int x, y;
        System.out.println("enter x and y");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before sawpping " + "\n" + x + "\n" + y);



        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swapping using three
        // Variables
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}


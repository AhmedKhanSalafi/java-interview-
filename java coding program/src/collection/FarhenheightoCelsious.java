package collection;

import java.util.Scanner;

public class FarhenheightoCelsious {



    public static void main(String[] args) {

        float temperature ;
        Scanner in = new Scanner(System.in);
        System.out.println("enter temp in farh");
        temperature=in.nextInt();
        temperature=((temperature-32)*5)/9;

        System.out.println("temp in celsius" +temperature);

    }
}

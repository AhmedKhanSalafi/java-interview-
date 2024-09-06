package fabonaciSeries;

public class FabonaciSeries {

    public static void main(String[] args) {

        int a=0; int b=5; int c;

        for (int i=1;i<=10;i++){

            c=a+b;
            System.out.println(c);

            a=b;
            b=c;
        }
    }
}

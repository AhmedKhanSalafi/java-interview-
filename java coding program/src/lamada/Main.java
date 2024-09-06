package lamada;

public class Main {

    public static void main(String[] args) {

        SumInt sumInt = ( a , b)->
            a+b;

        System.out.println(sumInt.sum(5,10));
    }
}

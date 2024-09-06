package springBootFunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchExample {


    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 55, 66, 88, 77, 33);

        boolean status = list.stream().anyMatch(n->n%2==0);

       boolean status1= list.stream().allMatch(n->n%2==0);

       boolean status2 = list.stream().noneMatch(n->n>50);

        System.out.println(status);
        System.out.println(status1);

        System.out.println(status2);
    }
}
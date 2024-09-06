package newcodingprogram;

import java.util.Arrays;

public class SumElement {

    public static void main(String[] args) {

        int[] array={1,22,33,44,55};
        int sum = Arrays.stream(array).sum();

        System.out.println(sum);

      int sum2 =   Arrays.stream(array).reduce((x,y)->x+y).getAsInt();
        System.out.println(sum2);

        int sum3= Arrays.stream(array).reduce(Integer::sum).getAsInt();
        System.out.println(sum3);

        long sum4= Arrays.stream(array).summaryStatistics().getSum();
        System.out.println(sum4);

    }
}

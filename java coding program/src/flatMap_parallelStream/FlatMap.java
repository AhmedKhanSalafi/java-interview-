package flatMap_parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("A");
        List<String> list2 = Arrays.asList("B");
        List<String> list3 = Arrays.asList("C");

        System.out.println(
                Stream.of(list1,list2,list3).flatMap(List::stream).collect(Collectors.toList())
        );


    }

}

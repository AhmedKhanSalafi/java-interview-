package springBootFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColGroupBy {

    public static void main(String[] args) {


        List<Person> personListlist = new ArrayList<>();
        personListlist.add(new Person("ahmed","london",28));
        personListlist.add(new Person("sdk","london",28));
        personListlist.add(new Person("rahul","hyd",23));

       Map<String,List<Person>> groupByCity = personListlist.stream().collect(Collectors.groupingBy(Person::getCity));

        groupByCity.forEach((city,persons)->{
            System.out.println(city);
            System.out.println(persons);
        });
       // System.out.println(groupByCity);
        Map<Integer,List<Person>> groupByAge = personListlist.stream().collect(Collectors.groupingBy(Person::getAge));

//        groupByAge.forEach((age,persons)->{
//            System.out.println(age);
//            System.out.println(persons);
//        });

       // System.out.println(groupByAge);
    }
    }


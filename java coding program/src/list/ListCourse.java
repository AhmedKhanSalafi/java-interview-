package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListCourse {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("hibernate","java","css","html");

        //basic loop
        for (int i =0; i<courses.size();i++)
        {
            System.out.println(courses.get(i));
        }

        //
        for (String course: courses){
            System.out.println(course);
        }

        //loop with iterator

        for (Iterator iterator=courses.iterator();iterator.hasNext();) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        Iterator iterator=courses.iterator();
        while (iterator.hasNext()){

            String course = (String) iterator.next();
            System.out.println(course);

        }

        //java8
        courses.stream().forEach(course-> System.out.println(course));
    }
}

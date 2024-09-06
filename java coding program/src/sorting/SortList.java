package sorting;

import sorting.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(10, "ahmed", 29, 70000));
        employeeList.add(new Employee(20, "naveen", 28, 30000));
        employeeList.add(new Employee(30, "ravi", 30, 69000));

        Collections.sort(employeeList, new Mysort());

        System.out.println(employeeList);

        //lamda expression

        Collections.sort(employeeList, (o1, o2) ->
                o1.getSalary() - o2.getSalary());

        System.out.println(employeeList);

        Collections.sort(employeeList, (o1, o2) ->
                o1.getName().compareTo(o2.getName()));

        System.out.println(employeeList);


    }}

class Mysort implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary() - o1.getSalary();
    }
}

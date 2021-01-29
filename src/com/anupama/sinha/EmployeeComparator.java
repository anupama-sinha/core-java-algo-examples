package com.anupama.sinha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator{
    public static void main(String[] args) {
        List<Employee1> employeeList = new ArrayList<>();

        Employee1 e1 = new Employee1(1,"Anupama",10);
        Employee1 e2= new Employee1(2,"John Lewis",2);

        employeeList.add(e1);
        employeeList.add(e2);

        Collections.sort(employeeList,new SortByAge());
        employeeList.stream().forEach(System.out::println);

    }
}

class Employee1 {
    int id;
    String name;
    int age;

    public Employee1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class SortByAge implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.age-o2.age;
    }
}


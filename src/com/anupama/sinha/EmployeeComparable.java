package com.anupama.sinha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(1,"Anupama",10);
        Employee e2= new Employee(2,"John Lewis",2);

        employeeList.add(e1);
        employeeList.add(e2);

        Collections.sort(employeeList);
        employeeList.stream().forEach(System.out::println);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
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

    @Override
    public int compareTo(Employee o) {
        if(age> o.age)
            return 1;
        else if(age< o.age)
            return -1;
        return 0;
    }
}

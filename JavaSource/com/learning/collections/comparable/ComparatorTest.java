package com.learning.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.empId == o2.empId )
            return 0;

            //else if(this.empId < employee.empId)  // For descending
        else if(o1.empId > o2.empId)  // For ascending
            return 1;

        else
            return -1;
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class ComparatorTest {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(456, "Janaki Ram", "Hyderabad");
        Employee e2 = new Employee(852, "Rami Reddy", "Delhi");
        Employee e3 = new Employee(123, "Vinay", "Gujurat");
        Employee e4 = new Employee(231, "Jay", "Bengal");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);


        Collections.sort(employeeList, new EmployeeIdComparator());
        System.out.println(employeeList);

        Collections.sort(employeeList, new EmployeeNameComparator());
        System.out.println(employeeList);

        Collections.sort(employeeList, Comparator.comparing(Employee::getName)); // In Java 8 and onwards
        System.out.println(employeeList);


        Collections.sort(employeeList, Comparator.comparing(Employee::getAddress));
        System.out.println(employeeList);
    }
}

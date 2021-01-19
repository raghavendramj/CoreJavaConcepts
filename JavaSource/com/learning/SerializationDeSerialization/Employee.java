package com.learning.SerializationDeSerialization;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    int empId;
    String empName;
    transient String password;

    public Employee(int empId, String empName, String password) {
        this.empId = empId;
        this.empName = empName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

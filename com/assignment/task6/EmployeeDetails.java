package com.assignment.task6;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Robert", 1994, "64C- Walls Street"),
                new Employee("Sam", 2000, "68D- Walls Street"),
                new Employee("John", 1999, "26B- Walls Street")
        };

        System.out.println("Name\tYear of Joining\tAddress");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + "\t" + emp.getYearOfJoining() + "\t\t" + emp.getAddress());
        }
    }
}

class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getAddress() {
        return address;
    }
}

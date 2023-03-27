package com.generics.generic;

public class Employee<T> {
    private T name;
    private T designation;
    private T salary;

    public Employee(T name, T designation, T salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public T getName() {
        return name;
    }

    public T getDesignation() {
        return designation;
    }

    public T getSalary() {
        return salary;
    }
}

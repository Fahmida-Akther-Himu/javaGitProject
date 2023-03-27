package com.generics.generic;

public class Student <N> {
    private N salary;

    public Student(N salary) {
        this.salary = salary;
    }

    public N getSalary() {
        return salary;
    }
}

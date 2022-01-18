package com.basicstrong.section07objectstreams;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = -1478196731571965815L;

    private final int age;

    public Employee(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }
}

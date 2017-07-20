package com.mdc.Streams;

import java.io.Serializable;

/**
 * Created by cdragu on 06.07.2017.
 */
public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private String positions;
    private String grade;

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPositions() {
        return positions;
    }

    public Employee setPositions(String positions) {
        this.positions = positions;
        return this;
    }

    public String getGrade() {
        return grade;
    }

    public Employee setGrade(String grade) {
        this.grade = grade;
        return this;
    }
}

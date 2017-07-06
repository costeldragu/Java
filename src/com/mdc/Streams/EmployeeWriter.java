package com.mdc.Streams;

import com.mdc.Streams.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by cdragu on 06.07.2017.
 */
public class EmployeeWriter {
    List<Employee> employeeList;
    private String filePath;

    /**
     * Create dummy data
     */
    EmployeeWriter(String filePath) {
        this.filePath = filePath;
        employeeList = new ArrayList<>();
        employeeList.add(new Employee()
                .setFirstName("Dragu")
                .setLastName("Costel")
                .setGrade("Engineer")
                .setPositions("Developer")
        );
        employeeList.add(new Employee()
                .setFirstName("Dragu")
                .setLastName("Marinela")
                .setGrade("Engineer")
                .setPositions("Developer")
        );
        employeeList.add(new Employee()
                .setFirstName("Pahon")
                .setLastName("Bogdan")
                .setGrade("Senior Tehnician")
                .setPositions("Developer")
        );

    }

    /**
     * @return
     */
    public boolean writeData() {
        try {
            PrintWriter out = new PrintWriter(filePath);
            for (Employee employee : employeeList) {
                out.println("first-name:" + employee.getFirstName());
                out.println("last-name:" + employee.getLastName());
                out.println("position:" + employee.getPositions());
                out.println("grade:" + employee.getGrade());
                out.println("===");
            }
            out.flush();
            out.close();
            return true;
        } catch (IOException e) {
            Logger.getGlobal().severe(e.getMessage());
            return false;
        }

    }
}

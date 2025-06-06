package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}
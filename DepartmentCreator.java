package controller;

import model.Department;
import model.Group;
import model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public static void addGroup(Department department, Group group) {
        department.addGroup(group);
    }
}
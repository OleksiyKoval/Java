package controller;

import model.Faculty;
import model.Department;
import model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public static void addDepartment(Faculty faculty, Department department) {
        faculty.addDepartment(department);
    }
}
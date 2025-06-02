package controller;

import model.University;
import model.Faculty;
import model.Human;

public class UniversityCreator {
    public static University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    public static void addFaculty(University university, Faculty faculty) {
        university.addFaculty(faculty);
    }
}
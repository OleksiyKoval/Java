package controller;

import model.Group;
import model.Human;
import model.Student;

public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public static void addStudent(Group group, Student student) {
        group.addStudent(student);
    }
}
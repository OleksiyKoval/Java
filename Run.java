package controller;

import model.*;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("Університет створено успішно.");
    }

    public static University createTypicalUniversity() {
        Human rector = new Human("Олександр", "Петров", "Іванович", Sex.MALE);
        University university = UniversityCreator.createUniversity("Класичний Університет", rector);

        Human dean = new Human("Марія", "Іванова", "Петрівна", Sex.FEMALE);
        Faculty faculty = FacultyCreator.createFaculty("Факультет інформатики", dean);
        UniversityCreator.addFaculty(university, faculty);

        Human departmentHead = new Human("Сергій", "Коваленко", "Олегович", Sex.MALE);
        Department department = DepartmentCreator.createDepartment("Кафедра програмування", departmentHead);
        FacultyCreator.addDepartment(faculty, department);

        Human groupHead = new Human("Ірина", "Сидорова", "Валеріївна", Sex.FEMALE);
        Group group = GroupCreator.createGroup("ПЗ-41", groupHead);
        DepartmentCreator.addGroup(department, group);

        Student student1 = StudentCreator.createStudent("Анна", "Козак", "Іванівна", Sex.FEMALE);
        GroupCreator.addStudent(group, student1);

        Student student2 = StudentCreator.createStudent("Дмитро", "Шевченко", "Андрійович", Sex.MALE);
        GroupCreator.addStudent(group, student2);

        return university;
    }
}
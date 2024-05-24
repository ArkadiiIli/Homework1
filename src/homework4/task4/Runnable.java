package homework4.task4;

import java.util.ArrayList;
import java.util.List;

public class Runnable {
    private final static double AVERAGE_PASSING_GRADE = 3.0;

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", 1, 3, 2.19));
        studentList.add(new Student("Anna", 1, 3, 4.11));
        studentList.add(new Student("Oleg", 2, 4, 3.75));
        studentList.add(new Student("Anton", 2, 1, 1.99));
        studentList.add(new Student("Olga", 2, 4, 3.89));

        System.out.println(studentList);
        System.out.println();

        printStudents(studentList, 2);
        System.out.println();

        updateStudentsStatus(studentList);
        System.out.println(studentList);
    }

    private static void printStudents(List<Student> studentList, int group) {
        studentList.stream()
                .filter(student -> student.getGroup() == group)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void updateStudentsStatus(List<Student> studentList) {
        studentList.removeIf(student -> student.getAverageGrade() < AVERAGE_PASSING_GRADE);
        studentList.forEach(Student::transferToNextCourse);
    }
}

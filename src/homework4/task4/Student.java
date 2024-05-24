package homework4.task4;

import java.util.Objects;

public class Student {
    private final String name;
    private int group;
    private int course;
    private double averageGrade;

    public Student(String name, int group, int course, double averageGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void transferToNextCourse() {
        course++;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (group != student.group) return false;
        if (course != student.course) return false;
        if (Double.compare(averageGrade, student.averageGrade) != 0) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + group;
        result = 31 * result + course;
        temp = Double.doubleToLongBits(averageGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

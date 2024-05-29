package homework5.task2;

import java.util.*;

public class Runnable {
    private static final int THIRTY_YEARS_FILTER_VALUE = 30;
    private static final String SOFTWARE_DEPARTMENT_VALUE = "Software";
    private static final String DEVOPS_DEPARTMENT_VALUE = "DevOps";

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();
        findAllEmployeesOverThirty(employeeList);
        countAllEmployeesFromSoftware(employeeList);
        findMaxSalaryEmployee(employeeList);
        findEmployeeNamesByDevOps(employeeList);
        findAverageSalary(employeeList);
    }

    private static void findAverageSalary(List<Employee> employeeList) {
        OptionalDouble average = employeeList
                .stream()
                .mapToInt(Employee::getSalary)
                .average();
        average.ifPresent(value -> {
            System.out.println("Average salary = " + value);
            System.out.println();
        });
    }

    private static void findEmployeeNamesByDevOps(List<Employee> employeeList) {
        List<String> names = employeeList
                .stream()
                .filter(employee -> employee.getDepartment().equals(DEVOPS_DEPARTMENT_VALUE))
                .map(Employee::getName)
                .sorted()
                .toList();

        System.out.println(names);
        System.out.println();
    }

    private static void findMaxSalaryEmployee(List<Employee> employeeList) {
        OptionalInt maxSalary = employeeList.stream().mapToInt(Employee::getSalary).max();
        maxSalary.ifPresent(value -> {
            System.out.println("Max salary = " + value);
            System.out.println();
        });
    }

    private static void countAllEmployeesFromSoftware(List<Employee> employeeList) {
        long countEmployeesFromSoftware = employeeList
                .stream()
                .filter(employee -> employee.getDepartment().equals(SOFTWARE_DEPARTMENT_VALUE))
                .count();

        System.out.println("The Software department employs " + countEmployeesFromSoftware + " employees.");
        System.out.println();
    }

    private static void findAllEmployeesOverThirty(List<Employee> employeeList) {
        List<Employee> sortedList = employeeList
                .stream()
                .filter(employee -> employee.getAge() > THIRTY_YEARS_FILTER_VALUE)
                .sorted(Comparator.comparing(Employee::getAge))
                .toList();

        System.out.println(sortedList);
        System.out.println();
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Steve", 25, "DevOps", 5000));
        list.add(new Employee("Tom", 32, "Software", 6000));
        list.add(new Employee("Lisa", 18, "QA", 5000));
        list.add(new Employee("Monica", 40, "DevOps", 4000));
        list.add(new Employee("Ben", 45, "Software", 7000));
        list.add(new Employee("Sam", 29, "QA", 5500));
        list.add(new Employee("Kate", 35, "PM", 6300));
        list.add(new Employee("Albert", 23, "InfoSec", 7000));
        list.add(new Employee("Joseph", 45, "PM", 7500));

        return list;
    }
}

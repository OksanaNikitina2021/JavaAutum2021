package sef.finalActivity;

import java.util.*;

public class FirstActivity {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Oksana Nikitina", 2500.00);
        Employee secondEmployee = new Employee("John Smith", 2300.50);
        Employee thirdEmployee = new Employee("Jane Doe", 3750.75);
        Employee fourthEmployee = new Employee("Marry Janne", 750.35);
        Employee fifthEmployee = new Employee("Janis Ozols", 1750.05);

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);
        employeeList.add(fourthEmployee);
        employeeList.add(fifthEmployee);

        System.out.println(printSalariesDescending(employeeList));
    }

    private static String printSalariesDescending(List<Employee> employeeList) {

        Comparator<Employee> compareBySalary = (Employee emp1, Employee emp2) -> emp1.compare(emp1, emp2);
        Collections.sort(employeeList, compareBySalary);

        String sorted = "";

        for (Employee employee : employeeList) {
            sorted += employee.getName() + " " + employee.getSalary() + System.lineSeparator();
        }

        return sorted;
    }
}

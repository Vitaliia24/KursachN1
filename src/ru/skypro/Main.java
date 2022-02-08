package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[10];

        Employee Riddy = new Employee("Riddy", "Richard", "John", 3, 45000);
        Employee Johnson = new Employee("Johnson", "Matthew", "Joseph", 2, 50000);
        Employee Stark = new Employee("Stark", "Tony", "Howard", 1, 60000);
        Employee Potter = new Employee("Potter", "Harry", "James", 2, 50000);
        Employee Rojers = new Employee("Rojers", "Steewe", "Joe", 1, 90000);
        Employee Pack = new Employee("Pack", "Jimin", "George", 4, 80000);
        Employee Cooper = new Employee("Cooper", "Bradley", "Lewis", 1, 75000);
        Employee Evance = new Employee("Evance", "Chris", "Arthur", 3, 75000);
        Employee Collins = new Employee("Collins", "Grag", "Allen", 2, 95000);
        Employee Stone = new Employee("Stone", "Victor", "Wesley", 5, 80000);

        printEmployee(employeeArray);
        System.out.println();

        System.out.println("Суммарные траты на ЗП сотрудников: " + calculateTotalSalary(employeeArray));
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП: " + employeeWithMinSalary(employeeArray));
        System.out.println();
        System.out.println("Сотрудник с максимальной ЗП: " + employeeWithMaxSalary(employeeArray));
        System.out.println();
        System.out.println("Средняя ЗП: " + averageSalary(employeeArray));
        System.out.println();

        printFullName(employeeArray);
    }

    public static void printEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static float calculateTotalSalary(Employee[] employees){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static float employeeWithMaxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] > maxSalary) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public static float employeeWithMinSalary(Employee[] employees) {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] > minSalary) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public static float averageSalary(Employee[] employees){
        int employeeCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                employeeCount++;
            }
        }
        return calculateTotalSalary(Employee[] employees)/employeeCount;
    }

    public static void printFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                System.out.println(employees.getFullName());
            }
        }
    }

}

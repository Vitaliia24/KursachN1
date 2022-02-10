package ru.skypro;

public class Main {

    private static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {

        Employee riddy = new Employee("Riddy", "Richard", "John", 3, 45000);
        Employee johnson = new Employee("Johnson", "Matthew", "Joseph", 2, 50000);
        Employee stark = new Employee("Stark", "Tony", "Howard", 1, 60000);
        Employee potter = new Employee("Potter", "Harry", "James", 2, 50000);
        Employee rojers = new Employee("Rojers", "Steewe", "Joe", 1, 90000);
        Employee pack = new Employee("Pack", "Jimin", "George", 4, 80000);
        Employee cooper = new Employee("Cooper", "Bradley", "Lewis", 1, 75000);
        Employee evance = new Employee("Evance", "Chris", "Arthur", 3, 75000);
        Employee collins = new Employee("Collins", "Grag", "Allen", 2, 95000);
        Employee stone = new Employee("Stone", "Victor", "Wesley", 5, 80000);

        addEmployee(riddy);
        addEmployee(johnson);
        addEmployee(stark);
        addEmployee(potter);
        addEmployee(rojers);
        addEmployee(pack);
        addEmployee(cooper);
        addEmployee(evance);
        addEmployee(collins);
        addEmployee(stone);

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

    private static boolean addEmployee(Employee employee){
        for (int i = 0; i< employeeArray.length; i++){
            if (employeeArray[i]== null){
                employeeArray[i] = employee;
                System.out.println(employee.getFullName() + " was added");
                return true;
            }
        }
        return false;
    }

    public static void printEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
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
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static float employeeWithMinSalary(Employee[] employees) {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static float averageSalary(Employee[] employees){
        int employeeCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employeeCount++;
            }
        }
        return calculateTotalSalary(employees)/employeeCount;
    }

    public static void printFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

}

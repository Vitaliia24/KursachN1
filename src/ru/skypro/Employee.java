package ru.skypro;

import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private final int id;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private int department;
    private float salary;

    public Employee(String lastName, String firstName, String middleName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getFullName() {
        return lastName + ' ' + firstName + ' ' + middleName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "id=" + id +
                ", Фамилия='" + lastName + '\'' +
                ", Иммя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Отдел=" + department +
                ", Зарплата=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Float.compare(employee.salary, salary) == 0 && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, middleName, department, salary);
    }
}

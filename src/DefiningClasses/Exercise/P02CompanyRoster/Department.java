package DefiningClasses.Exercise.P02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public String getDepartment() {
        return departmentName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }
}

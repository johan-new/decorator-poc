package johann;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    List<ROLES> roles = new ArrayList<>();

    int salary;

    Employee(){
        addRole(ROLES.EMPLOYEE);
        salary = 1000;
    }

    void addRole(ROLES role) {
        this.roles.add(role);
    }

    int getSalary() { return  this.salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "roles=" + roles +
                ", salary=" + salary +
                '}';
    }
}

package exercise_three;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> departments = new ArrayList<Department>();

    public University(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public boolean addDepartment(Department department) {
        if (this.departments.size() <= 10) {
            departments.add(department);
            return true;
        } else {
            System.out.printf("The %s University already have %d departments", this.name, this.departments.size());
            return false;
        }
    }
}

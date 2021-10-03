package baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList {
    ArrayList<String> employees = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones",
            "Amanda Cullen", "Jeremy Goodwin"));
    public void displayEmpolyees() {
        //prints each employee in order on separate lines
        for (String employeeName:employees) {
            System.out.println(employeeName);
        }
    }
    public void removeEmployees(String employeeName) {
        //removes specific employeeName
        employees.remove(findEmployeeIndex(employeeName));
    }
    private int findEmployeeIndex(String employee) {
        //looks through array list to find employee
        return employees.indexOf(employee);
    }
    public int getNumberOfEmployees() {
        //gets number of employees
        return employees.size();
    }
}

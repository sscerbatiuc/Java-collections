/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.maps;

import java.util.HashMap;
import java.util.Map;
import learningcollections.sorting.comparator.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class MapsDemo {

    public static void main(String[] args) {
        Map<Integer, EmployeeCustom> employeeMap = new HashMap<>();
        EmployeeCustom employeeCustom = new EmployeeCustom(1, "Jake");
        EmployeeCustom employeeCustom2 = new EmployeeCustom(1, "Peter");
        EmployeeCustom employeeCustom3 = new EmployeeCustom(1, "John");
        
        employeeMap.put(employeeCustom.id, employeeCustom);
        employeeMap.put(employeeCustom2.id, employeeCustom2);
        employeeMap.put(employeeCustom3.id, employeeCustom3);

    }
}

class EmployeeCustom {

    int id;
    String name;

    public EmployeeCustom(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
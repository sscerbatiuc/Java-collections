/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.sorting.arrays;

/**
 *
 * @author sscerbatiuc
 */
public class App {

    static EmployeeManager empManager = new EmployeeManager();

    public static void main(String[] args) {
        // meniu
        // optiunea
        // 1. add
        System.out.println("Nume?");
        String name = "name"; // scanner.nextLine();
        Gender gen = enterGender();
        empManager.add(name);
        
        System.out.println(empManager.view(0)); // Employee - toString() (Object)
        
        Employee emp = empManager.view(0);
        System.out.println(emp.getName());
    }

    public static Gender enterGender() {
        while (true) {
            // break/return
            System.out.println("Genul?");
            // ??
            // if incorrect - re-enter
        }
    }
}

enum Gender {
    Male, Female
}

class EmployeeManager {

    Employee[] emp = new Employee[10];

    public void add(String name /*, String surname, int idnp, ... */) {
        // index
        emp[0] = new Employee(name);
    }
    
    public Employee view(int index){
        return emp[index];
    }

}

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Dac metoda asta lipseste, in system.out.println()
    public String toString(){
        return "Employee[name=" + name + "]"; // "Employee[name=John]
    }

}

package Tut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employees in the company:");
        int noOfEmployees = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + " (ID, Age, Salary, Name, Absent Days,Department):");
            int id = sc.nextInt();
            int age = sc.nextInt();
            int salary = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine(); // Read full name including spaces
            int days = sc.nextInt();
            sc.nextLine();// Consume newline
            String Department=sc.next();
            Employee e = new Employee(id, age, salary, name, days,Department);
            empList.add(e);
        }

        int i = 1;
        for (Employee e : empList) {
            System.out.println("Data for Employee " + (i++));
            e.display();
            double bonus=e.calculateBonus();
            double tax=e.calculateTax();
            int deduction=e.calculateDeduction();
            System.out.println("Bonus: " + bonus);
            System.out.println("Tax: " +tax );
            System.out.println("Deduction of Salary: " +deduction );
            double finalSalary=e.salary+bonus-tax-deduction;
            System.out.println("Gross Salary: " +finalSalary );
            System.out.println("\n---------------------------------------------------\n");
        }

        System.out.println("Data for Manager");
        Manager m = new Manager(123, 55, 100000, "Harsh", 2,"Computer"); // Provide absent days
        m.display();

        sc.close();
    }
}

class Employee {
    protected int salary;
    protected String name;
    int age;
    protected int id;
    protected int days;
    String department;// Days of absence
    
    Employee(int emp_id, int age, int salary, String name, int days,String departent) {
        this.salary = salary;
        this.id = emp_id;
        this.age = age;
        this.name = name;
        this.days = days;
        this.department=departent;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Department of employee: "+department);
    }

    public double calculateBonus() {
        return this.salary * 0.05; // Adjusted realistic bonus percentage
    }

    public double calculateTax() {
        return this.salary * 0.13;
    }

    public int calculateDeduction() {
        int dailySalary = this.salary / 30; // Salary per day
        return dailySalary * days; // Deduction for absent days
    }
}

class Manager extends Employee {
    Manager(int id, int age, int salary, String name, int days,String department) {
        super(id, age, salary, name, days,department);
    }

    @Override
    public double calculateBonus() {
        return this.salary * 0.10; // Manager gets 10% bonus
    }

    @Override
    public double calculateTax() {
        if(this.salary<=50000){
            return this.salary*0.5;
        }else if(this.salary<=100000){
            return this.salary*0.15;
        }else if(this.salary<=200000){
             return this.salary*0.25;
        }else if(this.salary<=300000){
            return this.salary*0.30;
        }
        return -1;
    }

    @Override
    public void display() {
        System.out.println("Manager ID: " + id);
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Age: " + age);
        System.out.println("Manager Salary: " + salary);
        System.out.println("Manager Salary: " + department);
        double bonus=calculateBonus();
        double tax=calculateTax();
        int deduction=calculateDeduction();
        System.out.println("Bonus for Manager: " + bonus);
        System.out.println("Tax Applied to Salary: " + tax);
        System.out.println("Salary Deduction: " + deduction);
        System.out.println("Gross salary:"+(this.salary+bonus-tax-deduction));
    }
}

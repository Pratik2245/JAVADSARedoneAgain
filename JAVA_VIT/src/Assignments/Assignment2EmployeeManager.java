package Assignments;

import Assignments.Manager;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Assignment2EmployeeManager {
    public static void main(String[] args) {

//        Arraylist to store managers
        ArrayList<Manager> managers = new ArrayList<>();
        ArrayList<Employee> emloyees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Press");
            System.out.println("1.Add Managers");
            System.out.println("2.Add Employees");
            System.out.println("3.Promote An Employee To Manager");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AddManagers(managers);
                    break;
                case 2:
                    AddEmployees(managers,emloyees);
                    break;
                case 3:
                    promoteEmployee(managers,emloyees);
                    break;
                case 4:
                    exit(0);
            }
        } while (choice != 4);
    }
    public static void AddManagers(ArrayList<Manager> managers){

        Scanner sc=new Scanner(System.in);
        Manager m1 = new Manager();

        System.out.println("\n--- Enter details for Manager ");
        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();

        System.out.print("Enter Manager ID: ");
        String mID = sc.nextLine();

        System.out.print("Enter Position: ");
        String position = sc.nextLine();

        System.out.print("Enter Days Present: ");
        int daysPresent = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Team Name: ");
        String teamName = sc.nextLine();

        System.out.print("Enter Reporting Manager Name (if any, else enter your name): ");
        String reportingManagerName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Bonus Percentage for Manager: ");
        double bonusPercentage = sc.nextDouble();
        sc.nextLine();

        Manager manager = new Manager(mName, mID, position, daysPresent, teamName, reportingManagerName, basicSalary, bonusPercentage);
        managers.add(manager);

        System.out.println("\n=== Manager Details Added ===");
        manager.displayDetails();
        double netSalary = manager.calculateNetSalary();
        System.out.println("Net Salary (including bonus): " + netSalary);
    }
    public static void AddEmployees(ArrayList<Manager> managers,ArrayList<Employee> employees){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.println("\n--- Enter details for Employee ");

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String empID = sc.nextLine();

        System.out.print("Enter Position: ");
        String position = sc.nextLine();

        System.out.print("Enter Days Present: ");
        int daysPresent = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Team Name: ");
        String teamName = sc.nextLine();

        System.out.print("Enter Manager Name for this employee: ");
        String empManagerName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        sc.nextLine();


        Employee employee = new Employee(empName, empID, position, daysPresent, teamName, empManagerName, basicSalary);
        employees.add(employee);
        System.out.println("\n=== Employee Details ===");
        employee.displayEmployeeData();
        double netSalary = employee.calculateNetSalary();
        System.out.println("Net Salary (without bonus): " + netSalary);
        Manager assignedManager = null;
        for (Manager m : managers) {
            if (m.empName.equalsIgnoreCase(empManagerName)) {
                assignedManager = m;
                break;
            }
        }
        if (assignedManager != null) {
            System.out.println("\nThe manager '" + assignedManager.empName + "' is registered in the system.");
            System.out.print("Do you want to apply the manager's bonus for this employee? (yes/no): ");
            String applyBonus = sc.nextLine();
            if (applyBonus.equalsIgnoreCase("yes")) {
                double teamMemberNetSalary = assignedManager.calculateTeamMemberNetSalary(employee);
                System.out.println("Net Salary after applying manager's bonus ("
                        + assignedManager.empName + " Bonus " + assignedManager.getBonusPercentage() + "%): " + teamMemberNetSalary);
            } else {
                System.out.println("No bonus applied for this employee.");
            }
        } else {
            System.out.println("\nNo matching manager found for '" + empManagerName + "'. Cannot apply bonus.");
        }
    }

    public static void promoteEmployee(ArrayList<Manager> managers,ArrayList<Employee> employees){
        
    }
}

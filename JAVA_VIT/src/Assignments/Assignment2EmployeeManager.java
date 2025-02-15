package Assignments;

import Assignments.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ***** Step 1: Enter Manager Details *****
        System.out.print("Enter number of managers to add: ");
        int numManagers = sc.nextInt();
        sc.nextLine(); // consume newline

        ArrayList<Manager> managers = new ArrayList<>();

        for (int i = 0; i < numManagers; i++) {
            System.out.println("\n--- Enter details for Manager " + (i + 1) + " ---");

            System.out.print("Enter Manager Name: ");
            String mName = sc.nextLine();

            System.out.print("Enter Manager ID: ");
            String mID = sc.nextLine();

            System.out.print("Enter Position: ");
            String position = sc.nextLine();

            System.out.print("Enter Days Present: ");
            int daysPresent = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Team Name: ");
            String teamName = sc.nextLine();

            // For a manager, the manager name can be set to his/her own name or a higher-level manager.
            // Here, we assume the input is self-managed (or leave it as desired).
            System.out.print("Enter Reporting Manager Name (if any, else enter your name): ");
            String reportingManagerName = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("Enter Bonus Percentage for Manager: ");
            double bonusPercentage = sc.nextDouble();
            sc.nextLine(); // consume newline

            Manager manager = new Manager(mName, mID, position, daysPresent, teamName, reportingManagerName, basicSalary, bonusPercentage);
            managers.add(manager);

            System.out.println("\n=== Manager Details Added ===");
            manager.displayDetails();
            double netSalary = manager.calculateNetSalary();
            System.out.println("Net Salary (including bonus): " + netSalary);
        }

        // ***** Step 2: Enter Employee Details *****
        System.out.print("\nEnter number of employees to add: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            String empID = sc.nextLine();

            System.out.print("Enter Position: ");
            String position = sc.nextLine();

            System.out.print("Enter Days Present: ");
            int daysPresent = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Team Name: ");
            String teamName = sc.nextLine();

            System.out.print("Enter Manager Name for this employee: ");
            String empManagerName = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Create an Employee object
            Employee employee = new Employee(empName, empID, position, daysPresent, teamName, empManagerName, basicSalary);

            System.out.println("\n=== Employee Details ===");
            employee.displayEmployeeData();
            double netSalary = employee.calculateNetSalary();
            System.out.println("Net Salary (without bonus): " + netSalary);

            // Check if the employee's manager exists in the system.
            Manager assignedManager = null;
            for (Manager m : managers) {
                if (m.empName.equalsIgnoreCase(empManagerName)) {
                    assignedManager = m;
                    break;
                }
            }

            // If a matching manager is found, allow the manager's bonus to be applied.
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

        sc.close();
    }
}

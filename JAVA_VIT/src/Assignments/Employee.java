package Assignments;

public class Employee {
    protected String empName;
    protected String empId;
    protected String position;
    protected int daysPresent;   // Days the employee was present in the month
    protected String teamName;
    protected String managerName;
    protected double basicSalary;
    // Assuming full month working days is 30
    protected final int totalWorkingDays=30;

    Employee(){
        empName="";
        empId="";
        position="";
        daysPresent=0;
        teamName="";
        managerName="";
        basicSalary=0.0;
        System.out.println("Data Initialised Successfully");
    }
    public Employee(String empName, String empId, String position, int daysPresent, String teamName, String managerName, double basicSalary) {
        this.empName = empName;
        this.empId = empId;
        this.position = position;
        this.daysPresent = daysPresent;
        this.teamName = teamName;
        this.managerName = managerName;
        this.basicSalary = basicSalary;
    }

    public double calculateAllowances() {
        double HRA= 0.25 * basicSalary;
        double DA= 0.15 * basicSalary;
        double TA= 0.10 * basicSalary;
        return HRA + DA + TA;
    }
    public double calculateGrossSalary() {
        double fullGross = basicSalary + calculateAllowances();
        double attendanceFactor = (double) daysPresent / totalWorkingDays;
        return fullGross * attendanceFactor;
    }

    // Calculate tax based on the taxable income using progressive tax slabs
    public double calculateTax(double taxableIncome) {
        double tax = 0;
        if (taxableIncome <= 250000) {
            tax = 0;
        } else if (taxableIncome <= 500000) {
            tax = 0.05 * (taxableIncome - 250000);
        } else if (taxableIncome <= 750000) {
            tax = 12500 + 0.10 * (taxableIncome - 500000);
        } else if (taxableIncome <= 1000000) {
            tax = 12500 + 25000 + 0.15 * (taxableIncome - 750000);
        } else {
            tax = 12500 + 25000 + 37500 + 0.20 * (taxableIncome - 1000000);
        }
        return tax;
    }

    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double tax = calculateTax(grossSalary);
        return grossSalary - tax;
    }

    public void displayEmployeeData() {
        System.out.println("Employee Details:");
        System.out.println("Name         : " + empName);
        System.out.println("ID           : " + empId);
        System.out.println("Position     : " + position);
        System.out.println("Team         : " + teamName);
        System.out.println("Manager      : " + managerName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Days Present : " + daysPresent + " out of " + totalWorkingDays);
    }
}

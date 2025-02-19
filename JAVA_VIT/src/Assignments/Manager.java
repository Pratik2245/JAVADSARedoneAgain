package Assignments;

public class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String empName, String empId, String position, int daysPresent, String teamName, String managerName, double basicSalary, double bonusPercentage) {
        super(empName, empId, position, daysPresent, teamName, managerName, basicSalary);
        this.bonusPercentage = bonusPercentage;
    }

    Manager(){
        bonusPercentage=0.0;
        System.out.println("Data Initialised Successfully");
    }
    public double calculateBonus() {
        return(bonusPercentage / 100) * basicSalary;
    }

    @Override
    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double bonus = calculateBonus();
        double taxableIncome = grossSalary + bonus;
        double tax = calculateTax(taxableIncome);
        return taxableIncome - tax;
    }

    public void displayDetails() {
        super.displayEmployeeData();
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
    }

    public double calculateTeamMemberNetSalary(Employee teamMember) {
        double memberGross = teamMember.calculateGrossSalary();
        double bonus = (bonusPercentage / 100) * teamMember.basicSalary;
        double taxableIncome = memberGross + bonus;
        double tax = teamMember.calculateTax(taxableIncome);
        return taxableIncome - tax;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }
}

package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

interface Cleaner{
    default void statusReport(String s){
        System.out.println("Cleaner status: "+s);
    }
    void startCleaning();
}

interface SecurityBot{
    default void statusReport(String s){
        System.out.println("SecurityBot status: "+s);
    }
    void scanForVirus();
}
interface Checking{
    void selfCheck();
}

public class MultiFunctionRobot implements Cleaner,SecurityBot,Checking {
    private int batterylevel = 100;
    private String id;
    private List<String> taskLog=new ArrayList<>();

    //    giving id to the multifunctional robot
    MultiFunctionRobot(String id) {
        this.id = id;
    }

    public void startCleaning() {
        if (batterylevel >= 20) {
            System.out.println("MultiFunctionRobot is cleaning the house...");
            batterylevel -= 30;
        } else {
            System.out.println();
        }
    }

    public void scanForVirus() {
        if (batterylevel >= 20) {
            System.out.println("Low battery. Cannot clean.");
            batterylevel -= 40;
        } else {
            System.out.println("Low battery. Cannot scan.");
        }
    }

    @Override
    public void statusReport(String s) {
        System.out.println("############################  STATUS  ############################");
        System.out.println("Robot ID: " + id);
        System.out.println(s);
        Cleaner.super.statusReport("All rooms cleaned.");
        SecurityBot.super.statusReport("All areas secure.");
    }

    //     self check Method
    @Override
    public void selfCheck() {
        System.out.println("Running self diagnostics...");
        System.out.println(" Motors  Sensors  Battery  Virus Scanner OK");
        System.out.println("Self-check completed.");
    }

    //    charge battery
    public void chargeBattery() {
        batterylevel = 100;
        System.out.println("Battery fully charged.");
    }

    //    check battery level
    public void checkBattery() {
        System.out.println("Battery level: " + batterylevel + "%");
    }

    public void logTask(String task) {
        taskLog.add(task);
    }

    public static void main(String[] args) {
        MultiFunctionRobot robot = new MultiFunctionRobot("RBT-X2025");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n========== ROBOT MENU ==========");
            System.out.println("1. Start Cleaning");
            System.out.println("2. Scan for Virus");
            System.out.println("3. Status Report");
            System.out.println("4. Charge Battery");
            System.out.println("5. Check Battery");
            System.out.println("6. Run Self Diagnostics");
            System.out.println("7. Show Task Logs");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    robot.startCleaning();
                    break;
                case 2:
                    robot.scanForVirus();
                    break;
                case 3:
                    robot.statusReport("Reports from the robot");
                    break;
                case 4:
                    robot.chargeBattery();
                    break;
                case 5:
                    robot.checkBattery();
                    break;
                case 6:
                    robot.selfCheck();
                    break;
                case 7:
                    exit(0);

            }
        }while (choice!=6);

    }
}
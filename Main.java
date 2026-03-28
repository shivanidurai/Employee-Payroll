import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();
        
        System.out.println("Welcome to the Employee Payroll System!");
        
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String ftName = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        int ftId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Monthly Salary: ");
                        double ftSalary = Double.parseDouble(scanner.nextLine());
                        
                        FullTimeEmployee ftEmployee = new FullTimeEmployee(ftName, ftId, ftSalary);
                        payrollSystem.addEmployee(ftEmployee);
                        break;
                        
                    case 2:
                        System.out.print("Enter Name: ");
                        String ptName = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        int ptId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Hours Worked: ");
                        int hoursWorked = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Hourly Rate: ");
                        double hourlyRate = Double.parseDouble(scanner.nextLine());
                        
                        PartTimeEmployee ptEmployee = new PartTimeEmployee(ptName, ptId, hoursWorked, hourlyRate);
                        payrollSystem.addEmployee(ptEmployee);
                        break;
                        
                    case 3:
                        System.out.print("Enter Employee ID to remove: ");
                        int removeId = Integer.parseInt(scanner.nextLine());
                        payrollSystem.removeEmployee(removeId);
                        break;
                        
                    case 4:
                        payrollSystem.displayAllEmployees();
                        break;
                        
                    case 5:
                        System.out.println("Exiting the Payroll System. Goodbye!");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println("Invalid choice. Please pick a number between 1 and 5.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number format entered. Please try the operation again.");
            }
        }
    }
}

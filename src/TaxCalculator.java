//Import Java utils
import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) throws Exception {

        //Create scanner which is an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);

        //Get Staff Name
        /*System.out.print("Enter Staff Name: ");
        String name = scanner.nextLine();*/

        //Get Staff Salary
        System.out.print("Enter Staff Salary: $");
        double salary = scanner.nextDouble();

        //Close scanner
        scanner.close();

        //Calculate Tax
        double tax = 0;
        String classType;
        if (salary <= 10000) {
            tax = 0;
            classType = "Lower Class";
        } else if (salary > 10000 && salary <= 50000) {
            tax = (salary - (salary * 0.1)) * 0.05;
            classType = "Prospective Class";
        } else if (salary > 50000 && salary <= 100000) {
            tax = (salary - (salary * 0.2)) * 0.075;
            classType = "Middle Class";
        }else{
            tax = (salary - (salary * 0.5)) * 0.1;
            classType = "Upper Class";
        }

        //System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary); 
        System.out.println("");
        System.out.println("Tax amount: $" + tax); 
        System.out.println("Tax Bracket: " + (classType));
        System.out.println("");
        System.out.println("Net Salary: $" + (salary - tax)); 
    }
}

//Import Java utils
import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) throws Exception {

        //Create scanner which is an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);
        boolean runAgain = true;
        while(runAgain){
            //Get Staff Name
            System.out.print("Enter Staff Name: ");
            String name = scanner.nextLine();

            //Get Staff Salary
            System.out.print("Enter Staff Salary: $");
            int salary = scanner.nextInt();
            scanner.nextLine(); //Consume newline left-over
            System.out.println("");

            

            //Calculate Tax
            double tax = 0;
            String classType;
            float taxPercent = 0;
            if (salary <= 10000) {
                tax = 0;
                classType = "Lower Class";
            } else if (salary > 10000 && salary <= 50000) {
                tax = (salary - (salary * 0.1)) * 0.05;
                classType = "Prospect Class";
            } else if (salary > 50000 && salary <= 100000) {
                tax = (salary - (salary * 0.2)) * 0.075;
                classType = "Middle Class";
            }else{
                tax = (salary - (salary * 0.3)) * 0.1;
                classType = "Upper Class";
            }
            taxPercent = (float)(tax / salary) * 100;

            //Print Tax Breakdown
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %15s | %15s | %15s | %15s | %15s | %15s |\n",   "Name", "Gross Salary", "Tax", "Tax %", "Net Salary", "Class");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %15s | %15s | %15s | %15s | %15s | %15s |\n",   name, "$"+salary, "$"+tax, taxPercent+"%", "$"+(salary - tax), classType);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Tax Breakdown: Hello " + name + " your Tax is $" + tax + " which is " + taxPercent + "% of your Gross Salary - $" + salary);

            System.out.println("");


            System.out.print("Do you want to check for another staff? Y/N: ");
            String response = scanner.nextLine().toUpperCase();

            if(!response.equals("Y")){
                System.out.print("Thank you for using the Tax Calculator Service. This terminal will now be closed. ");
                runAgain = false;
            }
            //System.out.println(runAgain);

        }   
        //Close scanner
        scanner.close();   
    }
}

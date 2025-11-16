import java.util.Scanner;

public class mortgagecal {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("#--------Welcome to Mortgage calculator-------#");
        Scanner scan = new Scanner(System.in);

        int credit_score = 0;
        double salary = 0;
        double loan = 0;
        double month = 0;
        double r = 0;
         int n = 0;
        double Mortgage = 0;
        boolean criminal = false;

        while (true) {

    
            System.out.print("Enter your credit score (0-500) 300 is the least catagory: ");
            while (!scan.hasNextInt()) 
            {
                System.out.println("Invalid input! Please enter a numeric value for credit score:");
                scan.next();
            }
            credit_score = scan.nextInt();

            if (credit_score < 300 || credit_score > 500) {
                System.out.println("Invalid credit!!");
                break;
        } 
             else {
                System.out.println("Enter your salary: ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a numerical value for salary:");
                    scan.next();
                 }
                salary = scan.nextDouble();
                System.out.println("Did you have any criminal record? (YES/NO): ");
                String value = scan.next().toUpperCase();

                if (value.equals("YES")) {
                    criminal = true;
                } else if(value.equals("NO")) {
                    criminal = false;
                }else{
                    System.out.println("Invalid instruction pls provide YES/NO");
                }

                if (credit_score>= 300 && !criminal) {
                    System.out.println("You are eligible for the loan!");
                    System.out.print("Loan Amount: ");
                    loan = scan.nextDouble();

                    if (loan >= (2 * salary)) {
                        System.out.println("You are not eligible for loan!");
                    } else {
                        System.out.print("What will be the tenure (months): ");
                        n = scan.nextInt();
                        System.out.print("How much interest rate: ");
                        month = scan.nextDouble();
                        r = month / (100 * 12);
                        Mortgage=(loan*r*Math.pow((1+r),n))/((Math.pow((1+r),n))-1);
                        System.out.println("Your monthly EMI is: " + Mortgage);
                        break;
                    }
                }
                else {
                    System.out.println("You are not eligible for the loan!!");
                    break;
                }

            }

        }
    }
}

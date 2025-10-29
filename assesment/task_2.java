import java.util.Scanner;
public class task_2 {
    public static void main(String[] args)
    {
        System.out.println("Please Enter the price of the product: ");
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        if (price>250)
        {
            System.out.println("You get 15% discount.");
            price = price-(price*15)/100;
            System.out.println("discount price is. "+price);

        }
        else System.out.println("You dont get any discount. Your total price is "+price);


    }
}

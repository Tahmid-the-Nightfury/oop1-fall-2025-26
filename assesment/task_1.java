import java.util.Scanner;
public class task_1{
    public static void main(String[] args)
    {
    System.out.println("take 3 number");
    Scanner scan = new Scanner(System.in);
    double first = scan.nextDouble();
    double second = scan.nextDouble();
    double third = scan.nextDouble();
    System.out.println("average of three number: ");
    System.out.println((first+second+third)/3);


    }
}
import java.util.Scanner;

public class task_3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Celcius to Farenhite\n enter the celcius: ");
        double celcius = scan.nextDouble();
        double Farenhite= (celcius*(9/5)+32);
        System.out.println("farenhite: "+Farenhite);
    }
    
}

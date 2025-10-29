public class task_4 {
    public static void main(String[] args) {
        System.out.println("Before swap: ");
        double a= 12;
        double b=11;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("after swap: ");
        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}

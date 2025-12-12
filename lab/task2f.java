
public class task2f {
    public static void main(String[] args) {
    Company  e = new Company("AIUB", 3);
    e.addEmployee(new Employee("Tahmid",new Position("100000", "AGM")));
    e.addEmployee(new Employee("abdullah",new Position("980000", "GM")));
    e.addEmployee(new Employee("syeda",new Position("120000", "CEO")));
    e.display();
    System.out.println();
    }
}

class Position {
    
    private String salary;
    private String tittle;

    public  Position(String salary, String tittle) {
        this.salary = salary;
        this.tittle = tittle;
    }

    public String toString(){
        return tittle+", salary: "+salary;
    }
}
class Employee {
    private String name;
    private Position position;
    public Employee(String name, Position position)
    {
        this.name = name;
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public Position gePosition()
    {
        return position;
    }

    
}
class Company{
    private String companyname;
    private Employee[] e;
    private int count = 0;
    public Company(String companyname, int numberofemployee)
    {
        this.companyname = companyname;
        this.e = new Employee[numberofemployee];

    }
    public void addEmployee(Employee employee)
    {
        if (e.length > count){
            e[count] = employee;
            count ++;
        }
        else {
            System.out.println("cant add more!!");
        }
    }
    public void display(){
        System.out.println("Company name: " + companyname);
        System.out.println("Employee: ");
        for (int i=0; i<count; i++){
            System.out.println(e[i].getName());
            System.out.println("Position: "+e[i].gePosition());
        }
    }
}
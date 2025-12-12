
public class task1f {
    public static void main(String[] args) {
    school s = new school("AIUB", 3);
    s.addStudent(new Student("Tahmid",new contact("01776867958", "admfardin@gmail.com")));
    s.addStudent(new Student("Fardin",new contact("123456", "fardin@yahoo.com")));
    s.addStudent(new Student("syeda",new contact("0129391284", "syeda@syeda.com")));
    s.display();
    System.out.println();
    }
}
class contact {
    private String phone;
    private String email;
    public contact(String phone, String email){
        this.phone = phone;
        this.email = email;
    }
    public String toString(){
        return phone+ " ,"+email ;
    }
    
}

class Student {
    
    private String name;
    private contact contact;

    public  Student(String name, contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getname() {
        return name;
    }
    public contact getcontac()
    {
        return contact;
    }
}
class school{
    private String schoolName;
    private Student[] s;
    private int count = 0;
    public school(String schoolName, int numberofstudents)
    {
        this.schoolName= schoolName;
        this.s = new Student[numberofstudents];

    }
    public void addStudent(Student student)
    {
        if (s.length > count){
            s[count] = student;
            count ++;
        }
        else {
            System.out.println("cant add more!!");
        }
    }
    public void display(){
        System.out.println("School name: " + schoolName);
        System.out.println("Students: ");
        for (int i=0; i<count; i++){
            System.out.println(s[i].getname());
            System.out.println("contact details: "+s[i].getcontac());
        }
    }
}
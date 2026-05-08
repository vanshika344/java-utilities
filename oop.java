
class employee{
    int id;
    String name;
    int salary;
public void printdetails(){
System.out.println("my id is " + id);
System.out.println("my name is " + name);
System.out.println("my salary is " + salary);
    }
}

public class oop {
    public static void main(String[] args) {
    System.out.println("this is our custom class");   
    employee vanshi = new employee();
    vanshi.id = 1;
    vanshi.salary= 500000; 
    vanshi.name = "Vanshi";
    //System.out.println(vanshi.id);
   // System.out.println(vanshi.name);
    vanshi.printdetails();

    }
}


    class MyMainEmployee{
         int id;
         String name;
         MyMainEmployee(){ //this is a constructor, it is a special method that is called when an object of the class is created. It is used to initialize the object. It has the same name as the class and does not have a return type.
            id = 4;
            name = "vanshi";
        }
        public void setname(String n){
            name =n;
        }
        public String getname(){
            return name;
        }
        public void setid(int i){
            id = i;
        }
        public int getid(){
            return id;
        }
    }
    public class constructors {
public static void main(String[] args) {
    MyMainEmployee vanshi = new MyMainEmployee();
    //vanshi.setid(56); //using the setter method to set the value of id
    //vanshi.setname("Vanshi"); //using the setter method to set the value of name
    System.out.println(vanshi.getid()); //using the getter method to get the value of id
    System.out.println(vanshi.getname()); //using the getter method to get the value of name
 MyMainEmployee swiss = new MyMainEmployee();
    swiss.setid(56); //using the setter method to set the value of id
    swiss.setname("Swiss"); //using the setter method to set the value of name
    System.out.println(swiss.getid()); //using the getter method to get the value of id
    System.out.println(swiss.getname()); //using the getter method to get the value of name


}

}

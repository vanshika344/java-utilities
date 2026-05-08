class MyEmployee{
    private int id;
   private String name;
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


public class accesmodifiers {
    public static void main(String[] args) {
        MyEmployee vanshi = new MyEmployee();
        //vanshi.id = 1;//this will give an error because id is private and cannot be accessed directly
       // vanshi.name = "Vanshi";//this will also give an error because name is private and cannot be accessed directly
            vanshi.setid(56); //using the setter method to set the value of id
            vanshi.setname("Vanshi"); //using the setter method to set the value of name
            System.out.println(vanshi.getid()); //using the getter method to get the value of id
            System.out.println(vanshi.getname()); //using the getter method to get the value of name
        }

}

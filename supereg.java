public class supereg {
    public static void main(String[] args) {
        // super refers to the parent class (subclass <-- superclass)
        // used in constructors to call the constructor of the parent class
        person person = new person("tom", "jerry");
        student student = new student("vanshi", "nanwani", 9.9);
        student.showname();
    }
}

public class inheritance {
    // inheritance = one class acquires the properties of another class
    //child <-- parent<-- grandparent
    public static void main(String[] args) {
        dog dog = new dog();
        cat cat = new cat();

        //dog.eat();
        //cat.eat();

        System.out.println("Dog has " + dog.lives + " life");
        System.out.println("Cat has " + cat.lives + " lives");
        dog.speak();
        cat.speak();
    }
}

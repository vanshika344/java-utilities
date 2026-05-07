public class methods {

    /*static int logic (int x, int y){ //static is used to call the method without creating an object of the class
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = logic(a,b);
        System.out.println(c);
    }*/

//calling a method is done by using the method name followed by parentheses. If the method has parameters, you need to pass the appropriate arguments within the parentheses. In this example, we call the `logic` method with `a` and `b` as arguments, and it returns the result which is stored in variable `c`. Finally, we print the value of `c`.
    int logic (int x, int y){ //non-static method requires an object to call it
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        methods obj = new methods(); //creating an object of the class to call the non-static method
        int c;
        c = obj.logic(5,10); //calling the non-static method using the object
        System.out.println(c);
    }

}

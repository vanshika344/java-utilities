public class methodsoverloading {
    /**static void telljoke(){
        System.out.println("I invented a new word! Plagiarism!");
    }
    static void telljoke(String name){
        System.out.println(name + " invented a new word! Plagiarism!");
    }**/

      /*  static void change (int a){
            a = 98;
        }
        
        static void change2 (int []arr){
            arr[0] = 98;
        }
    public static void main (String[] args){
        int[]marks={45,67,55,56};
        /*changing the integer
        int x =45;
        change(x);
        System.out.println(x);*/
        //changing the array
        /*change2(marks);
        System.out.println(marks[0]);*/
//array got changed because when we pass an array to a method, we are passing the reference of the array. So, when we change the value of the array in the method, it changes the original array as well. In this case, we changed the first element of the array to 98, so when we print marks[0], it shows 98 instead of 45
    //method overloading is a feature in Java that allows you to have multiple methods with the same name but different parameters. This can be useful when you want to perform similar operations on different types of data or with different numbers of parameters. In the example above, we have two methods named `telljoke`, one that takes no parameters and another that takes a String parameter. Depending on how we call the method, the appropriate version will be executed.

    static void foo(){
        System.out.println("good morning bro");
    }
        static void foo(int a){
            System.out.println("good morning " + a + " bro");
        }

    public static void main(String[] args) {
        foo(); //calls the first method
        foo(5); //calls the second method
    }
    //arguments are actual values passed to the method when it is called.
}
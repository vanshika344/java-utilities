public class person {
    String first;
    String last;

    person(String first , String last){
this.first =first;
this.last = last;
    }
    void showname()
    {
        System.out.println("your name is" + " " + this.first + " " + this.last);

    }
}

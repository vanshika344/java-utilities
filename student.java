public class student extends person{
    double gpa;
    student(String first , String last , double gpa){
        super (first , last);
        this.gpa = gpa;
    }
    void showname(){
        super.showname();
        System.out.println("your gpa is" + " " + this.gpa);
    }
}

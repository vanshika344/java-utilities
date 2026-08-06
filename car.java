public class car{
    String name;
    int model;

    car( String name , int model){
        this.name = name;
        this.model = model;
    }
    void drive()
    {
        System.out.println("you drive the" + " " + this.name +" " + "model" + " " + this.model);
    }
}

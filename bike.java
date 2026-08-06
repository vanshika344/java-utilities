public class bike {
    String make;
    String model;
    bike(String make , String model){
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString(){
        return "the bike is of make" + " " + this.make + " " + "and model" + " " + this.model;
    }
}

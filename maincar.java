

public class maincar {
    public static void main(String[] args) {
      //  Car car1 = new car("mustang" ,2026);
        //car car2 = new car2 ("ford" ,2023);

        //car[] cars = {car1 , car2};

        car[] cars = {new car ("mustang" , 2026),
            new car ("ford" , 2023)};
        
            for (car car: cars){
                car.model = 2026;
            }
        for (car car : cars){
         car.drive();
        }
    }
    
}

public class array {
    public static void main(String[] args) {
        //class of 5 students
        //declaration and memory allocation of array
        int[]marks = new int [5];
        //initialization of array
        marks[0] = 90;
        marks[1]=98;
        marks[2] =70;
        marks[3] =60;
        marks[4] = 80;
        System.out.println(marks[3]);
        //declaration, memory allocation and initialization of array
        int[]marks2 = {90,98,70,60,80};
        System.out.println(marks2[4]);

        //length of array
        System.out.println(marks.length);
        System.out.println(marks2.length);

        //floating point array
        float[]marks3 = {90.5f,98.5f,70.5f,60.5f,80.5f};
        System.out.println(marks3[4]);

        //string array
        String []students = {"John","Alice","Bob","Charlie","David"};
        System.out.println(students[2]);

        //for loop
        for(int i=0; i<marks.length; i ++){
            System.out.println(marks[i]);
        }

        //inverse for loop
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        //for each loop
        for(int element:marks){
            System.out.println(element);
        }

    }

}

        
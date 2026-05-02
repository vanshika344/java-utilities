public class quesarray {
    public static void main(String[] args) {
        
    
    //1st ques
    float[] marks = {57.6f,55.5f,37.5f,55.8f};
   
    float sum = 0;
    for(float elements:marks){
        sum = sum +elements;

    }
    System.out.println("the value od sum is :"+ sum);

    //2nd 
    int[] marks2 = {4,5,6,7,7};
    int num = 9;
    boolean isInArray = false;
    for(int element:marks2){
        if(num==element){

            isInArray= true;
            break;


        }

    }
    if(isInArray){
        System.out.println("THE VALUE IS IN array");

    }
    else
        System.out.println("THE VALUE ISNT IN ARRAY");

    //3RD calculate the average marks of physics students
    int[] marksinphysics = {4,5,6,7,7};
    int sum2 =0;
    for(int element: marksinphysics){
        sum2 = sum2+element;

    }
    double average = sum2/ marksinphysics.length;
    System.out.println("the average  marks of physics student is :" + average)
    ;
//4th add two matrices
int[][] matrix1 =  {{}}

}

}
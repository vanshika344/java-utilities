public class vaargs {
    static int sum (int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 15));
        System.out.println(sum(5, 10, 15, 20));

    }

    
}

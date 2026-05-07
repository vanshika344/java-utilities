public class recursion {
    static int factorial(int n){
        //factorial(0)=1
        //factorial(n)=n*n-1*...1
        //factorial(N)=N*factorial(N-1)
        //factorial(5)= 5*4*3*2*1
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(factorial(x));
    }
}

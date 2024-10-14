public class function {
    public static void factorialOfN(int n){
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        int a=6;
        factorialOfN(a);
    }
}

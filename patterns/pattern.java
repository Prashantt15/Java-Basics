import java.util.*;
class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int a=sc.nextInt();
        System.out.println("enter columns");
        int b=sc.nextInt();
        for(int i=0; i<=a; i++){
            for(int j=0; j<=a; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
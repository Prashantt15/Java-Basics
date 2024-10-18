import java.util.*;
public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=(x+y)*2;
        }else{
            System.out.println("the sum of both numbers are:");
            z=x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c;
        c=logic(a,b);
        System.out.println(c);
    }
}

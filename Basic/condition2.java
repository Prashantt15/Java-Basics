import java.util.*;
public class condition2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter first number");
        // int a=sc.nextInt();
        // System.out.println("enter second number");
        // int b=sc.nextInt();
        // if(a==b){
        //     System.out.println("both number are equals");
        // }
        // else if(a>b){
        //     System.out.println("first number is greater");
        // }
        // else{
        //     System.out.println("second number is greater");
        // }
        int button=sc.nextInt();
        switch(button){
            case 1: System.out.println("first bol");
            break;
            case 2:System.out.println("second maloom kya");
            break;
            case 3:System.out.println("third bolna pdta");
            break;
            default:System.out.println("bol kya baat h");
            break;
        }
    }
}
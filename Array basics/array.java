import java.util.*;
public class array {
    public static void main(String[] args) {
        // create an array of 5 float and calculate their sum
        // float[] arr= {24.5f, 38.0f, 67.5f, 76.5f, 36.0f};
        // float sum=0;
        // for(int i=0; i<arr.length; i++){
        //     sum+=arr[i];
        // }
        // System.out.println("the sum of arrays elements are:"+sum);
        Scanner in=new Scanner (System.in);
        System.out.println("enter the length of an array:");
        int a=in.nextInt();
        int[] arr=new int[a];
        System.out.println(arr.length);
        System.out.println("Enter element values of an array:");
        for(int i=0; i<arr.length; i++){
            int element=in.nextInt();
            arr[i]=element;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}

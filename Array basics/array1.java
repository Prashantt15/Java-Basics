import java.util.*;
public class array1 {
    public static void main(String[] args) {

        int[] arr={34, 44, 54, 64, 74, 84};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter element");
        int target=in.nextInt();
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                System.out.println("this element present in array at the index of "+i);
                break;
            }
        }
    }
}

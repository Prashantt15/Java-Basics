public class array3 {
    public static void main(String[] args) {
        // find minimum and maximum element in an array
        int[] arr={65, 599, 45, 35, 25, 988, 76, 864};
        int num=Integer.MAX_VALUE;
        // int num=0;
        // for(int i=0; i<arr.length; i++){
        //     if(num<arr[i]){
        //         num=arr[i];
        //     }
        // }
        // System.out.print(num+"\n");
        for(int i=0; i<arr.length; i++){
            if(num>arr[i]){
                num=arr[i];
            }
        }
        System.out.print(num);
    }
}

public class array4 {
    public static void main(String[] args) {
    // program for check array is sorted or not.
        boolean sorted=true;
        int[] arr={25, 35, 45, 55, 65, 75};
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                sorted=false;
            }
        }
        if(sorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}

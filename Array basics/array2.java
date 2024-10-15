public class array2 {
    public static void main(String[] args) {
        // Program to reverse an array
        int[] arr={24, 34, 44, 54, 64};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<n; i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int i=0; i<l; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

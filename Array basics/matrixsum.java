import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int[][] matrix1=new int[2][3];
      System.out.println("enter matrix1 elements:-");
      for(int i=0; i<matrix1.length; i++){
        for(int j=0; j<matrix1[i].length; j++){
          matrix1[i][j]=sc.nextInt();
        }
      }
      System.out.println("first matrix are:-");
      for(int i=0; i<matrix1.length; i++){
        for(int j=0; j<matrix1[i].length; j++){
          System.out.print(matrix1[i][j]+" ");
        }
        System.out.println();
      }
      int[][] matrix2=new int[2][3];
      System.out.println("enter matrix2 elements:-");
      for(int i=0; i<matrix2.length; i++){
        for(int j=0; j<matrix2[i].length; j++){
          matrix2[i][j]=sc.nextInt();
        }
      }
      System.out.println("second matrix are:-");
      for(int i=0; i<matrix2.length; i++){
        for(int j=0; j<matrix2[i].length; j++){
          System.out.print(matrix2[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println("the sum of both matrix are:-");
      int[][] matrix=new int[2][3];
      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
          matrix[i][j]=matrix1[i][j]+matrix2[i][j];
        }
      }
      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
  }
}

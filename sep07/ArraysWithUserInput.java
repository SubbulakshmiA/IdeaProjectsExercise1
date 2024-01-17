import java.util.Scanner;

public class ArraysWithUserInput {
    public static void main(String args[]){
        int size =0;
        System.out.println("enter size of the array");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        int[] arrays = new int[size];

        for(int i=0;i<arrays.length;i++){
          System.out.println("enter your array elements for index "+i);
            arrays[i] = in.nextInt();
        }
        for(int i=0;i<arrays.length;i++){
            System.out.print(" "+arrays[i]+" ");

        }
    }
}

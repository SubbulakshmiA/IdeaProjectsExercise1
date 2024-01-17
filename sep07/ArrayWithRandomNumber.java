import java.util.Random;
import java.util.Scanner;

public class ArrayWithRandomNumber {
    public static void main(String args[]){
        int size =0;
        System.out.println("enter size of the array");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        int[] arrays = new int[size];
        Random random = new Random();
        for(int i=0;i<arrays.length;i++){
            //randomly generating numbers upto 50 here
            arrays[i] = random.nextInt(500);
        }
        for(int i=0;i<arrays.length;i++){
            System.out.print(" "+arrays[i]+" ");

        }
    }
}

import java.util.Random;

public class ShufflingArray {
    public static void main(String args[]) {
        Random rand = new Random();
        int arr[] = {4, 8, 19, 10, 7};
        // Start from the last element and swap with a random element before it
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = rand.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[j];//j=3,i=2
            arr[j] = temp;
            System.out.println("j= "+j +" i= "+i +" arr  "+arr[i] );
        }
        for (int k =0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
    }
}

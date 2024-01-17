public class SumOfArray {
    public static void main(String args[]){
        int arrays[] = {3,5,6,8,9};
        int sum = 0;
        for(int i=0; i<=arrays.length-1;i++) {
           sum = sum+arrays[i];
        }
        System.out.println("sum "+sum);

    }

}

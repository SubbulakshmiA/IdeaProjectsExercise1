public class LargestNumberInArray {
    public static void main(String args[]){
        // finding largest number in an array and smallest index of largest number in the array
        int arrays[] = {3,10,5,6,8,9,10};
        int largest = arrays[0];
        int index = 0;
        for(int i=0; i<=arrays.length-1;i++) {
            if(largest<arrays[i]){
                largest = arrays[i];
                index = i;
            }
        }
        System.out.println("largest number in an array "+largest);
        System.out.println("index of largest number in an array "+index);

    }

}

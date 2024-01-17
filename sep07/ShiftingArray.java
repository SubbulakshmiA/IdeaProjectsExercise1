public class ShiftingArray {
    public static void main(String args[]) {
        int arrays[] = {3,5,6,8,9};
        int tempLeft = arrays[0];
        int tempRight = arrays[arrays.length-1]; //lenght =5 //9
        System.out.println("tempRight "+tempRight);

//right shift
        for(int i=arrays.length-1; i>0;i--){ //i=4
            arrays[i] = arrays[i-1];
            System.out.println("i "+i +" arr "+arrays[i]+" ");

        }
        arrays[0]= tempRight;
        for(int i=0; i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }

        // left shift
        for(int i=0; i<arrays.length-1;i++){
            arrays[i] = arrays[i+1];
        }
        arrays[arrays.length-1]= tempLeft;
        for(int i=0; i<arrays.length;i++){
                    System.out.print(arrays[i]+" ");
        }
    }
}

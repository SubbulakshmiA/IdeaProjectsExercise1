import java.util.Scanner;

public class FindingPrimeNumbers {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//       int num = in.nextInt();
       int number = 2;
       int count = 0;
     //  isPrime(num);
        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    // Start a new line after printing 10 numbers
                    System.out.println();
                }
            }
            number++;
        }
        System.out.println("Please enter the number to find prime or not : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isPrime(num)) {
            System.out.println(num +" is a prime number");
        }else {
            System.out.println(num +" is not a prime number");
        }

    }
    public static boolean isPrime(int num){
        if(num>1) {
            for(int i=2;i<num;i++){
            if (num % i == 0) {
                return false;
            }
            }
        }
        return true;

    }
}

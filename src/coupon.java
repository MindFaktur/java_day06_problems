import java.util.Scanner;
import java.util.Arrays;

public class coupon {
    public static void main(String[] args) {
        System.out.println(" Program to find number of random number need to generate the given number");
        System.out.println(" enter your number ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int array[] = new int[num];
        int decision = 0, totalRandomNumbers = 0, count = 0;
        Arrays.fill(array,1);

        while ( count < num ){
            int a = (int)(Math.random() * 10 % 10 );
            for ( int i = 0; i < count; i++ ){
                if ( array[i] == a){
                    decision = 1;
                    break;
                }
            }
            if ( decision == 0 ){
                array[count++] = a;
            }
            decision = 0;

            totalRandomNumbers++;
        }
        for ( int j = 0; j < array.length; j++ ){
            System.out.println(array[j]);
        }
        System.out.println(" Total random numbers needed " + totalRandomNumbers);
    }
}

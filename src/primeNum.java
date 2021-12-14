import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        System.out.println(" This program prints all prime numbers before a given number ");
        System.out.println(" Enter the number ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        for ( int i = 2; i < num; i++ ){
            int decision = 0; // zero is prime & 1 is not-prime
            for ( int j = 2; j < i; j++ ){
                if ( i % j == 0){
                    decision = 1;
                }
            }
            if ( decision == 0 ){
                System.out.println(i + " is a prime number");
            }
        }
    }
}

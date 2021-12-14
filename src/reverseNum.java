import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        System.out.println(" This is a program to reverse a number ");
        System.out.println(" Enter the number to be reversed ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int remainder, reverseNumber = 0;

        while ( num != 0 ){
            remainder = num%10;
            reverseNumber = ((reverseNumber * 10) + (remainder));
            num = num / 10;
        }
        System.out.println(" Reversed number is " + reverseNumber);
    }
}

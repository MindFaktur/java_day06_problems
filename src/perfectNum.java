import java.util.Scanner;

public class perfectNum {
    static int num;
    public static void main(String[] args) {
        System.out.println(" Enter a number to find perfect numbers before it ");
        Scanner obj  = new Scanner(System.in);
        num = obj.nextInt();
        for ( int j = 1; j <= num; j++ ){
            perfectNumFinder(j);
        }
    }
    public static void perfectNumFinder(int n){
        int final_value = 0;
        for ( int i = 1; i < n; i++ ){
            if ( n%i == 0 ){
                final_value += i;
            }
        }
        if ( final_value == n ){
            System.out.println(n + " is a perfect number ");
        }
    }
}

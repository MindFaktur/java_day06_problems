import java.util.Scanner;
public class fibSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int previous = 0, current = 1, temp;
        System.out.print(" Please enter the number of values to print: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                System.out.println(i);
                continue;
            }

            temp = current;
            current += previous;
            previous = temp;

            System.out.println(current);
        }
        scan.close();
    }

}

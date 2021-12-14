
import java.util.Scanner;

public class stopWatch {
    public static void main(String[] args) {
        System.out.println(" Press 1 to start the stopwatch ");
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        double startTime = 0;
        int stop = 0;

        if ( start == 1) {
            startTime = System.nanoTime();
            System.out.println("press 2 to stop ");
        }
        stop = obj.nextInt();
        if( stop == 2){
            double stopTime = System.nanoTime();
            System.out.println(" Time between start and stop is " + ((stopTime-startTime)*Math.pow(10,-9)) + " seconds");
        }


    }
}

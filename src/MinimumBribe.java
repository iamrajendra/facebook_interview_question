import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.max;


public class MinimumBribe {
    static void minimumBribes(int[] queue) {
        boolean chaotic = false;
        int bribes = 0;
        int temp;
        for (int i = 0; i < queue.length; i++) {

            if (queue[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int  j =  max(0,queue[i]-2); j < i; j++) {
                if (queue[j] > queue[i]) {
                    bribes++;
                    temp  = queue[j];
                    queue[j] = queue[i] ;
                    queue[i] = temp;

                    }
            }

        }
         if (bribes!=0)  System.out.println(bribes);

    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

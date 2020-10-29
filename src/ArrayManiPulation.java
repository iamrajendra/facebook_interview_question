import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class ArrayManiPulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] compute = new int[n];
        int a, b, k;
        int max = 0;
        for (int i = 0; i < queries.length; i++) {
//            because array start from  position zero
            a = queries[i][0]-1;
            b = queries[i][1]-1;
            k = queries[i][2];

//            add the  value of K from a to b
            for (int j = a; j <=b; j++) {
                compute[j] = compute[j]+k;
            }


        }
//        after the compute find the max number
        for (int i = 0; i < compute.length; i++) {
            max  = max(max,compute[i]);
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}

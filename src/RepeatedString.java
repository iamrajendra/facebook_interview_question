import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String string, long n) {
     char target ='a';
     long totalPartition  = (n/string.length());
     int remainderPartition = (int) (n%string.length());
     int targetOccurrence  = 0;
        for (int i = 0; i < string.toCharArray().length; i++) {
            char source  = string.toCharArray()[i];
            if (source == target)
                targetOccurrence++;

        }
        long  totalOccurrence = totalPartition * targetOccurrence;
        if (remainderPartition==0){
            return  totalOccurrence;
        }else {
            String restString  = string.substring(0,remainderPartition);
            char []restArray  = restString.toCharArray();

            for (int i = 0; i < restArray.length; i++) {

                int source  = restArray[i];

                if (source == target){
                    totalOccurrence++;
                }
            }
        }
return totalOccurrence;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);



        scanner.close();
    }
}

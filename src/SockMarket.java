import java.io.IOException;
import java.util.*;

public class SockMarket {


    static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors
                = new HashSet<Integer>();
        int pairs = 0;
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {

            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            }else {
               pairs++;
               colors.remove(ar[i]);
            }

        }


        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}

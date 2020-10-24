import javafx.css.StyleConverter;

import java.util.*;

public class AnagramProblem {
    public static void main(String[] args) {
        String[] inputString = new String[]{
                "star",
                "rats",
                "car",
                "arc",
                "arts",
                "stars"};
        Map<String, List<String>> bucket = new HashMap<>();

        for (int i = 0; i < inputString.length; i++) {
            String sortedStringI = sortString(inputString[i]);
            List<String> p = new ArrayList<>();

            bucket.put(sortedStringI, p);
            bucket.get(sortedStringI).add(inputString[i]);
            for (int j = 0 + 1; j < i; j++) {

                String sortedStringJ = sortString(inputString[j]);

                if (sortedStringI.equals(sortedStringJ)) {
                    bucket.get(sortedStringI).add(inputString[j]);
                }


            }

        }

        System.out.println(bucket.values());


    }

    private static String sortString(String s) {
        char[] fchar = s.toCharArray();
        Arrays.sort(fchar);
        return String.valueOf(fchar);

    }

}


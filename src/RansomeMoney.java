import java.util.*;

public class RansomeMoney {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        Map<String, Integer> noteMap = new HashMap<String, Integer>();
        boolean yes =false;
        boolean no =false;


// map all the magazine words
        for (int i = 0; i < magazine.length; i++) {
            if (magazineMap.containsKey(magazine[i])){
                magazineMap.put(magazine[i],magazineMap.get(magazine[i])+1);
            }else {
                magazineMap.put(magazine[i],1);
            }
        }
// map all the note words
        for (int i = 0; i < note.length; i++) {
            if (noteMap.containsKey(note[i])){
                noteMap.put(note[i],noteMap.get(note[i])+1);
            }else {
                noteMap.put(note[i],1);
            }
        }
// it calculate all the entries present in the Magazine map are present in noteMap or not and It make  sure all the entries present in the noteMap are not repeated
        for (String magazineKey :magazineMap.keySet()) {
            if (noteMap.containsKey(magazineKey)) {
                yes = true;

            } int needed = noteMap.containsKey(magazineKey)?noteMap.get(magazineKey):0;
            if (magazineMap.get(magazineKey) < needed){
                no = true;
            }else
             {
                yes = true;


            }


        }

// it checks if the entries present in noteMap is present in Magazine Map
        for (String noteKey : noteMap.keySet() ){
            if (!magazineMap.containsKey(noteKey)){
                no =true;
            }

        }

        System.out.println(yes?no?"No":"Yes":"No");







    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

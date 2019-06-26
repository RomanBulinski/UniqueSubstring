import java.util.*;

public class Main {


    static int longestSubstring(String a, String b) {

        System.out.println(a);
        System.out.println(b);

        String[] aletters = a.split("");
        Set<String> commonLetters = new HashSet();

        for (String letter : aletters) {
            if (b.contains(letter)) {
                commonLetters.add(letter);
            }
        }

        String twoWords = a.concat(b);
        for (String l : commonLetters) {
            if (l.equals("$")) {
                twoWords = twoWords.replaceAll("\\$", " ");
            }
            if (l.equals("[")) {
                twoWords = twoWords.replaceAll("\\[", " ");
            }else{
                twoWords = twoWords.replaceAll(l, " ");
            }
        }

        String[] shortWords = twoWords.split(" ");
        String result = "";
        for (String word : shortWords) {
            if(word.equals("\u0007")){
                word = word.replace("\u0007", "\\u0007");
            }
            if (word.length() > result.length()) {
                result = word;
            }
        }

        return result.length();

    }


}

import java.util.ArrayList;
import java.util.List;

public class Main {


    static int longestSubstring(String a, String b){

        String[] aletters = a.split("");
        List<String> commonLetters = new ArrayList();
        for(String letter : aletters){
            if(b.contains(letter)){
                commonLetters.add(letter);
            }
        }
        String twoWords = a.concat(b);
        for( String l : commonLetters){
            twoWords.replaceAll(l," ");
        }

        String[] shortWords = twoWords.split(" ");

        String result="";
        for( String word :  shortWords){
            if( word.length()>result.length()){
                result = word;
            }
        }
        return result.length();

    }


}

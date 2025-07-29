import com.anagram.anagram;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        anagram a = new anagram();
        HashMap<Character,Integer> str1 = a.charCount("cat");
        HashMap<Character,Integer> str2 = a.charCount("tac");


        System.out.println(str1.equals(str2));

    }
}

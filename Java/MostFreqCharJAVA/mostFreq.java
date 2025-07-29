import java.util.HashMap;

public class mostFreq {

   public mostFreq(){

    }

    public  char  mostFreqChar(String word){

      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      char most_frequent = '\0';

      for(char letter: word.toLowerCase().toCharArray()){
          map.putIfAbsent(letter, 0);
          map.put(letter,map.get(letter)+1);
      }

        for(char letter : word.toLowerCase().toCharArray()){

           if(most_frequent == '\0'||map.get(letter)>map.get(most_frequent)){
               most_frequent = letter;
           }
           else if (map.get(letter).equals(map.get(most_frequent))){
               continue;
           }
        }

      return most_frequent;

    }
}

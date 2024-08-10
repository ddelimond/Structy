package com.anagram;

import java.util.HashMap;


public class anagram {

    public anagram(){

    }

//    charcount method
    public HashMap<Character, Integer> charCount(String word){

//        creates a new hashmap that should be returned

        HashMap<Character, Integer>  map = new HashMap<Character, Integer> ();

//       for loop that loops through each letter in the provided string

        for(char letter : word.toCharArray()){

//            if  the has map does not have the specified letter in it yet it will make its value 0
            if(map.get(letter) == null){

                map.put(letter,0);
            }

//            if the letter is found in the map it will add 1 to the value stored for that letter
            map.put(letter, map.get(letter)+1);
        }
//        the final map of the string and its letter counts are returned
        return map;
    }

}

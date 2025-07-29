
//3n12e2z
//nnneeeeeeeeeeeezz

public class Uncompressed {

int start = 0;
int end = 0;
String nums = "0123456789";

String result = "";

String generate(String wrd){

    while(end < wrd.length()){

        String character = String.valueOf(wrd.charAt(end));

        boolean charIsNum = nums.contains(character);


        if(!charIsNum){

            int numberOfTimes = Integer.parseInt(wrd.substring(start,end));

            result += character.repeat(numberOfTimes);

            end++;

            start = end;
        }
        else{
            end++;
        }
    }

return result;
};



}

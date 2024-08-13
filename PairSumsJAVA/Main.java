import java.util.HashMap;
import java.util.List;



public class Main {

    private static List<Integer> pairSum(List<Integer> numbers,int target){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int compliment;

        for(int i =0; i<numbers.size(); i++){

            int num = numbers.get(i);
            compliment = target - num;

            if(hashMap.containsKey(compliment)){
                return List.of(i, hashMap.get(compliment));
            }
            hashMap.put(num,i);
        }
        return null;
    };


    public static void main (String[] args){


        System.out.println(pairSum(List.of(3, 2, 5, 4, 1), 8));

    }
}

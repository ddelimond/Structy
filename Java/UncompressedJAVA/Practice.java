import java.util.ArrayList;
import java.util.Arrays;

class Practice {
    public static void main(String[] args){


        int [] sampleArr = {1,3,6,4,5,2,7,8,9};


        for(int i = 0; i<sampleArr.length;i++){
            System.out.println(sampleArr[i]);
        }

        Arrays.sort(sampleArr);

        System.out.println("-----------------");

        for(int i = 0; i<sampleArr.length;i++){
            System.out.println(sampleArr[i]);
        }

        Uncompressed uncompressed = new Uncompressed();

        System.out.println(uncompressed.generate("3n12e2z"));

    }
}

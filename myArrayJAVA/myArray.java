public class myArray {

    private int[] arr;
    private int count;
    myArray( int length ){

     arr = new int[length];

    }

    public void print(){

        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

    }


    public void insert(int item ){

            if(arr.length == count){

                int[] newArr  = new int [count*2];

                for(int i=0 ; i < count ; i++){
                    newArr[i] = arr[i];
                }

                arr = newArr;

            }

            arr[count++] = item;

    }



    public void remove( ){

        if(arr.length == count){

            int[] newArr  = new int [count-1];

            for(int i=0 ; i < count-1 ; i++){
                newArr[i] = arr[i];
            }

            arr = newArr;

        }
        count = count-1;
    }
}

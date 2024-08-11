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



    public void removeAt( int index){

        if( index < 0 || index > count){
            throw new IllegalArgumentException();
        }

        for(int i = index; i < count; i++){

            arr[i] = arr[i+1];

            count--;
        }

    }

    public int indexOf( int item){

        for(int i = 0; i < count; i++)
            if(arr[i] ==  item)
                return i;

    return -1;
    }
}

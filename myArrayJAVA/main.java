public class main {
    public static void main(String[] args){

        myArray practice = new myArray(5);
        practice.insert(1);
        practice.insert(2);
        practice.insert(3);
        practice.insert(4);
        practice.insert(5);
        practice.print();
        practice.removeAt(3);
        System.out.println("------------");
        practice.print();
        System.out.println(practice.indexOf(2));

    }
}

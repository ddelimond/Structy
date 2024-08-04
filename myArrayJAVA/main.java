public class main {
    public static void main(String[] args){

        myArray practice = new myArray(5);
        practice.insert(1);
        practice.insert(2);
        practice.insert(3);
        practice.insert(4);
        practice.insert(5);
        practice.print();
        practice.remove();
        System.out.println("------------");
        practice.print();
        practice.remove();
        System.out.println("------------");
        practice.insert(100);
        practice.print();
    }
}

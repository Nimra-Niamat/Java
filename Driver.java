import java.util.ArrayList;

public class Driver {
    public static  void main(String[] args){
        MYArray arraylist = new MYArray();
        arraylist.insert(3);
        arraylist.insert(9);
        arraylist.insert(8);
        arraylist.insert(7);
        arraylist.insert(2);
        arraylist.insert(2);
        arraylist.insert(2);
        arraylist.insert(2);
        System.out.println(arraylist);
        arraylist.insert(1,5);
       // arraylist.insert(1,6);
        System.out.println(arraylist);
        System.out.println("searched the array");
        arraylist.search(2);
        System.out.println(arraylist);
        System.out.println("Delete the number");
        arraylist.delete(3);
        System.out.println(arraylist);
        System.out.println("update the array");
        arraylist.update(2,8);
        System.out.println(arraylist);
        ArrayList<Integer> arr = new ArrayList<>();




//        for (int i = 0; i < 14; i++) {
//            arraylist.insert(2 * i);
//        }
//
//        System.out.println(arraylist);
  }
}

import java.sql.SQLOutput;
import java.util.Arrays;



public class MYArray {
    private int[] data;
  //  private static int DEFAULT_SIZE = 10;
    private int size = 0;

public MYArray(){
this.data = new int[10];

}
    public void insert(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void insert(int index, int value) {


      if(index <0 || index >data.length){
          throw  new ArrayIndexOutOfBoundsException();
      }

             if (isFull()){
               resize();
                }


        for(int i= data.length-1;i> index ;i--) {

             data[i] =data[i-1];


        }

        data[index] =value;





    }

    public void update(int index, int value) {

    data[index] = value;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];


        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }



    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }
    public int removed() {
        int removed = data[--size];
        return removed;
    }

public void search(int num){
    int same =0;
   // boolean findnum = false;
    for(int i=0;i< data.length ;i++){
        if(data[i] ==num){
         //   findnum = true;
            same++;
        }

    }
    System.out.println("Number "+num+ "is found  "+same+ "times");

}
    public void delete(int index) {
        if (index < 0 || index > data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("Number  " + data[index] + " at index " +index + " is deleted");

        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];


        }

    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }





}

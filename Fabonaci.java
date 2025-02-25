import java.util.Scanner;

public class Fabonaci {
    //number = 0 ,1 =1+2=3
    public static void main(String[] args) {
    int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
      number =sc.nextInt();
     // fabo(number);

        for(int i=0;i<=number ;i++){
            System.out.println(fabo(i)+" ");

        }


    }
    public  static int fabo(int num ){
        if(num<=1) {
            return num;
        }
        return (num-1)+(num-2);
    }
}

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number,originalnumber ,raminder , result =0;
        int count =0;

        boolean length = false;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        originalnumber = number;
        while(originalnumber!= 0){
            originalnumber/=10;
            count++;
        }
        originalnumber =number;
        while(originalnumber!= 0){
            raminder = originalnumber%10;
            result+= Math.pow( raminder ,count);
            originalnumber/=10;

        }
      if(number==result){
          System.out.println("number is armstrong");
      } else {
          System.out.println("Number is not armStrong ");

      }
    }
    }




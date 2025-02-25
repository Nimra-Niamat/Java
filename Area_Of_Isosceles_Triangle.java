import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

      if(side<= base/2){
          System.out.println("Invalid side");
      }else {
          double area =0.5* (base * side);
          double height = Math.sqrt(Math.pow(side,2))-Math.sqrt(Math.pow(base/2,2));
          System.out.println("The area of the isosceles is "+area);
      }


   input.close();

    }


}

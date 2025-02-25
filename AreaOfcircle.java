import java.util.Scanner;

public class AreaOfcircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle is %.2f", area);
    }

}

package Day1;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangleArea(sc);
        triangleArea(sc);
        squareArea(sc);
        circleArea(sc);
    }
    
    public static void rectangleArea(Scanner sc){
        System.out.println("Enter the length of the rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int breadth = sc.nextInt();
    
        int area = length * breadth;
        System.out.println("Area of the rectangle is : " + area);
        
    }

    public static void triangleArea(Scanner sc){
        System.out.println("Enter the base of the triangle : ");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle : ");
        int height = sc.nextInt();

        float area = 0.5f * base * height;
        System.out.println("Area of the triangle is : " + area);
    }

    public static void squareArea(Scanner sc){
        System.out.println("Enter the side of the square : ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of the square is : " + area);
    }

    public static void circleArea(Scanner sc){
        System.out.println("Enter the radius of the circle : ");
        int radius = sc.nextInt();

        float area = 3.14f * radius * radius;
        System.out.println("Area of the circle is : " + area);
    }
}

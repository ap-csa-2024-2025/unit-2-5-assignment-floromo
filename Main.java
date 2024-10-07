import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    // ---------- Problem 1 ----------
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14);
    Circle circ3 = new Circle(20.5);
    System.out.println(circ1.toString() + "\n" + circ2.toString() + "\n" + circ3.toString());


    // ---------- Problem 2 ----------
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number for length and width: ");
    double lenWid = sc.nextDouble();
    System.out.println("Type a length: ");
    double len2 = sc.nextDouble();
    System.out.println("Type a width: ");
    double wid2 = sc.nextDouble();
    Rectangle rect1 = new Rectangle(lenWid);
    Rectangle rect2 = new Rectangle(len2, wid2);
    System.out.println(rect1.toString() + "\n" + rect2.toString());


    // ---------- Problem 3 ----------
    System.out.println("Type a side length: ");
    double sideLen = sc.nextDouble();
    RegularPolygon triangle = new RegularPolygon(3, sideLen);
    RegularPolygon square = new RegularPolygon(4, sideLen);
    System.out.println(triangle.toString() + "\n" + square.toString());
  }
}

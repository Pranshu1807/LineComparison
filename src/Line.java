import java.lang.Math;
import java.util.Scanner;

public class Line {
    int x1, y1, x2, y2;
    double length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("Enter the x coordinate of first point");
        x1 = Sc.nextInt();
        System.out.println("Enter the y coordinate of first point");
        y1 = Sc.nextInt();
        System.out.println("Enter the x coordinate of second point");
        x2 = Sc.nextInt();
        System.out.println("Enter the y coordinate of second point");
        y2 = Sc.nextInt();

        Line line1 = new Line(x1, y1, x2, y2);
        System.out.println("The length of the line is " + line1.length);
    }
}

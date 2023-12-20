import java.util.Scanner;

public class Line {
    int x1, y1, x2, y2;
    double Length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        Length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    public static void compareLines(Line L1, Line L2) {
        if (Double.compare(L1.Length, L2.Length) == 0)
            System.out.println("The Lines are Equal ");
        else if (Double.compare(L1.Length, L2.Length) > 0)
            System.out.println("First Line is greater than Second Line");
        else
            System.out.println("Second Line is greater than First Line");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4;
        System.out.println("Enter the x coordinate of first point");
        x1 = sc.nextInt();
        System.out.println("Enter the y coordinate of first point");
        y1 = sc.nextInt();
        System.out.println("Enter the x coordinate of second point");
        x2 = sc.nextInt();
        System.out.println("Enter the y coordinate of second point");
        y2 = sc.nextInt();
        Line Line1 = new Line(x1, y1, x2, y2);
        System.out.println("The Length of first line is " + Line1.Length);

        System.out.println("Enter the x coordinate of third point");
        x3 = sc.nextInt();
        System.out.println("Enter the y coordinate of third point");
        y3 = sc.nextInt();
        System.out.println("Enter the x coordinate of fourth point");
        x4 = sc.nextInt();
        System.out.println("Enter the y coordinate of fourth point");
        y4 = sc.nextInt();
        Line Line2 = new Line(x3, y3, x4, y4);
        System.out.println("The Length of first line is " + Line2.Length);

        compareLines(Line1, Line2);
    }
}

import java.util.Scanner;

public class ComparisonComputationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1_Axis;
        int x2_Axis;
        int y1_Axis;
        int y2_Axis;
        double Length_of_Line=0;
        System.out.println("Welcome User");
        System.out.println("Enter the X1 Axis=");
        x1_Axis=sc.nextInt();
        System.out.println("Enter the X2 Axis=");
        x2_Axis=sc.nextInt();
        System.out.println("Enter the Y1 Axis=");
        y1_Axis=sc.nextInt();
        System.out.println("Enter the Y2 Axis=");
        y2_Axis=sc.nextInt();
        Length_of_Line=Math.sqrt(Math.pow((x2_Axis-x1_Axis),2)+ Math.pow((y2_Axis-y1_Axis),2));
        System.out.println("Lenght of Line="+Length_of_Line);
    }
}

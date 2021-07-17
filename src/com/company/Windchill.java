import java.util.Scanner;

public class WindChill {
    public static double calculate (double t, double v) {
        if((t>0&&t<=50)&&(v>3&&v<120))
        {
            double w = 35.74 + 0.6215*t + (0.4275*t-35.75)* Math.pow(v,0.16);
            System.out.println("winidchill="+w);
        }

        else
        {
            System.out.println("invalid input");
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of T :- ");
        double t =scan.nextDouble();
        System.out.print("Enter the value of V :- ");
        double v =scan.nextDouble();
        calculate(t,v) ;


    }

}

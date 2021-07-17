import java.util.Scanner;
public class Quadratic {
    static void FindRoots(double a, double b, double c)
    {
        if (a == 0)
        {
            System.out.println("The value of 'a' cannot be 0.");
            return;
        }
        double delta = (b*b) - (4.0 * a *c) ;
        delta = Math.sqrt(delta);
        double Root1,Root2;
        Root1=( -b + delta) / (2.0 * a);
        Root2=( -b - delta) / (2.0 * a);
        if (delta>0.0)
        {
            System.out.println("Root 1 of x is "+Root1 +" && " + "Root 2 of x is "+Root2);
        }
        else if (delta ==0.0)
        {
            System.out.println("The root is " + Root1);
        }
        else
        {
            System.out.println("Roots are not real");
        }

    }



    public static void main(String[] args)
    {
        Scanner scan = new  Scanner(System.in);

        System.out.println("Enter the value of a :");
        double a =scan.nextInt();

        System.out.println("Enter the value of b :");
        double b =scan.nextInt();
        System.out.println("Enter the value of c :");
        double c =scan.nextInt();

        FindRoots(a, b, c);

    }



}
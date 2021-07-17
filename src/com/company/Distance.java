import java.util.Scanner;
public class Distance {
    public static double distance (int x, int y) {

        double result1 = Math.pow(x,2);
        double result2 = Math.pow(y,2);
        double result = Math.sqrt(result1 + result2) ;

        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in) ;
        System.out.println("Enter the vales of X :- ");
        int x =sc.nextInt();
        System.out.println("Enter the vales of Y :- ");
        int y =sc.nextInt();

        double z = distance(x,y);
        System.out.println("Euclidean distance is " +" "+ z);

    }

}


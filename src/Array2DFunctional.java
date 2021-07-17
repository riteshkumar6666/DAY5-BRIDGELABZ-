import java.util.Scanner;
public class Array2DFunctional {


    public static int array(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements :");
        int[][] table = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int elements = scan.nextInt();
                table[i][j] = elements;

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(table[i][j] + "    ");
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter nunber of Rows:-");
        int Rows = scan.nextInt();
        System.out.println("Enter number of Colums:-");
        int Colums = scan.nextInt();

        int z = array(Rows, Colums);


    }
}


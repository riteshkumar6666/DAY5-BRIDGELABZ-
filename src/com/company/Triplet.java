import java.util.Scanner;

public class Triplet {

    public static void main(String[] args) {
        int arr[] = new int[50];
        int n, m;
        Scanner scan = new Scanner(System.in);

        System.out.print("How Many Element You Want to Store in Array ? ");
        n = scan.nextInt();

        System.out.print("Enter " + n + " Element to Store in Array : ");
        for(m=0; m<n; m++)
        {
            arr[m] = scan.nextInt();
        }

        System.out.print("Elements in Array is :\n");

        for(m=0; m<n; m++)
        {
            System.out.print(arr[m] + "  ");

        }
        System.out.println("");


        int i,j,k,count=0;

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {

                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println(" ");
                        System.out.println("distinct triplets are " +arr[i] + " " + arr[j] + " " + arr[k] + " = 0");
                        count++;

                    }
                }
            }
        }
        if (count==0) {

            System.out.println("No.of Tripltes found...!");

        }

    }

}


import java.util.*;
class TwoByTwo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i,j,n,sum=0,sum1=0;
        System.out.println("Enter the dimension of the matrix : ");
        n = sc.nextInt();

        int mat[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix : ") ;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix : ") ;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum = sum + mat[i][j];
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                    if(i+j==n-1)
                    {
                        sum1 = sum1 + mat[i][j];
                    }
            }
        }
        System.out.println("SUM of  LEFT DIAGONAL elements of the matrix = "+sum1) ;
        System.out.println("SUM of  RIGHT DIAGONAL elements of the matrix = "+sum);
    }
}
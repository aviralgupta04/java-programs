import java.util.Scanner;
public class sum {
    static void print(int a[][])
    {
        for( int i = 0; i < a.length; i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
               System.out.print(a[i][j] + " "); 
            }
            System.out.println();
        }
    }
    static void add(int a[][],int r1, int c1, int b[][], int r2, int c2 )
    {
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("addition is not possible");
            return;
        
        }
        int add[][]= new int[r1][c1];
       for( int i = 0; i < r1; i++ )
       {
        for(int j=0; j< c1; j++)
        {
            add[i][j]= a[i][j] + b[i][j];

        }
       }
       System.out.println("addition of matrix is ");
              print(add);

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
          int  r1 = sc.nextInt();
          int  c1 = sc.nextInt();

            int[][] a= new int [r1][c1];
            for(int i= 0 ; i < a.length ; i++)
            {
                for( int j = 0; j < a[i].length; j++ )
                {
                    a[i][j]= sc.nextInt();
                }
            }
               int  r2 = sc.nextInt();
          int  c2 = sc.nextInt();

            int[][] b= new int [r2][c2];
            for(int i= 0 ; i < b.length ; i++)
            {
                for( int j = 0; j < b[i].length; j++ )
                {
                    b[i][j]= sc.nextInt();
                }
            }
            print(a);
            print(b);
            add(a, r1, c1, b, r2, c2 );


        

        }


    }


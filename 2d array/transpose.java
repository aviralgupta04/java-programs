import java.util.Scanner;
public class transpose {
     static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
     static void operation(int a[][], int r,int c)
     {
        for(int i= 0; i< r; i++)
        {
            for(int j=0; j< c;j++){
                a[i][j]=a[j][i];

            }
        }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows and columns");
        int r=sc.nextInt();
        int c= sc.nextInt();
        System.out.println("enter the matrix");
         int a[][] = new int[r][c];
         for(int i=0;i< a.length; i++)
         {
            for( int j=0; j< a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
         }
         operation(a,r,c);
         print(a);


     }
    
}

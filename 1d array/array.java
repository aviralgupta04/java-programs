import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter size of array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the number of elements in array");

        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}

import java.util.*;
public class fibo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no6");
        int n= sc.nextInt();
      System.out.println(fib( n));  

    }
            static int fib (int n)
        {
            if(n==0){
            return 0 ;
            }
            if(n==1)
            {
                return 1;
            }
            int ans = fib(n-1) + fib(n-2);
            return(ans);
        }}
           
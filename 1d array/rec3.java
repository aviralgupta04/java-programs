   import java.util.*;
public class rec3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        int y= sc.nextInt();
        int ans= gcd(x,y);
        System.out.println(ans);
    }
      static int gcd(int x, int y)
       {
          while(x%y!=0)
          {
            int rem = x%y;
            x=y;
            y=rem;
          }
          return y;
       }


    }
    
    

import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
       int n=sc.nextInt();
       System.out.println(fact(n));

    }
    
       static int fact(int n){
        if(n==0){
               return 1;
        }
       int small=  fact(n-1);
       int ans= n*small;
       return ans;

        

        }
    }



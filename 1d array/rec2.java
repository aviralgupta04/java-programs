import java.util.*;
public class rec2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
       int a= sum( n);
        System.out.println(a);

    }
            static int sum(int n)
        {
            if(n>=0 && n<=9){
            System.out.println(n);   
            return n;
        }
         int ans = sum(n/10)+ n% 10;
       return ans;


    }}
import java.util.*;
public class rec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sum( n);

    }
            static void sum(int n)
        {
            if(n==1){
            System.out.println(n);   
            return ;
        }
         sum(n-1);
        System.out.println(n);


    }}
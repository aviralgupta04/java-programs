import java.util.*;
public class method1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        average obj=new average();
         System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       
        int soln= obj.avg(a, b, c);
        System.out.println(soln);
    }
}
class average{
int avg(int a, int b, int c){
    int ans= (a+b+c)/3;
    return ans;

}

}

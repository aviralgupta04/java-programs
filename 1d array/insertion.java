import java.util.*;
public class insertion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insertion sort");
        int a[]={10,5,11,13,2,1,8};
    
       for(int i=0;i<a.length;i++){
        int key=a[i];
        int j=i-1;
        while(j >= 0 && key>a[j]){
            a[j+1]=a[j];
             j--;
        }
            a[j+1]=key;
       }
       System.out.println("sorted array");
       for(int val : a){
        System.out.println(val);
       }
    }}

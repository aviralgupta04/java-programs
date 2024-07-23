import java.util.Scanner;

public class equal {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int size = sc.nextInt();
   int[] arr= new int[size];
  
   for(int i=0;i<size;i++)
   {
    arr[i]=sc.nextInt();
    
   }
   int n= sc.nextInt();

   int[] arr1= new int[n];
   {
    for(int j=0;j<n;j++)
    {
        arr1[j]=sc.nextInt();
    }
   }
  int s=arr.length;
  int d=arr1.length;
  boolean result = true; // Declare the variable here
  
  if(s==d)
  {
    System.out.println("array length is same");
    for(int a=0;a<s;a++)
    {
       if(arr[a] != arr1[a]){
          result = false;
          break; // Exit the loop if elements are not equal
       }
    }
    
    if(result)
      System.out.println("Arrays are equal");
    else
      System.out.println("Arrays are not equal");
  }
} 
}

public class largest {
 
    
   static int large()
    {
        int arr[]={ 10, 39,23,13,23,343};
        int i;
        int c=arr[0];
        for(i=1;i<arr.length;i++)
        
            if(arr[i] > c)
            c=arr[i];
            return c;
           
        
        
    }
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + large());
        }
}
    


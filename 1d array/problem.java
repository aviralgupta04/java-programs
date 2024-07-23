public class problem{
    public static void main(String[] args) {
        int arr[]={10,10,20,20,40};
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    break;
                    
                }
            }
            System.out.println(arr[i]);
        }
       

    }
}
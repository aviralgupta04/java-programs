import java.util.Scanner;

class mergesort{
 static void conquer(int arr[], int p, int q ,int r){
  int n1= q-p+1; //p is right 
  //q is left 
  // r is mid
  int n2= r-q;
  int L[]= new int[n1];
  int R[]= new int[n2];
  for(int i=0;i<=n1;i++){
    
  }

 }
  static void divide(int arr[],int left,int right){
    if(left>=right){
      return;
    }
    int mid=(right+left)/2;
    divide(arr, right,mid);
    divide( arr,mid+1,left);
    conquer(arr,right,mid,left);
  }
   
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int arr[]={82,74,70,91,64};
    int n =arr.length;


  }
}
public class pattern5 {
    public static void main(String[] args) {
        System.out.println("pattern is ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int k= i+j;
                if(k%2==0){
               System.out.print("1");
               }
               else{
                System.out.print("0");
               }


            }
            System.out.println();
            
        }
    }
}

public class avi {
    public static void main(String[] args) {
           System.out.println("advance pattern");
           for(int i= 1;i<=5 ; i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println( );
           }
    }
}

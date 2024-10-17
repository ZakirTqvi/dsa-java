public class Butterfly {

    public static void buttergly_shape(int n){
         // 1st half
         
         //outer loop
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
         }

         // 2nd half

         // outer loop
         for(int i=n;i>=1;i--){
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
         }

    }

    public static void main(String[] args) {
        buttergly_shape(4);
    }
}
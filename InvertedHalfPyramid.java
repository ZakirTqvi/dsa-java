public class InvertedHalfPyramid {
    public static void inveted_hlaf_pyramid(int n){
         // outter loop for row
         for(int i=1;i<=n;i++){
            
         // loop for spaces
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }

         // loop for stars
         for(int k=1;k<=i;k++){
            System.out.print("*");
         }

         System.out.println();
        }
    }

    public static void main(String[] args) {
        inveted_hlaf_pyramid(5);
    }
}

public class Shape {
    public static void hollowRectangle(int totRow, int totCol){
         for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totCol;j++){
                if(i == 1|| i == totRow || j ==1 || j == totCol ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }
}

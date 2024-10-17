public class Inverted_halfPy_withNumbers {
    
    public static void generate(int n){
    //outer loop
      for(int i=1;i<=n;i++){
        
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }

        System.out.println();

        }
    }
    public static void main(String[] args) {

       generate(5);
    }
}

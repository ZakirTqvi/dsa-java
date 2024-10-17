public class DecimalToBinary {

    public static int DecimalToBinaryConvetor(int n){
        int pow = 0;
        int Decimal = 0;

        while(n>0){
            int rem = n%2;
            Decimal = Decimal + (rem*(int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        
        return Decimal;
    }
    public static void main(String[] args) {
     
        System.out.println(DecimalToBinaryConvetor(7));
   

    }
}

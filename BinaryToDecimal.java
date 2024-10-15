public class BinaryToDecimal {
    public static void binaryToDecimalConvertor(int binNum){
        
       int myNum = binNum;
       int Decimal = 0;
       int pow = 0;

       while(binNum > 0){
          int LastDigit = binNum % 10;
          Decimal = Decimal + (int)(LastDigit*Math.pow(2, pow));

          pow++;

          binNum = binNum/10;
       }

        System.out.println("Decimal of "+myNum+" is "+Decimal);
    }

    public static void main(String[] args) {
       binaryToDecimalConvertor(10111);
    }
}

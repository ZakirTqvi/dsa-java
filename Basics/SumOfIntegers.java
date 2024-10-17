public record SumOfIntegers() {
    
    public static int sum(int num){
        int sum =  0;
        int lastDigit = 0;

        while(num>0){
            lastDigit = num%10;
            sum += lastDigit;
            num = num /10;
        }

        return sum;
    }

    public static void main(String[] args) {
       
        System.out.println(sum(5321));
    }

}

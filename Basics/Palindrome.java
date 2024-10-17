public class Palindrome {
    public static void isPalindrome(int num){
        int myNum = num;
        int lastDigit = 0;
        int reverse = 0;

        while(num>0){
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10; 
        }

        if(myNum == reverse){
            System.out.println(myNum+" is a palindrome");
        } else{
            System.out.println(myNum+" is not a palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(-12101);
    }
}

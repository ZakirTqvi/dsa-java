public class Isprime {

    public static boolean checkPrime(int n) {

        if (n == 2) {

            return true;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
   
    public static void primeRange(int n){
        for(int i=1;i<=n;i++){

           if(checkPrime(i)) {
            System.out.print(i+" ");
           }
        }
    }

    public static void main(String[] args) {
        primeRange(100);

    }
}

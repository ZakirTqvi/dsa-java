package Array;

public class P1 {

    public static void demo(int number[], int score) {
        score = 32;
        for(int i=0;i<number.length;i++){
             number[i] = number[i] + 1;
        }
    }
    public static void main(String[] args) {
        int unchangeable = 12;
        int number[] = {12,4,5,6,2};
        demo(number, unchangeable);

        for(int i=0;i<number.length;i++){
           System.out.println(number[i]);
       }

       System.out.println(unchangeable);

    }
}

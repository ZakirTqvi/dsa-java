package Array;

import java.util.*;
public class LargestNumber {

    
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        System.out.println(largest);
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            } 
        }

        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {12,43,23,89,90,32};
        System.out.println("Largest number is:"+getLargest(numbers));
    }
}

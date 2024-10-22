package Array;

public class ReverseArray {
    
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            // swap
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;

            start ++;
            end  --;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3,7,8,9,4,7,9,5};
        reverseArray(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

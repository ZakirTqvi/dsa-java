package Array;
public class BinarySrch {
   
    public static int binarySrch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        

        while(start<=end){

            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,9,10,12,17,19,25};
        int key = 8;

        System.out.println(key+" is found at:"+binarySrch(numbers, key));
    }
}

package Array;

public class SubArrays {

    public static void subArrays(int arr[]){
       for(int i=0;i<arr.length;i++){
           int start = i;
           for(int j=i;j<arr.length;j++){
            int end = j;
            for(int k=start; k<=end;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,9,10}; 
        subArrays(numbers);
    }
}

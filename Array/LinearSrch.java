package Array;

public class LinearSrch {

    public static int linerSrch(int number[], int key){
         for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
         }

         return -1;
    }
    public static void main(String[] args) {

        int number[] = {12,54,23,44,33,89,90};
        int key = 44;
        key = linerSrch(number, key);
        if(key == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at index:"+key);
        }
    }
}

package Array;



class SmallestNumber {
    public static int getSmaller(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {32,54,22,37,90,6,9};
        System.out.println("Smallest number is:"+getSmaller(numbers));
    }
}

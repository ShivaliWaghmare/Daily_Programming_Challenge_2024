public class FindTheMissingInt{
    public static int findingTheInt(int[] arr){
        int n = arr.length + 1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }
        
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.print("Missing Number is: " + findingTheInt(arr));
    }
}
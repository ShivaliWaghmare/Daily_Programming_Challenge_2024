public class SortAnArray{
    public static void sortNum(int[] arrs){
        int start = 0;
        int mid = 0;
        int end = arrs.length - 1;
        while(mid <= end){
            if(arrs[mid] == 0){
                int temp = arrs[start];
                arrs[start] = arrs[mid];
                arrs[mid] = temp;
                start++;
                mid++;
            }else if(arrs[mid] == 1){
                mid++;
            }else{
                int temp = arrs[mid];
                arrs[mid] = arrs[end];
                arrs[end] = temp;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arrs = {0, 1, 2, 1, 0, 2, 1, 0};
        sortNum(arrs);
        for(int arr : arrs){
            System.out.print(arr + " ");
        }
    }
}
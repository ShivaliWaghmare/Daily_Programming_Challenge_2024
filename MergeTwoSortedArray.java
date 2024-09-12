public class MergeTwoSortedArray{
    public int[] mergeTwoSortedArray(int[] arr1, int m, int[] arr2, int n){
        int[] result = new int[m + n]; 
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while(i < m){
            result[k++] = arr1[i++];
        }

        while(j < n){
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int m = arr1.length;
        int n = arr2.length;

        MergeTwoSortedArray merge = new MergeTwoSortedArray();
        int[] mergedArray = merge.mergeTwoSortedArray(arr1, m, arr2, n);

        System.out.print("Merged Array: ");
        for(int num : mergedArray){
            System.out.print(num + " ");
        }
    }
}

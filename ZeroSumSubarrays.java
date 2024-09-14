import java.util.*;

public class ZeroSumSubarrays {

    public static List<int[]> findAllZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        
        int sum = 0;
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                List<Integer> startIndices = sumMap.get(sum);
                for (int startIndex : startIndices) {
                    result.add(new int[] { startIndex + 1, i });
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};

        List<int[]> zeroSumSubarrays = findAllZeroSumSubarrays(arr);

        for (int[] subarray : zeroSumSubarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}

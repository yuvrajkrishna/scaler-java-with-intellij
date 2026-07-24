public class maxSumSubarray {
    static int maxSumSubarr(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;

    }

    static void main() {
//        int arr[] = {1,-2,6,-1,3};
        int arr[] = {2,4,6,8,10};
        int ans = maxSumSubarr(arr);
        System.out.println(ans);
    }
}


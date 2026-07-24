public class maxSumSubArrayPrefix {
    public static int maxSumSubArray(int[] nums) {
        int currSum = 0 ;
        int max = Integer.MIN_VALUE;
        int prefix [] = new int [nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            int start  = i ;
            for(int j = i; j < nums.length; j++){
                int end = j ;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        return max;
    }

    static void main() {
        int nums [] = {1,-2,6,-1,3};
        int ans = maxSumSubArray(nums);
        System.out.println(ans);
    }
}

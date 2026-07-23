public class largestinarr {
    static int largestNumArr(int arr[] ){
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void main() {
        int arr[] = {2,10,20,5,8};
        int ans = largestNumArr(arr);
        System.out.println(ans);
    }
}

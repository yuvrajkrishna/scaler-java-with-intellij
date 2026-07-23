public class reverseArray {
    static void reverse (int arr[]){
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void main() {
        int arr[] = {2,4,6,8};
        reverse(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}

public class binarySearch {
    static int binarySearch(int arr[],int key){
       int start = 0 ;
       int end = arr.length-1;
       while(start <= end) {
           int mid = start + (end-start)/2;

           if(key == arr[mid]){
               return mid;
           }
           else if(arr[mid] < key){
               start = mid + 1;
           }
           else if(arr[mid] > key){
               end = mid - 1;
           }
       }
       return -1;
    }
    static void main (String [] args){
        int arr[] = {2,4,6,8 ,10};
        int key = 8;
        int ans = binarySearch(arr,key);
        System.out.println(ans);
    }
}


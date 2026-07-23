public class reversearr {
    static int linearSearch(int arr[],int key)
    {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int key = 4;
        int arr[] = {2,4,6,8,10};
        int ans = linearSearch(arr,key);
        System.out.println(ans);
    }
}

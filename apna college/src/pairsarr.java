public class pairsarr {
    static void pairsArr(int arr[]){
        int tp = 0;
        for(int i = 0 ; i < arr.length ; i++){

            for(int j = i+1 ; j < arr.length ; j++){
                    System.out.println("(" + arr[i] + " , " + arr[j] + ")");
                    tp++;
            }
        }
        
    }

    static void main() {
        int arr [] = {2,4,6,8,10};
        pairsArr(arr);
    }
}



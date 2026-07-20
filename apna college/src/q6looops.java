public class q6looops {
    static void main() {
        int num = 5;
        int factorial = 1;
        int i = 1;
        while(i <= num){
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}

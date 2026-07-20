import java.util.Scanner;

public class q3sumofnaturalnum {
    static void main() {
        System.out.println("Enter the number to get the sum till that number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1 ;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
